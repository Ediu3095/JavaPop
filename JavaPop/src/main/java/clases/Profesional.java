package clases;

import java.io.Serializable;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class Profesional extends Cliente implements Serializable {

    protected String descripcion;
    protected String horario;
    protected String telefono;
    protected String web;

    public Profesional() {
        super("", "", "", "", 0, "");
        this.profesional = true;

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
