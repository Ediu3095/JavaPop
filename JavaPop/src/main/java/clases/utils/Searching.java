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

    /** <head>
     * <p>
     * Fusiona los elementos de 2 "sublistas" (indicamos las sublistas a través
     * de 2 index que marcan el inicio y el final de la sublista) de forma que
     * queden organizados <b>de mayor a menor grado de coincidencia</b> (o
     * matchDeg) y <b>de menor a mayor distancia</b> (para los elementos con el
     * mismo grado de coincidencia).</p></head>
     *
     * <body>
     *
     * @param arr ArrayList de productos que ordenar
     * @param i1 index que marca el principio del primer grupo que fusionar
     * @param i2 index que marca el final del primer grupo que fusionar
     * @param j1 index que marca el principio del segundo grupo que fusionar
     * @param j2 index que marca el final del segundo grupo que fusionar
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void merge(ArrayList<Producto> arr, int i1, int i2, int j1, int j2) { // Incluir urgencia
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

    /** <head>
     * <p>
     * Ordena la primera mitad de la sublista y luego ordena la segunda mitad de
     * la sublista para finalmente fusionarlas dando lugar a una lista
     * ordenada.</p></head>
     *
     * <body>
     *
     * @param arr ArrayList de productos que ordenar
     * @param i index que marca el principio de la sublista que ordenar
     * @param j index que marca el final de la sublista que ordenar
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void sort(ArrayList<Producto> arr, int i, int j) {
        if (!(i == j) && arr.size() > 0) {
            int middle = (i + j) / 2;

            sort(arr, i, middle);
            sort(arr, middle + 1, j);

            merge(arr, i, middle, middle + 1, j);
        }
    }

    /** <head>
     * <p>
     * Actualiza el grado de coincidencia (o matchDeg) con respecto a un array
     * de palabras clave y la lejanía de un producto con respecto a un
     * usuario.</p>
     *
     * <p>
     * El grado de coincidencia guarda el número de palabras que coinciden entre
     * las palabras clave y el título del producto.</p>
     *
     * <p>
     * La lejanía es el valor absoluto de la diferencia entre el codigo postal
     * del vendedor y el codigo postal del comprador.</p></head>
     *
     * <body>
     *
     * @param user usuario que está comprando productos con respecto al cual se
     * actualiza la lejanía
     * @param prod producto del que vamos a actualizar los parametros utilizados
     * en la busqueda
     * @param kWords palabras clave con respecto a las cuales se actualiza el
     * grado de coincidencia
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void updateTags(Cliente user, Producto prod, String[] kWords) {
        String[] tWords = prod.getTitulo().split(" ");

        prod.matchDeg = 0;
        if (user.getccpp() > prod.getVendedor().getccpp()) {
            prod.lejania = user.getccpp() - prod.getVendedor().getccpp();
        } else {
            prod.lejania = prod.getVendedor().getccpp() - user.getccpp();
        }

        for (int i = 0; i < tWords.length; i++) {
            for (int j = 0; j < kWords.length; j++) {
                if (tWords[i].equals(kWords[j])) {
                    prod.matchDeg++;
                }
            }
        }
    }

    /** <head><p>
     * Se le pide por consola al usuario que introduzca una categoría y unas
     * palabras clave y se le muestran todos los productos de dicha categoría en
     * orden decreciente de coincidencia con esas palabras clave primero y en
     * orden creciente de lejanía después.</p>
     *
     * <p>
     * Los productos se muestran en grupos de diez a través de los cuales el
     * usuario puede navegar y además se puede seleccionar un producto tras lo
     * cual se le dará la opción al cliente de comprar el producto o de salir de
     * la busqueda de productos.</p></head>
     *
     * <body>
     *
     * @param user el usuario que va a efectuar la compra
     * @param productos la lista global de productos
     * @param ventas la lista global de ventas
     * @param read un objeto para pedir entradas por consola al usuario
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void comprar(Cliente user, ArrayList<Producto> productos, ArrayList<Venta> ventas, ConsoleIO read) {
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

        for (int i = 0; i < prodDefinitivo.size(); i++) {
            updateTags(user, prodDefinitivo.get(i), keyWords);
        }

        sort(prodDefinitivo, 0, prodDefinitivo.size() - 1);

        while (run_) {
            System.out.println("Seleccione el producto que desea comprar:\n"
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
                producto = (Producto) prodDefinitivo.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }

        run_ = true;
        while (run_) {
            System.out.println(producto.toString());
            System.out.println("Que operación desea realizar:\n"
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
                    return;
            }
        }
    }
}
