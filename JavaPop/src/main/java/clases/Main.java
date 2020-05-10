package clases;

import clases.utils.IOCustomLib;
import clases.utils.ConsoleIO;
import clases.utils.Searching;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Main {

    /**
     * <p>
     * Esta función solicita un nombre de usuario, una contraseña y demás datos
     * del usuario (nombre y appelidos,DNI,tarjeta de credito y codigo postal
     * Comprueba que no exista un usuario ya creado con el nombre de usuario
     * introducido</p>
     *
     * <p>
     * Se solicitara un correo al usuario hasta que se compruebe que el correo
     * es válido y se esperará a que introduzca una contraseña que cumpla los
     * requisitos. Este proceso se repetirá hasta que se complete el registro o
     * el usuario salga de la funcion.</p>
     *
     * @param usuarios Es la lista de usuarios en la que se hace la
     * comprobacion.
     * @param read Es un objeto que se utiliza para pedir los inputs y comprobar
     * si son correos o contraseñas validos.
     *
     * @return La funcion devuelve un ArrayList formado en cuya primera posicion
     * se encuentra un booleano que nos dice si hay o no un registro y , en
     * segunda posicion nos devuelve un objeto Cliente creado con los datos
     * previamente introducidos.
     *
     * @author Eduardo Ruiz Sabajanes
     * @author Luis Miguel Sobrino Zamora
     */
    public static ArrayList register(ArrayList<Cliente> usuarios, ConsoleIO read) {

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
                if (run_) {
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
                            String dni = read.getDNI(">> ");
                            System.out.println("Introduzca su código postal:");
                            int ccpp = read.getCodigoPostal(">> ");
                            System.out.println("Introduzca los datos de su tarjeta de crédito:");
                            String ttcc = read.getTarjetaCredito(">> ");
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
            }// Si el correo no es valido...
            else {
                System.out.println("¡¡El correo no es valido!!");
            }
        }
        return arr;
    }

    /**
     * <p>
     * Esta función pide a traves de la consola un usuario y una contraseña y
     * comprueba si existe algún usuario que tenga esas credenciales en una
     * lista de usuarios.</p>
     *
     * <p>
     * La función pedirá un correo hasta que se introduzca un correo válido y
     * después se pedirá una contraseña hasta que se introduzcauna contraseña
     * valida. Además se repetirá este proceso hasta que se introduzca la clave
     * de salida "qwerty" como correo o hasta que se den unos credenciales
     * pertenecientes a algún usuario de la lista con la que se compara.</p>
     *
     * @param usuarios Es la lista de usuarios en la que se hace la
     * comprobacion.
     * @param read Es un objeto que se utiliza para pedir los inputs y comprobar
     * si son correos o contraseñas validos.
     *
     * @return La funcion devuelve un ArrayList con un booleano que indica si se
     * ha introducido el código de salida o no, y el usuario que se haya
     * obtenido como coincidente con los credenciales introducidos.
     *
     * @author Eduardo Ruiz Sabajanes
     * @author Luis Miguel Sobrino Zamora
     */
    private static ArrayList login(ArrayList<Cliente> usuarios, ConsoleIO read) {
        ArrayList arr = new ArrayList(2);
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
            }// Comprobamos si el correo es válido
            else if (read.checkCorreo(correo)) {
                arr.set(0, false);

                // Pide una contraseña
                System.out.println("Introduzca su clave:");
                String clave = read.getString(">> ");

                // Si la contraseña es valida
                if (read.checkClave(clave)) {
                    if (correo.equals("admin@javapop.com") && clave.equals("admin")) {
                        arr.set(1, new Admin());
                        run_ = false;
                    } else {
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
                }
                // Si la contraseña y el correo no coinciden con los de ningun usuario
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
        ArrayList<Cliente> usuarios = IOCustomLib.leerClientes();
        ArrayList<Producto> productos = IOCustomLib.leerProductos();
        ArrayList<Venta> ventas = IOCustomLib.leerVentas();

        for (Producto producto : productos) {
            if (producto.urgente) {
                producto.fechaUrgente.plusDays(7);
                if (producto.fechaUrgente.isBefore(LocalDateTime.now())) {
                    producto.urgente = false;
                } else {
                    producto.fechaUrgente.minusDays(7);
                }
            }
        }

        for (Cliente cliente : usuarios) {
            if (cliente instanceof Profesional) {
                ((Profesional) cliente).pagoPro.plusMonths(1);
                if (((Profesional) cliente).pagoPro.isBefore(LocalDateTime.now())) {
                    cliente.cobrar(30);
                } else {
                    ((Profesional) cliente).pagoPro.minusMonths(1);
                }
            }
        }

        // Usuario que opera con la aplicaion
        Usuario user = new Cliente();

        // Variables de lectura y comprobacion de estado
        ConsoleIO read = new ConsoleIO();
        ArrayList returns;
        int operacion;
        int estado = 0;
        boolean finalizar = false;

        // Bucle principal del programa
        while (!finalizar) {
            // Estado 0: Elegir entre "inicio de sesion" y "registrarse"
            if (estado == 0) {
                // Pedimos al usuario que seleccione una operacion a realizar
                //System.out.println("Estado 0:");
                System.out.println("¿Que operación desea realizar?\n"
                        + "1.- Iniciar sesion\n"
                        + "2.- Registrarse\n"
                        + "3.- Salir");
                operacion = read.getInt(">> ", 1, 3);
                System.out.println();

                // Ejecutamos esa operacion
                switch (operacion) {

                    case 1: // Realizar el "inicio de sesion"
                        returns = login(usuarios, read);
                        if ((boolean) returns.get(0)) {
                            estado = 0;
                        } else {
                            user = (Usuario) returns.get(1);
                            if (user instanceof Admin) {
                                estado = 1;
                            } else if (user instanceof Cliente) {
                                estado = 2;
                            }
                        }
                        break;

                    case 2:// Realizar el "registro de usuario"
                        returns = register(usuarios, read);
                        if (!(boolean) returns.get(0)) {
                            user = (Usuario) returns.get(1);
                            estado = 2;
                        }
                        break;

                    case 3:// Salimos del bucle principal
                        finalizar = true;
                        break;
                }
            } // Estado 1: Menu principal del administrador
            else if (estado == 1) {

                // Pedimos al usuario que seleccione una operacion a realizar
                //System.out.println("Estado 1:");
                System.out.println("¿Que operación desea realizar?\n"
                        + "1.- Consultar usuario\n"
                        + "2.- Consultar producto\n"
                        + "3.- Consultar ventas\n"
                        + "4.- Cerrar sesión\n"
                        + "5.- Salir");
                operacion = read.getInt(">> ", 1, 5);
                System.out.println();

                // Ejecutamos esa operacion
                switch (operacion) {

                    case 1:// Consultar usuario
                        Admin.ConsultarUsuario(usuarios, read);
                        break;

                    case 2:// Consultar producto
                        Admin.ConsultarProducto(productos, read);
                        break;

                    case 3:// 
                        Admin.ConsultarVentas(ventas, read);
                        break;

                    case 4:// Saltamos al estado 0
                        estado = 0;
                        break;

                    case 5:// Salimos del bucle principal
                        finalizar = true;
                        break;
                }
            } // Estado 2: Menu principal del cliente
            else if (estado == 2) {
                // Pedimos al usuario que seleccione una operacion a realizar
                //System.out.println("Estado 2:");
                //((Cliente)user).displayVentas();
                if (!(user instanceof Profesional)) {
                    System.out.println("¿Que operación desea realizar?\n"
                            + "1.- Comprar\n"
                            + "2.- Mis productos\n"
                            + "3.- Mejorar a licencia pro\n"
                            + "4.- Cerrar sesión\n"
                            + "5.- Salir");
                } else {
                    System.out.println("¿Que operación desea realizar?\n"
                            + "1.- Comprar\n"
                            + "2.- Mis productos\n"
                            + "3.- Renunciar licencia pro\n"
                            + "4.- Cerrar sesión\n"
                            + "5.- Salir");
                }
                operacion = read.getInt(">> ", 1, 5);

                // Ejecutamos esa operacion
                switch (operacion) {
                    case 1:// Compra
                        Searching.comprar((Cliente) user, productos, ventas, read);
                        break;

                    case 2:// Mis productos
                        estado = 3;
                        break;

                    case 3:// Actualizar licencia pro
                        if (user instanceof Profesional) {
                            usuarios.remove((Profesional) user);
                            user = new Cliente((Profesional) user);
                            usuarios.add((Cliente) user);
                        } else {
                            ((Cliente) user).cobrar(30);
                            usuarios.remove((Cliente) user);
                            user = new Profesional((Cliente) user, read);
                            usuarios.add((Profesional) user);
                        }
                        break;

                    case 4:// Saltamos al estado 0
                        estado = 0;
                        break;

                    case 5:// Salimos del bucle principal
                        finalizar = true;
                        break;
                }
            } else if (estado == 3) {
                System.out.println("¿Que operación desea realizar?\n"
                        + "1.- Editar productos\n"
                        + "2.- Dar de alta producto\n"
                        + "3.- Volver");
                operacion = read.getInt(">> ", 1, 4);

                // Ejecutamos esa operacion
                switch (operacion) {
                    case 1:// Editar productos
                        Cliente.editarProducto((Cliente) user, productos, read);
                        break;
                    case 2:// Dar de alta producto
                        Cliente.altaProducto((Cliente) user, read, productos);
                        break;
                    case 3:
                        estado = 2;
                        break;
                }

            }
        }

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).correo);
        }

        // Final del programa: Guardamos la informacion de vuelta en los ficheros
        IOCustomLib.guardarClientes(usuarios);
        IOCustomLib.guardarProductos(productos);
        IOCustomLib.guardarVentas(ventas);

    }

}
