package clases;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
import java.io.Serializable;

/**
 *
 * @author Eduardo Ruiz Sabajanes y Luis Miguel Sobrino Zamora
 */
public abstract class Usuario implements Serializable {

    protected String correo;
    protected String clave;
    
    public String getCorreo(){
        return this.correo;
    }
    
    public String getClave(){
        return this.clave;
    }
}
