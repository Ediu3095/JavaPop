package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.awt.Image;
import clases.enumeradores.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Cliente extends Usuario implements Serializable {
// Datos

    protected ArrayList<Producto> productos;
    protected String dni;
    protected String nombre;
    protected int ccpp;
    protected String ttcc;
    protected boolean profesional;

    public Cliente() {
        this.correo = "";
        this.clave = "";
        this.dni = "";
        this.nombre = "";
        this.ccpp = 0;
        this.ttcc = "";
        this.productos = new ArrayList<>();
        this.profesional = false;
    }
    
    public Cliente(String correo, String clave, String dni, String nombre, int ccpp, String ttcc) {
        this.correo = correo;
        this.clave = clave;
        this.dni = dni;
        this.nombre = nombre;
        this.ccpp = ccpp;
        this.ttcc = ttcc;
        this.productos = new ArrayList<>();
        this.profesional = false;
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

    public boolean isProfesional() {
        return profesional;
    }

    public void setProfesional(boolean Profesional) {
        this.profesional = Profesional;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    /**<head>.</head>
     *
     * <body>
     * <p>.</p>
     *
     * @param user:
     * @param read:
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public static void altaProducto(Cliente user, EntradasPorConsola read){
        System.out.println("Introduzca un título del producto: ");
        String titulo = read.getString(">> ");
        System.out.println("Introduzca una descripción del producto: ");
        String descripcion = read.getString(">> ");
        System.out.println("Introduzca una categoría: ");
        Categoria categoria = read.getCategoria();
        System.out.println("Introduzca un estado: ");
        Estado estado = read.getEstado();
        System.out.println("Introduzca un precio: ");
        Double precio = read.getDouble(">> ",0 , Double.MAX_VALUE);
        System.out.println("Introduzca la dirección en su ordenador de una foto del producto: ");
        Image icon = read.;
        System.out.println("¿Quiere marcar la venta de este producto como urgente?\n"
                + "");
        String ttcc = read.getString(">> ");
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

    @Override
    public String toString() {
        return "correo=" + correo + "\n"
                + "clave=" + clave + "\n"
                + "productos=" + productos + "\n"
                + "dni=" + dni + "\n"
                + "nombre=" + nombre + "\n"
                + "ccpp=" + ccpp + "\n"
                + "ttcc=" + ttcc + "\n"
                + "profesional=" + profesional;
    } 
}
