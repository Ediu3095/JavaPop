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

}
