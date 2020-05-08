package clases;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
import clases.enumeradores.*;
import java.awt.Image;
import java.time.LocalDateTime;

public class Producto {

    protected String titulo;
    protected String descripcion;
    protected Categoria categoria;
    protected Estado estado;
    protected double precio;
    protected Image foto;
    protected LocalDateTime fechaPublicacion;
    protected int codigoPostalVendedor;
    protected boolean urgente;

    public Producto(String titulo, String descripcion, Categoria categoria, Estado estado, double precio, Image foto, boolean urgente) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        this.foto = foto;
        
        this.urgente = urgente;
    }
    
    

}
