package clases;

import java.io.Serializable;
import java.time.LocalDateTime;
import clases.Cliente;

/**
 *
 * @author Luis Miguel Sobrino Zamora
 * @author Eduardo Ruiz Sabajanes
 */
public class Venta implements Serializable {

    protected Cliente comprador;
    protected Producto producto;
    protected LocalDateTime fechaVenta;
    
    public Venta(Cliente comprador, Producto producto) {
        this.comprador = comprador;
        this.producto = producto;
        this.fechaVenta = LocalDateTime.now();
    }

    public Venta() {
        this.comprador = new Cliente();
        this.producto = new Producto();
        this.fechaVenta = LocalDateTime.now();
    }
    
    public Cliente getComprador() {
        return comprador;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public void setProducto(Producto prod) {
        this.producto = prod;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor: " + producto.getVendedor().getCorreo()
                + "\ncomprador: " + comprador.getCorreo()
                + "\ntitulo: " + producto.getTitulo()
                + "\nestado: " + producto.getEstado()
                + "\ncategoria: " + producto.getCategoria()
                + "\nfoto: " /*+ producto.getFoto()*/
                + "\nprecio: " + producto.getPrecio()
                + "\ndescripcion: " + producto.getDescripcion() 
                + "\nfechaVenta: " + fechaVenta + '}';
    }

   

}