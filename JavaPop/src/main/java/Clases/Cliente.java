package Clases;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Cliente extends Usuario {
// Datos

    private static ArrayList<Productos> productos;
    protected String dni;
    protected String nombre;
    protected String ccpp;
    protected String ttcc;
    protected boolean profesional;

    public Cliente(String correo, String clave, String dni, String nombre, String ccpp, String ttcc) {
        super(correo, clave);
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

    public static ArrayList<Productos> getProductos() {
        return productos;
    }

    public static String introducirProducto(Producto p) {
        if (productos.contains(p)) {//si esta dentro
            return "El producto ya está a la venta";
        } else {
            productos.add(p);
            return "Producto añadido";
        }
    }

    public static String sacarProducto(Producto p) {
        if (!Cliente.getProductos().contains(p)) {//no esta dentro
            return "El prodcuto no se encuentra en venta";
        } else {
            Productos.remove(p);
            return "El producto " + p.getProductos() + " ha sido retirado: ";
        }
    }

}
