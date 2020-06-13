package clases;

import clases.utils.CheckFunctions;
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

    /**
     * <p>
     * Crea una cuenta profesional a partir de un cliente</p>
     *
     * @param c el cliente del que nace esta cuenta profesional
     * @param read un objeto utilizado para pedirle entradas por consola al
     * usuario
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public Profesional(Cliente c, CheckFunctions read) {
        super(c.correo, c.clave, c.dni, c.nombre, c.ccpp, c.ttcc);
        System.out.println("Introduzca una descripción de su cuenta: ");
        this.descripcion = read.getString(">> ");
        System.out.println("Introduzca un horario(hh:mm-hh:mm): ");
        this.horario = read.getHorario(">> ");
        System.out.println("Introduzca un teléfono de contacto: ");
        this.telefono = read.getTelefono(">> ");
        System.out.println("Introduzca una página web asociada: ");
        this.web = read.getWeb(">> ");
        this.pagoPro = LocalDateTime.now().plusMonths(1);
        this.productos = c.productos;
        for (Producto producto: this.productos){
            producto.setVendedor(this);
        }
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
