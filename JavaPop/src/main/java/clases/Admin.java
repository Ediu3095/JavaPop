package clases;

import clases.enumeradores.Categoria;
import clases.utils.CheckFunctions;
import java.io.Serializable;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Miguel Sobrino Zamora
 */
public class Admin extends Usuario implements Serializable {

    public Admin() {
        this.correo = "admin@javapop.com";
        this.clave = "admin";
    }

    /**
     * <p>
     * Esta función proporciona al administrador un menú donde buscar usuarios
     * ordenados alfabeticamente y le permite editar sus atributos como correo,
     * clave nombre, dni, tarjeta de credito o codigo postal, asi como
     * descripción, horario, teléfono o web si el usuario seleccionado es
     * profesional</p>
     *
     * <p>
     * Se solicitará al administrador el dato que decida editar y este se
     * sustituirá por el antiguo que poseía el cliente</p>
     *
     * @param usuarios Es la lista de usuarios en la que se hace la edición.
     * @param read Es un objeto que se utiliza para pedir los inputs.
     *
     * @author Luis Miguel Sobrino Zamora
     * 
     * @deprecated Esta función solo sirve para la versión en consola de Javapop.
     */
    @Deprecated
    public static void ConsultarUsuario(ArrayList<Cliente> usuarios, CheckFunctions read) {
        boolean run_ = true;
        Cliente usuario = new Cliente();
        Profesional usuarioPro = new Profesional();
        int posicionMin = 0;
        int posicionMax = 0;
        boolean run__;
        int seleccion;

        while (run_) {
            System.out.println("Seleccione el correo de usuario que desea comprobar:\n"
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");
            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < usuarios.size()) {
                    System.out.println((i + 3) + ".- " + usuarios.get(posicionMax).getCorreo());
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) { // Siguiente pagina 
                posicionMin += 10;
                if (posicionMin >= usuarios.size()) {
                    posicionMin -= 10;
                }
            } else if (seleccion == 2) { // Pagina anterior
                posicionMin -= 10;
                if (posicionMin <= 0) {
                    posicionMin += 10;
                }
            } else if (seleccion == 3) { // Salir
                return;
            } else { // Seleccionar un usuario
                usuario = usuarios.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }
        run_ = true;
        while (run_) {
            System.out.println(usuario);
            System.out.println("Que operación desea realizar:\n"
                    + "1.- Salir\n"
                    + "2.- Editar correo\n"
                    + "3.- Editar clave\n"
                    + "4.- Editar nombre\n"
                    + "5.- Editar DNI\n"
                    + "6.- Editar código postal\n"
                    + "7.- Editar tarjeta de credito");
            if (usuario instanceof Profesional) { // En caso de ser usuario pro
                usuarioPro = (Profesional) usuario;
                System.out.println("8.- Editar descripción\n"
                        + "9.- Editar horario\n"
                        + "10.- Editar teléfono\n"
                        + "11.- Editar web");
                seleccion = read.getInt(">> ", 1, 11);
            } else {
                seleccion = read.getInt(">> ", 1, 7);
            }
            switch (seleccion) {

                case 1: //Salir
                    return;

                case 2: //Editar correo
                    run__ = true;
                    while (run__) {
                        //Pedimos un correo
                        System.out.println("Nuevo correo del usuario:");
                        String correo = read.getString(">> ");

                        // Comprobamos que el correo sea valido
                        if (read.checkCorreo(correo)) {

                            //Comprobamos que no haya otro usuario con el mismo correo
                            for (Usuario user : usuarios) {
                                if (user.getCorreo().equals(correo)) { // Si el correo ya pertenece a un usuario
                                    run__ = true;
                                    System.out.println("Ese correo ya es utilizado por otro usuario!!");
                                } else { // Si el correo no pertenece a ningún usuario
                                    run__ = false;
                                    usuario.setCorreo(correo);
                                }
                            }
                        }
                    }
                    break;

                case 3: //Editar clave
                    run__ = true;
                    while (run__) {
                        // Pedimos una contraseña
                        System.out.println("Nueva clave:");
                        String clave = read.getString(">> ");

                        //Comprobamos que la contraseña sea valida
                        if (read.checkClave(clave)) {
                            run__ = false;
                            usuario.setClave(clave);
                        } else {
                            System.out.println("Contraseña no válida");
                        }
                    }
                    break;

                case 4: // Editar nombre
                    System.out.println("Nuevo nombre: ");
                    String nombre = read.getString(">> ");
                    usuario.setNombre(nombre);
                    break;

                case 5: // Edtitar DNI
                    System.out.println("Nuevo DNI: ");
                    String dni = read.getDNI(">> ");
                    usuario.setDni(dni);
                    break;

                case 6: //Editar codigo postal
                    System.out.println("Nuevo codigo postal: ");
                    int ccpp = read.getCodigoPostal(">> ");
                    usuario.setCCPP(ccpp);
                    break;

                case 7: // Editar tarjeta de credito
                    System.out.println("Nueva tarjeta de credito: ");
                    String ttcc = read.getTarjetaCredito(">> ");
                    usuario.setTTCC(ttcc);
                    break;

                case 8: // Editar descripcion
                    System.out.println("Nueva descripción: ");
                    String descripcion = read.getString(">> ");
                    usuarioPro.setDescripcion(descripcion);
                    break;

                case 9: //Editar Horario
                    System.out.println("Nuevo horario(hh:mm-hh:mm): ");
                    String horario = read.getHorario(">> ");
                    usuarioPro.setHorario(horario);
                    break;

                case 10: // Editar telefono
                    System.out.println("Nuevo telefono: ");
                    String telefono = read.getTelefono(">> ");
                    usuarioPro.setTelefono(telefono);
                    break;

                case 11: //Editar web
                    System.out.println("Nueva web: ");
                    String web = read.getWeb(">> ");
                    usuarioPro.setWeb(web);
                    break;
            }
        }
    }

    /**
     * <p>
     * Esta función proporciona al administrador un menú donde buscar productos
     * ordenados alfabeticamente y le permite editar sus atributos como titulo,
     * descripción categoría, estado o eliminar la foto remplazandola por una en
     * blanco </p>
     *
     * <p>
     * Se solicitará al administrador el dato que decida editar y este se
     * sustituirá por el antiguo que poseía el producto</p>
     *
     * @param productos Es la lista de usuarios en la que se hace la edición.
     * @param read Es un objeto que se utiliza para pedir los inputs
     *
     * @author Luis Miguel Sobrino Zamora
     *
     * @deprecated Esta función solo sirve para la versión en consola de Javapop.
     */
    @Deprecated
    public static void ConsultarProducto(ArrayList<Producto> productos, CheckFunctions read) {
        ArrayList<Producto> arr = new ArrayList();
        Producto producto = new Producto();
        boolean run_ = true;
        int posicionMin = 0;
        int posicionMax = 0;
        Categoria categoriaElegida;
        int seleccion;

        categoriaElegida = read.getCategoria(">> ");
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria().equals(categoriaElegida)) {
                arr.add(productos.get(i));
            }
        }

