package clases;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
import clases.enumeradores.*;
import java.io.Serializable;
import javax.swing.Icon;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.swing.ImageIcon;

public class Producto implements Serializable {

    protected String titulo;
    protected String descripcion;
    protected Categoria categoria;
    protected Estado estado;
    protected double precio;
    protected Icon foto;
    protected LocalDateTime fechaPublicacion;
    protected Cliente vendedor;
    protected boolean urgente;
    protected LocalDateTime fechaUrgente;

    //Estos atributos solo se utilizan en la busqueda de productos
    public int matchDeg;
    public int lejania;

    public Producto(String titulo, String descripcion, Categoria categoria, Estado estado, double precio, Icon foto, Cliente vendedor, boolean urgente) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        this.foto = foto;
        this.fechaPublicacion = LocalDateTime.now();
        this.vendedor = vendedor;
        this.urgente = urgente;
        this.matchDeg = 0;
        this.lejania = 0;
        if (urgente) {
            this.fechaUrgente = LocalDateTime.now();
        }
    }

    public Producto() {
        this.titulo = "";
        this.descripcion = "";
        this.categoria = Categoria.Consolas_y_videojuegos;
        this.estado = Estado.Aceptable;
        this.precio = 0;
        this.foto = new ImageIcon();
        this.fechaPublicacion = LocalDateTime.now();
        this.vendedor = new Cliente();
        this.urgente = false;
        this.matchDeg = 0;
        this.lejania = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public Cliente getVendedor() {
        return vendedor;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void toggleUrgente() {
        if (!this.urgente) {
            this.urgente = true;
            fechaUrgente = LocalDateTime.now();
            this.vendedor.cobrar(5);
        }
    }

    @Override
    public String toString() {
        return "titulo: " + titulo
                + "\ndescripcion: " + descripcion
                + "\ncategoria: " + categoria
                + "\nestado: " + estado
                + "\nprecio: " + precio
                + "\nfoto: " + foto
                + "\nfechaPublicacion: " + fechaPublicacion
                + "\nvendedor: " + vendedor.correo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.categoria);
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (this.categoria != other.categoria) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return true;
    }

}
