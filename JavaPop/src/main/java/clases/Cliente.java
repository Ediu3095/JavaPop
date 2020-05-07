package clases;

import java.io.Serializable;
import java.util.ArrayList;

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
    protected String ccpp;
    protected String ttcc;
    protected boolean profesional;

    public Cliente() {
        this.correo = "";
        this.clave = "";
        this.dni = "";
        this.nombre = "";
        this.ccpp = "";
        this.ttcc = "";
        this.productos = new ArrayList<>();
        this.profesional = false;
    }
    
    public Cliente(String correo, String clave, String dni, String nombre, String ccpp, String ttcc) {
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

    public String getccpp() {
        return ccpp;
    }

    public void setccpp(String ccpp) {
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
        return "correo=" + correo + "\nclave=" + clave + "\nproductos=" + productos + "\ndni=" + dni + "\nnombre=" + nombre + "\nccpp=" + ccpp + "\nttcc=" + ttcc + "\nprofesional=" + profesional;
    } 
}
