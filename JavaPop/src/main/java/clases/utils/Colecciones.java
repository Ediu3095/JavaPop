package clases.utils;

import clases.Cliente;
import clases.Producto;
import clases.Venta;
import java.util.ArrayList;

/**
 *<p> Clase que almacena las colecciones de datos que utiliza javapop para hacer
 * el seguimiento de los usuarios, productos y ventas.</p>
 * 
 * @author Eduardo Ruiz Sabajanes
 */
public class Colecciones {
    
    public static ArrayList<Cliente> usuarios = new ArrayList(0);
    public static ArrayList<Producto> productos = new ArrayList(0);
    public static ArrayList<Venta> ventas = new ArrayList(0);
    
}