        while (run_) {
            System.out.println("Seleccione el producto que desea comprobar:\n"
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");
            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < arr.size()) {
                    System.out.println((i + 3) + ".- " + arr.get(posicionMax).getTitulo());
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) { // Siguiente pagina
                posicionMin += 10;
                if (posicionMin >= productos.size()) {
                    posicionMin -= 10;
                }
            } else if (seleccion == 2) { // Pagina anterior
                posicionMin -= 10;
                if (posicionMin <= 0) {
                    posicionMin += 10;
                }
            } else if (seleccion == 3) { // Salir
                return;
            } else { // Seleccionar un producto
                producto = arr.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }
        run_ = true;
        while (run_) {
            System.out.println(producto);
            System.out.println("Que operación desea realizar:\n"
                    + "1.- Salir\n"
                    + "2.- Editar titulo\n"
                    + "3.- Editar descripcion\n"
                    + "4.- Editar categoria\n"
                    + "5.- Editar estado\n"
                    + "6.- Eliminar foto");

            seleccion = read.getInt(">> ", 1, 6);

            switch (seleccion) {

                case 1: //Salir
                    return;

                case 2: //Editar titulo
                    System.out.println("Nuevo titulo del producto:");
                    String titulo = read.getString(">> ");
                    producto.setTitulo(titulo);
                    break;

                case 3: //Editar descripcion
                    System.out.println("Nueva descripción del producto:");
                    String descripcion = read.getString(">> ");
                    producto.setDescripcion(descripcion);
                    break;

                case 4: // Editar categoria
                    producto.categoria = read.getCategoria(">> ");
                    break;

                case 5: // Editar estado
                    producto.estado = read.getEstado(">> ");
                    break;

                case 6: //Eliminar foto
                    /*producto.foto = new ImageIcon("./resources/imagenes/White.jpeg");*/
                    break;
            }
        }
    }

    /**
     * <p>
     * Esta función proporciona al administrador un menú donde buscar las ventas
     * ordenadas alfabeticamente. En este caso no podrá editar los datos de las
     * ventas solo consultarlos.</p>
     *
     *
     * @param ventas Es la lista de ventas que se muestra al administrador.
     * @param read Es un objeto que se utiliza para pedir los inputs.
     *
     * @author Luis Miguel Sobrino Zamora
     *
     * @deprecated Esta función solo sirve para la versión en consola de Javapop.
     */
    @Deprecated
    public static void ConsultarVentas(ArrayList<Venta> ventas, CheckFunctions read) {
        ArrayList<Venta> arr = new ArrayList();
        boolean run_ = true;
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion;
        Categoria categoriaElegida;

        categoriaElegida = read.getCategoria(">> ");
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getProducto().getCategoria().equals(categoriaElegida)) {
                arr.add(ventas.get(i));
            }
        }
        while (run_) {
            System.out.println("Seleccione la venta que desea comprobar:\n"
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");
            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < arr.size()) {
                    System.out.println((i + 3) + ".- "
                            + arr.get(posicionMax).getComprador().getCorreo()
                            + " " + arr.get(posicionMax).getProducto().getVendedor().getCorreo()
                            + " " + arr.get(posicionMax).getFechaVenta());
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) { // Página siguiente
                posicionMin += 10;
                if (posicionMin >= ventas.size()) {
                    posicionMin -= 10;
                }
            } else if (seleccion == 2) { // Página anterior
                posicionMin -= 10;
                if (posicionMin <= 0) {
                    posicionMin += 10;
                }
            } else if (seleccion == 3) { // Salir
                return;
            } else { // Seleccionar una venta
                System.out.println(ventas.get(posicionMin + seleccion - 4));
                System.out.println("1.- Salir");
                seleccion = read.getInt(">> ", 1, 1);
                switch (seleccion) {
                    case 1: //Salir
                        return;
                }
            }

        }

    }
}
