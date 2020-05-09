package clases;

import clases.utils.EntradasPorConsola;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public final class Profesional extends Cliente implements Serializable {

    protected String descripcion;
    protected String horario;
    protected String telefono;
    protected String web;
    protected LocalDateTime pagoPro;

    public Profesional() {
        super("", "", "", "", 0, "");
    }
    
    /**<head> Crea una cuenta profesional a partir de un cliente</head>
     * 
     * <body>
     * @param   c
     *          el cliente del que nace esta cuenta profesional
     * @param   read
     *          un objeto utilizado para pedirle entradas por consola al usuario
     * 
     * @author Eduardo Ruiz Sabajanes
     * </body>*/
    public Profesional(Cliente c, EntradasPorConsola read){
        super(c.correo, c.clave, c.dni, c.nombre, c.ccpp, c.ttcc);
        System.out.println("Introduzca una descripción de su cuenta: ");
        this.descripcion = read.getString(">> ");
        System.out.println("Introduzca un horario: ");
        this.horario = read.getString(">> ");
        System.out.println("Introduzca un teléfono de contacto (de 9 dígitos): ");
        this.telefono = read.getString(">> ", 9);
        System.out.println("Introduzca una página web asociada: ");
        this.web = read.getString(">> ");
        this.pagoPro = LocalDateTime.now();
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void cobro() {

    }

    public void editarDatos() {

    }

    @Override
    public String toString() {

        return super.toString() + "\n"
                + "Descripcion=" + descripcion + "\n"
                + "Horario=" + horario + "\n"
                + "Telefono=" + telefono + "\n"
                + "Web=" + web;

    }
}
