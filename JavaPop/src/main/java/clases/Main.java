package clases;

import java.util.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Main {
    
    public static ArrayList register(ArrayList<Usuario> usuarios, EntradasPorConsola read){
        
        boolean continuar;
        
        System.out.println("Introduzca nombre y apellidos (qwerty para volver atras): ");
        String nombre = read.getString;
        System.out.println("Introduzca el correo con el que desea registrarse (qwerty para volver atras): ");
        String correo = read.getCorreo(">>");
        System.out.println("Introduzca la contraseña con la que desea registrarse (solo letras y numeros): ");
        String clave = read.getClave(">>");
        System.out.println("Introduzca su DNI (qwerty para volver atras): ");
        String dni = read.getString(">>");
        System.out.println("Introduzca su codigo postal: ");
        String ccpp = read.getString(">>");
        System.out.println("Introduzca los datos de su tarjeta de credito: ");
        String tarjetacredito = read.getString(">>");
        
    }

    private static ArrayList login(ArrayList<Usuario> usuarios, EntradasPorConsola read) {
        ArrayList arr = new ArrayList();
        boolean run_ = true;

        while (run_) {
            // Pide al usuario un correo
            System.out.println("Introduzca su correo (qwerty para volver atras):");
            String correo = read.getCorreo(">>");

            // Comprobamos que no se introduce el codigo de salida
            if (correo.equals("qwerty")) {
                arr.add(true);
                run_ = false;
            } else {
                arr.add(false);

                // Pide una contraseña
                System.out.println("Introduzca su clave:");
                String clave = read.getClave(">>");

                // Se comprueba que exista algún usuario con ese correo y contraseña
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).correo.equals(correo)) {
                        if (usuarios.get(i).clave.equals(clave)) {
                            arr.add(usuarios.get(i));
                            run_ = false;
                            break;
                        }
                    }
                }
                if (run_) {
                    System.out.println("¡¡Usuario o contraseña incorrecto!!");
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        // Comienzo del programa: Recuperamos la informacion guardada en los ficheros
        ArrayList<Usuario> usuarios = clases.GuardarLeerObjetos.leerUsuarios();
        ArrayList<Producto> productos = clases.GuardarLeerObjetos.leerProductos();

        // Usuario que opera con la aplicaion
        Usuario user;

        // Variables de lectura y comprobacion de estado
        EntradasPorConsola read = new EntradasPorConsola();
        ArrayList returns;
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

            } // Estado 1: Realizar el "inicio de sesion"
            else if (estado == 1) {
                
                System.out.println("Estado 1:");
                returns = login(usuarios, read);
                if ((boolean) returns.get(0)) {
                    estado = 0;    
                } else {
                    user = (Usuario) returns.get(1);
                    if (user instanceof Admin){
                        estado = 3;
                    } else {
                        estado = 4;
                    }
                }
            
            } // Estado 2: Realizar el "registro de usuario"
            else if (estado == 2) {
            
                System.out.println("estado 2");
                estado = 0;
            
            } // Estado 3: Menu principal del administrador
            else if (estado == 3) {
            
                System.out.println("estado 3");
                estado = 0;
            
            } // Estado 4: Menu principal del cliente
            else if (estado == 4) {
            
                System.out.println("estado 4");
                estado = 0;
            }
        }

        // Final del programa: Guardamos la informacion de vuelta en los ficheros
        GuardarLeerObjetos.guardarUsuarios(usuarios);
        GuardarLeerObjetos.guardarProductos(productos);
    }

}
