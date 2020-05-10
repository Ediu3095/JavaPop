package clases;

import java.io.Serializable;
import clases.enumeradores.*;
import javax.swing.Icon;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Miguel Sobrino Zamora
 */
public class Venta implements Serializable {

    protected String vendedor;
    protected String comprador;
    protected String titulo;
    protected Estado estado;
    protected Categoria categoria;
    protected Icon foto;
    protected LocalDateTime fechaVenta;
    protected double precio;
    protected String descripcion;

    public Venta(String comprador, Producto producto) {
        this.vendedor = producto.vendedor.correo;
        this.comprador = comprador;
        this.titulo = producto.titulo;
        this.estado = producto.estado;
        this.categoria = producto.categoria;
        this.foto = producto.foto;
        this.fechaVenta = LocalDateTime.now();
        this.precio = producto.precio;
        this.descripcion = producto.descripcion;
    }

    public Venta() {
        this.vendedor = "";
        this.comprador = "";
        this.titulo = "";
        this.estado = Estado.Aceptable;
        this.categoria = Categoria.Consolas_y_videojuegos;
        this.foto = new ImageIcon();
        this.fechaVenta = LocalDateTime.now();
        this.precio = 0;
        this.descripcion = "";
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getComprador() {
        return comprador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Estado getEstado() {
        return estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Icon getFoto() {
        return foto;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor: " + vendedor
                + "\ncomprador: " + comprador
                + "\ntitulo: " + titulo
                + "\nestado: " + estado
                + "\ncategoria: " + categoria
                + "\nfoto: " + foto
                + "\nfechaVenta: " + fechaVenta
                + "\nprecio: " + precio
                + "\ndescripcion: " + descripcion + '}';
    }

}
