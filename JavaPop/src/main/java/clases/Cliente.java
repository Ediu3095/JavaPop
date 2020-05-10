package clases;

import clases.utils.ConsoleIO;
import java.io.Serializable;
import java.util.ArrayList;
import clases.enumeradores.*;
import javax.swing.Icon;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Cliente extends Usuario implements Serializable {

    protected ArrayList<Producto> productos;
    protected ArrayList<Venta> ventasNuevas;
    protected String dni;
    protected String nombre;
    protected int ccpp;
    protected String ttcc;

    public Cliente(Profesional p) {
        this.correo = p.correo;
        this.clave = p.clave;
        this.dni = p.dni;
        this.nombre = p.nombre;
        this.ccpp = p.ccpp;
        this.ttcc = p.ttcc;
        this.productos = p.productos;
        this.ventasNuevas = p.ventasNuevas;
    }

    public Cliente(String correo, String clave, String dni, String nombre, int ccpp, String ttcc) {
        this.correo = correo;
        this.clave = clave;
        this.dni = dni;
        this.nombre = nombre;
        this.ccpp = ccpp;
        this.ttcc = ttcc;
        this.productos = new ArrayList();
        this.ventasNuevas = new ArrayList();
    }

    public Cliente() {
        this.correo = "";
        this.clave = "";
        this.dni = "";
        this.nombre = "";
        this.ccpp = 0;
        this.ttcc = "";
        this.productos = new ArrayList();
        this.ventasNuevas = new ArrayList();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getccpp() {
        return ccpp;
    }

    public void setccpp(int ccpp) {
        this.ccpp = ccpp;
    }

    public String getTTCC() {
        return ttcc;
    }

    public void setTTCC(String ttcc) {
        this.ttcc = ttcc;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public ArrayList<Venta> getVentasNuevas() {
        return ventasNuevas;
    }

    public void displayVentas() {
        if (this.ventasNuevas.size() > 0) {
            System.out.println("Se vendieron algunos de tus productos!!");
            for (int i = 0; i < this.ventasNuevas.size(); i++) {
                System.out.println(this.ventasNuevas.get(i));
            }
            this.ventasNuevas.clear();
        }
    }

    /** <head>Esta función pide a traves de la consola todos los datos
     * necesarios para dar de alta un producto, como son el nombre, descripcion,
     * categoria, estado, precio y si la venta del producto es urgente o
     * no.</head>
     *
     * <body>
     *
     * @param user El usuario en al que le vamos a añadir el producto.
     * @param read Es un objeto que se utiliza para pedir los inputs y comprobar
     * si son correos o contraseñas validos.
     * @param productos Lista global de productos
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void altaProducto(Cliente user, ConsoleIO read, ArrayList<Producto> productos) {
        System.out.println("Introduzca un título del producto(qwerty para volver atras):");
        String titulo = read.getString(">> ");
        if (!titulo.equals("qwerty")) {
            System.out.println("Introduzca una descripción del producto:");
            String descripcion = read.getString(">> ");
            Categoria categoria = read.getCategoria(">> ");
            Estado estado = read.getEstado(">> ");
            System.out.println("Introduzca un precio:");
            Double precio = read.getDouble(">> ", 0, Double.MAX_VALUE);
            Icon imagen = read.getImage(">> ");
            System.out.println("¿Quiere marcar la venta de este producto como urgente?\n"
                    + "1.- Si\n"
                    + "2.- No");
            Boolean urgente = true;
            if (read.getInt(">> ", 1, 2) == 2) {
                urgente = false;
            }
            Producto producto = new Producto(titulo, descripcion, categoria, estado, precio, imagen, user, urgente);
            user.introducirProducto(producto);
            if (!productos.contains(producto)) {
                productos.add(producto);
            }
        }
    }

    public void introducirProducto(Producto p) {
        if (!this.productos.contains(p)) {
            this.productos.add(p);
        }
    }

    public void sacarProducto(Producto p) {
        try {
            this.productos.remove(p);
        } catch (Exception e) {
        }
    }

    public void cobrar(double precio) {
        // Aquí se efectuaria el cobro
        System.out.println("Se efectuó un cobro de " + precio + '€');
    }

    @Override
    public String toString() {
        return "correo: " + correo
                + "\nclave: " + clave
                + "\nproductos: " + productos
                + "\ndni: " + dni
                + "\nnombre: " + nombre
                + "\nccpp: " + ccpp
                + "\nttcc: " + ttcc;
    }

    /**
     * <p>
     * Esta función proporciona al cliente un menú donde buscar productos
     * ordenados alfabeticamente y le permite editar sus atributos como titulo, descripción
     * categoría, estado, foto , precio o el activar el producto como urgente. </p>
     *
     * <p>
     * Se solicitará al cliente el dato que decida editar y este se sustituirá
     * por el antiguo que poseía el producto</p>
     *
     * @param producto Es la lista de usuarios en la que se hace la
     * edición.
     * @param read Es un objeto que se utiliza para pedir los inputs 
     *
     * @author Luis Miguel Sobrino Zamora
     * 
     */
    
    public static void editarProducto(Cliente c, ArrayList<Producto> productosGlobal, ConsoleIO read) {
        Producto product = new Producto();
        ArrayList<Producto> producto = c.productos;
        int seleccionDato = 0;
        boolean run_ = true;
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion;
        boolean run__ = true;
        int categoria = 0;
        ArrayList<Producto> arr = new ArrayList();
        Categoria categoriaElegida = null;

        while (run_) {
            categoriaElegida = read.getCategoria(">> ");
            for (int i = 0; i < producto.size(); i++) {
                if (producto.get(i).categoria.equals(categoriaElegida)) {
                    arr.add(producto.get(i));
                }
            }
            while (run__) {
                System.out.println("Seleccione el producto que desea editar:\n"
                        + "1.- Pagina siguiente\n"
                        + "2.- Pagina anterior\n"
                        + "3.- Salir");
                for (int i = 1; i <= 10; i++) {
                    posicionMax = posicionMin + i - 1;
                    if (posicionMax < producto.size()) {
                        System.out.println((i + 3) + ".- " + producto.get(posicionMax).titulo);
                    } else {
                        posicionMax--;
                        break;
                    }
                }

                seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
                if (seleccion == 1) {
                    posicionMin += 10;
                    if (posicionMin >= producto.size()) {
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
                    product = producto.get(posicionMin + seleccion - 4);
                    run_ = false;
                }
            }

        }
        run_ = true;
        while (run_) {
            System.out.println(product);
            System.out.println("Que operación desea realizar:\n"
                    + "1.- Salir\n"
                    + "2.- Editar titulo\n"
                    + "3.- Editar descripcion\n"
                    + "4.- Editar categoria\n"
                    + "5.- Editar estado\n"
                    + "6.- Editar foto\n"
                    + "7.- Editar precio\n"
                    + "8.- Activar venta urgente");

            seleccionDato = read.getInt(">> ", 1, 8);

            switch (seleccionDato) {

                case 1: //Salir
                    return;

                case 2: //Editar titulo
                    System.out.println("Nuevo titulo del producto:");
                    String titulo = read.getString(">> ");
                    product.setTitulo(titulo);
                    break;

                case 3: //Editar descripcion
                    System.out.println("Nueva descripción del producto:");
                    String descripcion = read.getString(">> ");
                    product.setDescripcion(descripcion);
                    break;

                case 4: // Editar categoria
                    product.categoria = read.getCategoria(">> ");
                    break;

                case 5: // Editar estado
                    product.estado = read.getEstado(">> ");
                    break;

                case 6: //Editar foto
                    product.foto = read.getImage(">> ");
                    break;

                case 7: //Editar precio
                    product.precio = read.getDouble(">> ", 0, Double.MAX_VALUE);
                    break;

                case 8: // Activar urgente
                    product.toggleUrgente();
                    break;

                case 9: //Dar de baja producto
                    c.sacarProducto(product);
                    productosGlobal.remove(product);
                    return;
            }
        }
    }
}
