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

        // Variables utiles
        EntradasPorConsola read = new EntradasPorConsola();
        int operacion;
        int estado = 0;
        boolean finalizar = false;
        
        // Bucle principal del programa
        while (!finalizar) {
            
            // Estado 0: Elegir entre "inicio de sesion" y "registrarse"
            if (estado == 0) {
                
                // Pedimos al usuario que seleccione una operacion a realizar
                System.out.println("¿Que operacion desea realizar?\n1.- Iniciar sesion\n2.- Registrarse\n3.- Salir");
                operacion = read.getInt(">>", 1, 3);
                System.out.println();
                
                // Ejecutamos esa operacion
                switch (operacion) {
                    case 1:
                        // Saltamos al estado 1
                        estado = 1;
                        break;
                    case 2:
                        // Saltamos al estado 2
                        estado = 2;
                        break;
                    case 3:
                        // Salimos del bucle principal
                        finalizar = true;
                        break;
                }
                
            } 
            // Estado 1: Realizar el "inicio de sesion"
            else if (estado == 1) {
                System.out.println("estado 1");
                estado = 0;
            }
            // Estado 2: Realizar el "registro de usuario"
            else if (estado == 2) {
                System.out.println("estado 2");
                estado = 0;
            }
        }

    // Final del programa: Guardamos la informacion de vuelta en los ficheros
    GuardarLeerObjetos.guardarUsuarios (usuarios);
    GuardarLeerObjetos.guardarProductos (productos);
    }

}
