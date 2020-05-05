package clases;

import java.util.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Main {

    public static ArrayList register(ArrayList<Usuario> usuarios, EntradasPorConsola read) {

        ArrayList arr = new ArrayList();
        arr.add(false);
        arr.add(new Cliente());
        boolean run_ = true;
        boolean run__ = true;
        while (run_) {

            //Solicita al usuario un correo
            System.out.println("Introduzca el correo con el que desea registrarse (qwerty para volver atras):");
            String correo = read.getString(">> ");

            // Comprobamos el codigo de salida
            if (correo.equals("qwerty")) {
                arr.set(0, true);
                run_ = false;

                // Comprobamos que el correo sea valido
            } else if (read.checkCorreo(correo)) {
                arr.set(0, false);
                run_ = false;

                //Comprobamos que no haya otro usuario con el mismo correo y solicitamos sus datos en caso de que sea válido
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).correo.equals(correo)) {
                        run_ = true;
                        break;
                    }
                }

                // Si el correo ya pertenece a un usuario...
                if (run_){
                    System.out.println("Usuario existente, introduzca un correo no registardo");
                
                }// Si el correo está disponible...
                else {
                    while (run__) {

                        // Pide una contraseña y comprueba si es valida...
                        System.out.println("Introduzca la clave con la que desea registrarse (solo letras y numeros):");
                        String clave = read.getString(">> ");

                        // Si la contraseña es valida pide el resto de datos y crea el usuario
                        if (read.checkClave(clave)) {
                            System.out.println("Introduzca nombre y apellidos:");
                            String nombre = read.getString(">> ");
                            System.out.println("Introduzca su DNI:");
                            String dni = read.getString(">> ");
                            System.out.println("Introduzca su codigo postal:");
                            String ccpp = read.getString(">> ");
                            System.out.println("Introduzca los datos de su tarjeta de credito:");
                            String ttcc = read.getString(">> ");
                            Cliente c1 = new Cliente(correo, clave, nombre, dni, ccpp, ttcc);
                            usuarios.add(c1);
                            arr.set(1, c1);
                            run__ = false;

                        }// Si la contraseña no es valida pide una nueva.
                        else {
                            System.out.println("La clave introducida no es valida");
                        }
                    }
                }
                // Si el correo no es valido...
            } else {
                System.out.println("¡¡El correo no es valido!!");
            }
        }
        return arr;
    }
    
    /**Esta función pide a traves de la consola un usuario y una contraseña y
     * comprueba si existe algún usuario que tenga esas credenciales en una lista
     * de usuarios.
     * 
     * La función pedirá un correo hasta que se introduzca hasta que se introduzca
     * un correo válido y después se pedirá una contraseña hasta que se introduzca
     * una contraseña valida. Además se repetirá este proceso hasta que se introduzca
     * la clave de salida "qwerty" como correo o hasta que se den unos credenciales
     * pertenecientes a algún usuario de la lista con la que se compara.
     *
     * @parameter usuarios: Es la lista de usuarios en la que se hace la comprobacion.
     * @parameter read: Es un objeto que se utiliza para pedir los imputs y comprobar
     * si son correos o contraseñas validos.
     * 
     * @returns: La funcion devuelve un ArrayList con un booleano que indica si
     * se ha introducido el código de salida o no, y el usuario que se haya obtenido
     * como coincidente con los credenciales introducidos.
     * 
     * @author Eduardo Ruiz Sabajanes
     * @author Luis Miguel Sobrino Zamora
     */
    private static ArrayList login(ArrayList<Usuario> usuarios, EntradasPorConsola read) {
        ArrayList arr = new ArrayList();
        arr.add(false);
        arr.add(new Cliente());
        boolean run_ = true;

        while (run_) {
            // Pide al usuario un correo
            System.out.println("Introduzca su correo (qwerty para volver atras):");
            String correo = read.getString(">> ");

            // Comprobamos que no se introduce el codigo de salida
            if (correo.equals("qwerty")) {
                arr.set(0, true);
                run_ = false;
            } else if (read.checkCorreo(correo)) {
                arr.set(0, false);

                // Pide una contraseña
                System.out.println("Introduzca su clave:");
                String clave = read.getString(">> ");
                
                // Si la contrasseña es valida
                if (read.checkClave(clave)){
                    // Se comprueba que exista algún usuario con ese correo y contraseña
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).correo.equals(correo)) {
                            if (usuarios.get(i).clave.equals(clave)) {
                                arr.set(1, usuarios.get(i));
                                run_ = false;
                                break;
                            }
                        }
                    }
                }
                if (run_) {
                    System.out.println("¡¡Usuario o clave incorrectos!!");
                }
            } else {
                System.out.println("¡¡El correo no es valido!!");
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
                operacion = read.getInt(">> ", 1, 3);
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
                        for (int i = 0; i<usuarios.size(); i++){
                            System.out.println(usuarios.get(i).correo);
                        }
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
                    if (user instanceof Admin) {
                        estado = 3;
                    } else {
                        estado = 4;
                    }
                }

            } // Estado 2: Realizar el "registro de usuario"
            else if (estado == 2) {

                System.out.println("Estado 2");
                returns = register(usuarios, read);
                if ((boolean) returns.get(0)) {
                    estado = 0;
                } else {
                    user = (Usuario) returns.get(1);
                    estado = 4;
                }

            } // Estado 3: Menu principal del administrador
            else if (estado == 3) {

                System.out.println("Estado 3");
                estado = 0;

            } // Estado 4: Menu principal del cliente
            else if (estado == 4) {

                System.out.println("Estado 4");
                estado = 0;
            }
        }

        // Final del programa: Guardamos la informacion de vuelta en los ficheros
        GuardarLeerObjetos.guardarUsuarios(usuarios);
        GuardarLeerObjetos.guardarProductos(productos);
    }

}
