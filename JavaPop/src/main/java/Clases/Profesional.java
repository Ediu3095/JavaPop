package clases;

import java.io.Serializable;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Profesional extends Cliente implements Serializable {

    protected String Descripcion;
    protected String Horario;
    protected String Telefono;
    protected String Web;

    public Profesional() {
        super("","","","","","");
        this.profesional = true;

    }


    public void Cobro(){
        
    }
    
    public void EditarDatos(){
        
    }
    
}
