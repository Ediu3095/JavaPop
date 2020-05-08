package clases;

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

        boolean run_ = true;
        Cliente usuario = new Cliente();
        int posicionMin = 0;
        int posicionMax = 0;
        int seleccion = 0;

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
                    + "5.- Editar código postal\n"
                    + "6.- Editar tarjeta de credito");           
            if (usuario instanceof Profesional){
                System.out.println("7.- Editar descripción\n"
                        + "8.- Editar horario\n"
                        + "9.- Editar teléfono\n"
                        + "10.- Editar web");
            }
        }
    }
}
