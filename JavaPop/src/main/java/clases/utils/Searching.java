package clases.utils;

import clases.Cliente;
import clases.Producto;
import clases.Venta;
import clases.enumeradores.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class Searching {

    // Incluir urgencia
    public static void merge(ArrayList<Producto> arr, int i1, int i2, int j1, int j2) {
        Producto aux;
        do {
            if (arr.get(i1).matchDeg < arr.get(j1).matchDeg) {
                aux = arr.get(j1);
                arr.remove(j1);
                arr.add(i1, aux);
                i1++;
                j1++;
            } else if (arr.get(i1).matchDeg == arr.get(j1).matchDeg) {
                if (arr.get(i1).lejania > arr.get(j1).lejania) {
                    aux = arr.get(j1);
                    arr.remove(j1);
                    arr.add(i1, aux);
                    i1++;
                    j1++;
                } else if (arr.get(i1).lejania <= arr.get(j1).lejania) {
                    i1++;
                }
            } else if (arr.get(i1).matchDeg > arr.get(j1).matchDeg) {
                i1++;
            }
        } while (i1 <= i2 && j1 <= j2);
    }

    public static void sort(ArrayList<Producto> arr, int i, int j) {
        if (!(i == j)) {
            int middle = (i + j) / 2;

            sort(arr, i, middle);
            sort(arr, middle + 1, j);

            merge(arr, i, middle, middle + 1, j);
        }
    }

    public static void updateTags(Cliente user, Producto prod, String[] kWords){
        String[] tWords = prod.getTitulo().split(" ");
        
        prod.matchDeg = 0;
        if (user.getccpp() > prod.getVendedor().getccpp()){
            prod.lejania = user.getccpp() - prod.getVendedor().getccpp();
        } else {
            prod.lejania = prod.getVendedor().getccpp() - user.getccpp();
        }
        
        for (int i = 0; i<tWords.length; i++){
            for (int j = 0; j<kWords.length; j++){
                if (tWords[i].equals(kWords[j])){
                    prod.matchDeg++;
                }
            }
        }
    }
    
    public static void comprar(Cliente user, ArrayList<Producto> productos, ArrayList<Venta> ventas, EntradasPorConsola read) {
        ArrayList<Producto> prodDefinitivo = new ArrayList();
        Producto producto = new Producto();
        Categoria cat;
        boolean run_ = true;
        String[] keyWords;
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion;

        cat = read.getCategoria(">> ");

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria() == cat) {
                if (!productos.get(i).getVendedor().equals(user)) {
                    prodDefinitivo.add(productos.get(i));
                }
            }
        }
        
        System.out.println("Introduzca una cadena de palabras clave que buscar:");
        keyWords = read.getString(">>").split(" ");
        
        for (int i = 0; i<prodDefinitivo.size(); i++){
            updateTags(user, prodDefinitivo.get(i), keyWords);
        }

        sort(prodDefinitivo, 0, prodDefinitivo.size() - 1);

        while (run_) {
            System.out.println("Seleccione el producto que desea comprar:\n "
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");

            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < prodDefinitivo.size()) {
                    System.out.println((i + 3) + ".- " + prodDefinitivo.get(posicionMax).getTitulo());
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) {
                posicionMin += 10;
                if (posicionMin >= prodDefinitivo.size()) {
                    posicionMin -= 10;
                }
            } else if (seleccion == 2) {
                posicionMin -= 10;
                if (posicionMin <= 0) {
                    posicionMin += 10;
                }
            } else if (seleccion == 3) {
                return;
            } else {
                producto = prodDefinitivo.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }

        run_ = true;
        while (run_) {
            System.out.println(producto);
            System.out.println("Que operación desea realizar:\n "
                    + "1.- Salir\n"
                    + "2.- Comprar");
            seleccion = read.getInt(">> ", 1, 2);
            switch (seleccion) {
                case 1: //Salir
                    return;

                case 2: //Efectuar compra
                    producto.getVendedor().sacarProducto(producto);
                    productos.remove(producto);
                    Venta venta = new Venta(user.getCorreo(), producto);
                    ventas.add(venta);
                    user.getVentasNuevas().add(venta);
                    user.cobrar(producto.getPrecio());
                    break;

            }
        }
    }
}
