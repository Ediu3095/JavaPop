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

public class Producto implements Serializable{

    protected String titulo;
    protected String descripcion;
    protected Categoria categoria;
    protected Estado estado;
    protected double precio;
    protected Icon foto;
    protected LocalDateTime fechaPublicacion;
    protected Cliente vendedor;
    protected boolean urgente;

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
    }
    
    

}
