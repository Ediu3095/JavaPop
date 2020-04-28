package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario {
// Datos

    private static ArrayList<Productos> productos = new ArrayList<Productos>();
    private static int numero = 0;
    protected String dni;
    protected String nombre;
    protected String ccpp;
    protected String ttcc;
    protected boolean profesional;

    public Cliente() {
        this.dni = "";
        this.nombre = "";
        this.ccpp = "";
        this.ttcc = "";
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

    public static String introducirProducto(Productos p) {
        if (productos.contains(p)) {//si esta dentro
            return "El producto ya está a la venta";
        } else {
            numero++;
            productos.add(p);
            return "Producto añadido";
        }
    }

    public static String sacarProducto(Producto p) {
        if (!Cliente.getProductos().contains(p)) {//no esta dentro
            return "El prodcuto no se encuentra en venta";
        } else {
            numero--;
            Productos.remove(p);
            return "El producto " + p.getProductos() + " ha sido retirado: ";
        }
    }

}
