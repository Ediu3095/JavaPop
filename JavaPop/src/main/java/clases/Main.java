package clases;

import java.util.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Main {

    public static void main(String[] args) {

        // Comienzo del programa: Recuperamos la informacion guardada en los ficheros
        ArrayList<Usuario> usuarios = clases.GuardarLeerObjetos.leerUsuarios();
        ArrayList<Producto> productos = clases.GuardarLeerObjetos.leerProductos();

        // Logica del programa
        // Login-Register...
        
        // Final del programa: Guardamos la informacion de vuelta en los ficheros
        GuardarLeerObjetos.guardarUsuarios(usuarios);
        GuardarLeerObjetos.guardarProductos(productos);
    }

}
