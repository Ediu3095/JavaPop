package clases;

import clases.utils.EntradasPorConsola;
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
    
    public Cliente(Profesional p){
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

    public void displayVentas(){
        if (this.ventasNuevas.size() > 0){
            System.out.println("Se vendieron algunos de tus productos!!");
            for(int i = 0; i<this.ventasNuevas.size(); i++){
                System.out.println(this.ventasNuevas.get(i));
            }
            this.ventasNuevas.clear();
        }
    }
    
    /**<head>Esta función pide a traves de la consola todos los datos necesarios
     * para dar de alta un producto, como son el nombre, descripcion, categoria,
     * estado, precio y si la venta del producto es urgente o no.</head>
     *
     * <body>
     * @param   user
     *          El usuario en al que le vamos a añadir el producto.
     * 
     * @param   read
     *          Es un objeto que se utiliza para pedir los inputs y
     *          comprobar si son correos o contraseñas validos.
     *
     * @author  Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void altaProducto(Cliente user, EntradasPorConsola read, ArrayList<Producto> productos){
        System.out.println("Introduzca un título del producto(qwerty para volver atras): ");
        String titulo = read.getString(">> ");
        if (!titulo.equals("qwerty")) {
            System.out.println("Introduzca una descripción del producto: ");
            String descripcion = read.getString(">> ");
            Categoria categoria = read.getCategoria(">> ");
            Estado estado = read.getEstado(">> ");
            System.out.println("Introduzca un precio: ");
            Double precio = read.getDouble(">> ",0 , Double.MAX_VALUE);
            Icon imagen = read.getImage(">> ");
            System.out.println("¿Quiere marcar la venta de este producto como urgente?\n"
                    + "1.- Si\n"
                    + "2.- No");
            Boolean urgente = true;
            if (read.getInt(">> ", 1, 2) == 2){
                urgente = false;
            }
            Producto producto = new Producto(titulo, descripcion, categoria, estado, precio, imagen, user, urgente);
            user.introducirProducto(producto);
            if (!productos.contains(producto)){
                productos.add(producto);
            }
        }
    }
    
    public String introducirProducto(Producto p) {
        if (this.productos.contains(p)) {//si esta dentro
            return "El producto ya está a la venta";
        } else {
            this.productos.add(p);
            return "Producto añadido";
        }
    }

    public String sacarProducto(Producto p) {
        if (!this.productos.contains(p)) { // no esta dentro
            return "El prodcuto no se encuentra en venta";
        } else {
            this.productos.remove(p);
            return "El producto " + p + " ha sido retirado: ";
        }
    }
    
    public void cobrar(double precio){
        // Something
    }

    @Override
    public String toString() {
        return "correo=" + correo + "\n"
                + "clave=" + clave + "\n"
                + "productos=" + productos + "\n"
                + "dni=" + dni + "\n"
                + "nombre=" + nombre + "\n"
                + "ccpp=" + ccpp + "\n"
                + "ttcc=" + ttcc;
    }
}
