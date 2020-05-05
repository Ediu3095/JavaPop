package clases;

import java.io.Serializable;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Admin extends Usuario implements Serializable {

    public Admin(){
        this.correo = "admin@javapop.com";
        this.clave = "admin";
    }
}
