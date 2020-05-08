package clases;

import clases.enumeradores.Categoria;
import clases.utils.EntradasPorConsola;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Admin extends Usuario implements Serializable {

    public Admin() {
        this.correo = "admin@javapop.com";
        this.clave = "admin";
    }

    public static void ConsultarUsuario(ArrayList<Cliente> usuarios, EntradasPorConsola read) {

        boolean run__ = true;
        boolean run_ = true;
        Cliente usuario = new Cliente();
        Profesional usuarioPro = new Profesional();
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion = 0;
        int seleccionDato = 0;
        String dato;

        while (run_) {
            System.out.println("Seleccione el correo de usuario que desea comprobar:\n "
                    + "1.- Pagina siguiente\n"
                    + "2.- Pagina anterior\n"
                    + "3.- Salir");
            for (int i = 1; i <= 10; i++) {
                posicionMax = posicionMin + i - 1;
                if (posicionMax < usuarios.size()) {
                    System.out.println((i + 3) + ".- " + usuarios.get(posicionMax).correo);
                } else {
                    posicionMax--;
                    break;
                }
            }

            seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
            if (seleccion == 1) {
                posicionMin += 10;
                if (posicionMin >= usuarios.size()) {
                    posicionMin -= 10;
                }
            } else if (seleccion == 2) {
                posicionMin -= 10;
                if (posicionMin <= 0) {
                    posicionMin += 10;
                }
            } else if (seleccion == 3) {
                return;
            } else {
                usuario = usuarios.get(posicionMin + seleccion - 4);
                run_ = false;
            }
        }
        run_ = true;
        while (run_) {
            System.out.println(usuario);
            System.out.println("Que operación desea realizar:\n "
                    + "1.- Salir\n"
                    + "2.- Editar correo\n"
                    + "3.- Editar clave\n"
                    + "4.- Editar nombre\n"
                    + "5.- Editar DNI\n"
                    + "6.- Editar código postal\n"
                    + "7.- Editar tarjeta de credito");
            if (usuario instanceof Profesional) {
                usuarioPro = (Profesional) usuario;
                System.out.println("8.- Editar descripción\n"
                        + "9.- Editar horario\n"
                        + "10.- Editar teléfono\n"
                        + "11.- Editar web");
                seleccionDato = read.getInt(">> ", 1, 11);
            } else {
                seleccionDato = read.getInt(">> ", 1, 7);
            }
            switch (seleccionDato) {

                case 1: //Salir
                    return;

                case 2: //Editar correo
                    System.out.println("Nuevo correo del usuario:");
                    String correo = read.getString(">> ");
                    while (run__) {

                        // Comprobamos que el correo sea valido
                        if (read.checkCorreo(correo)) {
                            run__ = false;

                            //Comprobamos que no haya otro usuario con el mismo correo
                            for (int i = 0; i < usuarios.size(); i++) {
                                if (usuarios.get(i).correo.equals(correo)) {
                                    run__ = true;
                                    break;
                                }
                            }
                            // Si el correo ya pertenece a un usuario...
                            if (run__) {
                                System.out.println("Usuario existente, introduzca un correo no registardo");
                            }
                        }
                    }
                    run__ = true;
                    usuario.setCorreo(correo);
                    break;

                case 3: //Editar clave
                    System.out.println("Nueva clave:");
                    String clave = read.getString(">> ");
                    while (run__) {

                        //Comprobamos que la contraseña sea valida
                        if (read.checkClave(clave)) {
                            run__ = false;
                        }
                    }
                    run__ = true;
                    usuario.setClave(clave);
                    break;

                case 4: // Editar nombre
                    System.out.println("Nuevo nombre: ");
                    String nombre = read.getString(">> ");
                    usuario.setNombre(nombre);
                    break;

                case 5: // Edtitar DNI
                    System.out.println("Nuevo DNI: ");
                    String dni = read.getString(">> ");
                    usuario.setDni(dni);
                    break;

                case 6: //Editar codigo postal
                    System.out.println("Nuevo codigo postal: ");
                    int ccpp = read.getInt(">> ");
                    usuario.setccpp(ccpp);
                    break;

                case 7: // Editar tarjeta de credito
                    System.out.println("Nueva tarjeta de credito");
                    String ttcc = read.getString(">> ");
                    usuario.setTTCC(ttcc);
                    break;

                case 8: // Editar descripcion
                    System.out.println("Nueva descripción: ");
                    String descripcion = read.getString(">> ");
                    usuarioPro.setDescripcion(descripcion);
                    break;

                case 9: //Editar Horario
                    System.out.println("Nuevo horario: ");
                    String horario = read.getString(">> ");
                    usuarioPro.setHorario(horario);
                    break;

                case 10: // Editar telefono
                    System.out.println("Nuevo telefono: ");
                    String telefono = read.getString(">> ");
                    usuarioPro.setTelefono(telefono);
                    break;

                case 11: //Editar web
                    System.out.println("Nueva web: ");
                    String web = read.getString(">> ");
                    usuarioPro.setWeb(web);
                    break;
            }
        }
    }

    public static void ConsultarProducto(ArrayList<Producto> producto, EntradasPorConsola read) {

        Producto product = new Producto();
        int seleccionDato = 0;
        boolean run_ = true;
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion;
        boolean run__ = true;
        int categoria = 0;
        ArrayList<Producto> arr = new ArrayList();
        Categoria categoriaElegida = null;

        while (run_) {
            System.out.println("Seleccionela categoría que desea comprobar:\n "
                    + "1.- Salir\n"
                    + "2.- Moda y accesorios\n"
                    + "3.- Tv, audio y fotografía\n"
                    + "4.- Moviles y telefonia\n"
                    + "5.- Informatica y electronica\n"
                    + "6.- Consolas y videojuegos\n"
                    + "7.- Deporte y ocio");
            categoria = read.getInt(">> ", 1, 11);
            switch (categoria) {
                case 1:// Salir 
                    return;
                case 2: //Moda y accesorios
                    categoriaElegida = Categoria.Moda_y_accesorios;
                    break;
                case 3: // Tv, audio y fotográfia
                    categoriaElegida = Categoria.Tv_audio_y_foto;
                    break;
                case 4: // Moviles y telefonia
                    categoriaElegida = Categoria.Moviles_y_telefonia;
                    break;
                case 5: // Informatica y electronica
                    categoriaElegida = Categoria.Informatica_y_electronica;
                    break;
                case 6: // Consolas y videojuegos
                    categoriaElegida = Categoria.Consolas_y_videojuegos;
                    break;
                case 7: // Deporte y ocio
                    categoriaElegida = Categoria.Deporte_y_ocio;
                    break;
            }
            for (int i = 0; i < producto.size(); i++) {
                if (producto.get(i).categoria.equals(categoriaElegida)) {
                    arr.add(producto.get(i));
                }
            }
            while (run__) {
                System.out.println("Seleccione el producto que desea comprobar:\n "
                        + "1.- Pagina siguiente\n"
                        + "2.- Pagina anterior\n"
                        + "3.- Salir");
                for (int i = 1; i <= 10; i++) {
                    posicionMax = posicionMin + i - 1;
                    if (posicionMax < producto.size()) {
                        System.out.println((i + 3) + ".- " + producto.get(posicionMax).titulo);
                    } else {
                        posicionMax--;
                        break;
                    }
                }

                seleccion = read.getInt(">> ", 1, posicionMax - posicionMin + 4);
                if (seleccion == 1) {
                    posicionMin += 10;
                    if (posicionMin >= producto.size()) {
                        posicionMin -= 10;
                    }
                } else if (seleccion == 2) {
                    posicionMin -= 10;
                    if (posicionMin <= 0) {
                        posicionMin += 10;
                    }
                } else if (seleccion == 3) {
                    return;
                } else {
                    product = producto.get(posicionMin + seleccion - 4);
                    run_ = false;
                }
            }

        }
        run_ = true;
        while (run_) {
            System.out.println(product);
            System.out.println("Que operación desea realizar:\n "
                    + "1.- Salir\n"
                    + "2.- Editar titulo\n"
                    + "3.- Editar descripcion\n"
                    + "4.- Editar categoria\n"
                    + "5.- Editar estado\n"
                    + "6.- Editar foto");
            
                seleccionDato = read.getInt(">> ", 1, 7);

            switch (seleccionDato) {

                case 1: //Salir
                    return;

                case 2: //Editar titulo
                    System.out.println("Nuevo titulo del producto:");
                    String titulo = read.getString(">> ");                                       
                    run__ = true;
                    product.setTitulo(titulo);
                    break;

                case 3: //Editar descripcion
                    System.out.println("Nueva descripción del producto:");
                    String descripcion = read.getString(">> ");                                     
                    run__ = true;
                    product.setTitulo(titulo);
                    break;

                case 4: // Editar categoria
                    product.categoria = getCategoria(">> ");

                    
                    break;
                case 5: // Edtitar estado
                    System.out.println("Nuevo estado del producto: ");
                                       
                    break;

                case 6: //Editar foto
                    System.out.println("Nuevo codigo postal: ");

                    break;

               
            }
        }
    }

}
