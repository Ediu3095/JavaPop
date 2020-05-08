package clases;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
import java.util.ArrayList;
import clases.enumeradores.*;
import java.io.Serializable;
import javax.swing.Icon;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

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
    }


}
