package clases;

import clases.utils.CheckFunctions;
import java.io.Serializable;
import java.util.ArrayList;
import clases.enumeradores.*;
import java.util.Objects;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Cliente extends Usuario implements Serializable {

    protected ArrayList<Producto> productos;
    protected ArrayList<Venta> ventasNuevas;
    protected ArrayList<Venta> comprasConfirmadas;
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
        for (Producto producto: this.productos) {
            producto.setVendedor(this);
        }
    }

    public Cliente(String correo, String clave, String dni, String nombre, int ccpp, String ttcc) {
        this.correo = correo;
        this.clave = clave;
        this.dni = dni;
        this.nombre = nombre;
        this.ccpp = ccpp;
        this.ttcc = ttcc;
        this.productos = new ArrayList(0);
        this.ventasNuevas = new ArrayList(0);
        this.comprasConfirmadas = new ArrayList(0);
    }

    public Cliente() {
        this.correo = "";
        this.clave = "";
        this.dni = "";
        this.nombre = "";
        this.ccpp = 0;
        this.ttcc = "";
        this.productos = new ArrayList(0);
        this.ventasNuevas = new ArrayList(0);
        this.comprasConfirmadas = new ArrayList(0);
    }

    public ArrayList<Venta> getComprasConfirmadas() {
        return comprasConfirmadas;
    }

    public int getCcpp() {
        return ccpp;
    }

    public String getTtcc() {
        return ttcc;
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

    public int getCCPP() {
        return ccpp;
    }

    public void setCCPP(int ccpp) {
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

    /**Esta función pide a traves de la consola todos los datos
     * necesarios para dar de alta un producto, como son el nombre, descripcion,
     * categoria, estado, precio y si la venta del producto es urgente o
     * no.
     *
     * @param user El usuario en al que le vamos a añadir el producto.
     * @param read Es un objeto que se utiliza para pedir los inputs y comprobar
     * si son correos o contraseñas validos.
     * @param productos Lista global de productos
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public static void altaProducto(Cliente user, CheckFunctions read, ArrayList<Producto> productos) {
        System.out.println("Introduzca un título del producto(qwerty para volver atras):");
        String titulo = read.getString(">> ");
        if (!titulo.equals("qwerty")) {
            System.out.println("Introduzca una descripción del producto:");
            String descripcion = read.getString(">> ");
            Categoria categoria = read.getCategoria(">> ");
            Estado estado = read.getEstado(">> ");
            System.out.println("Introduzca un precio:");
            Double precio = read.getPrecioConsole(">> ");
            String imagen = read.getImage(">> ");
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

    /**
     * <p>
     * Esta función comprueba que el producto no se encuentre en la lista 
     * de productos, sino lo esta lo introduce</p>
     *
     * <p>
     * Cuando un cliente da de alta un producto, este se introduce
     * en la lista de productos en venta</p>
     *
     * @param p Es una instancia de la clase Productos que se pretende introducir a una lista de estos.
     *
     * @author Eduardo Ruiz Sabajanes
     * 
     */
    public void introducirProducto(Producto p) {
        if (!this.productos.contains(p)) {
            this.productos.add(p);
        }
    }

    /**
     * <p>
     * Esta función elimina el producto de la lista de productos, 
     * recogiendo los posibles errores que puedan surgir.</p>
     *
     * <p>
     * Cuando un cliente o el administrador da de baja un producto, este se 
     * retira de la lista de productos en venta</p> 
     *
     * @param p Es una instancia de la clase Productos que se pretende eliminar de la lista de estos.
     *
     * @author Eduardo Ruiz Sabajanes
     * 
     */
    public void sacarProducto(Producto p) {
        try {
            this.productos.remove(p);
        } catch (Exception e) {
        }
    }

    public void cobrar(double precio) {
        // Aquí se efectuaria un cobro
    }
    
    public void ingresar(double precio){
        // Aquí se efetuaría un ingreso
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
     * ordenados alfabeticamente y le permite editar sus atributos como titulo,
     * descripción, categoría, estado, foto , precio o el activar el producto
     * como urgente.</p>
     *
     * <p>
     * Se solicitará al cliente el dato que decida editar y este se sustituirá
     * por el antiguo que poseía el producto</p>
     *
     * @param c el cliente que quyiere editar sus productos
     * @param productosGlobal la lista global de productos
     * @param read Es un objeto que se utiliza para pedir los inputs 
     *
     * @author Luis Miguel Sobrino Zamora
     * 
     */
    public static void editarProducto(Cliente c, ArrayList<Producto> productosGlobal, CheckFunctions read) {
        ArrayList<Producto> productos = c.getProductos();
        ArrayList<Producto> arr = new ArrayList();
        Producto producto = new Producto();
        boolean run_ = true;
        int posicionMin = 0;
        int posicionMax = 0;
        Categoria cat;
        int seleccion;

        cat = read.getCategoria(">> ");
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria().equals(cat)) {
                arr.add(productos.get(i));
            }
        }
            
        while (run_) {
            System.out.println("Seleccione el producto que desea editar:\n"
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");
            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < arr.size()) {
                    System.out.println((i + 3) + ".- " + arr.get(posicionMax).getTitulo());
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) {
                posicionMin += 10;
                if (posicionMin >= productos.size()) {
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
                producto = arr.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }
        run_ = true;
        while (run_) {
            System.out.println(producto);
            System.out.println("Urgente: " + producto.isUrgente());
            System.out.println("Que operación desea realizar:\n"
                    + "1.- Salir\n"
                    + "2.- Editar titulo\n"
                    + "3.- Editar descripcion\n"
                    + "4.- Editar categoria\n"
                    + "5.- Editar estado\n"
                    + "6.- Editar foto\n"
                    + "7.- Editar precio\n"
                    + "8.- Activar venta urgente");

            seleccion = read.getInt(">> ", 1, 8);

            switch (seleccion) {
                case 1: //Salir
                    return;

                case 2: //Editar titulo
                    System.out.println("Nuevo titulo del producto:");
                    String titulo = read.getString(">> ");
                    producto.setTitulo(titulo);
                    break;

                case 3: //Editar descripcion
                    System.out.println("Nueva descripción del producto:");
                    String descripcion = read.getString(">> ");
                    producto.setDescripcion(descripcion);
                    break;

                case 4: // Editar categoria
                    producto.setCategoria(read.getCategoria(">> "));
                    break;

                case 5: // Editar estado
                    producto.setEstado(read.getEstado(">> "));
                    break;

                case 6: //Editar foto
                    producto.setFoto(read.getImage(">> "));
                    break;

                case 7: //Editar precio
                    System.out.println("Nuevo precio del producto:");
                    producto.setPrecio(read.getPrecioConsole(">> "));
                    break;

                case 8: // Activar urgente
                    producto.toggleUrgente();
                    break;

                case 9: //Dar de baja producto
                    c.sacarProducto(producto);
                    productosGlobal.remove(producto);
                    return;
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.productos);
        hash = 23 * hash + Objects.hashCode(this.ventasNuevas);
        hash = 23 * hash + Objects.hashCode(this.comprasConfirmadas);
        hash = 23 * hash + Objects.hashCode(this.dni);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + this.ccpp;
        hash = 23 * hash + Objects.hashCode(this.ttcc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.ccpp != other.ccpp) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ttcc, other.ttcc)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        if (!Objects.equals(this.ventasNuevas, other.ventasNuevas)) {
            return false;
        }
        if (!Objects.equals(this.comprasConfirmadas, other.comprasConfirmadas)) {
            return false;
        }
        return true;
    }

    
}
