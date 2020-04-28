package Clases;

public abstract class Cliente extends Usuario {
// Datos

    protected String dni;
    protected String nombre;
    protected String ccpp;
    protected String ttcc;
    protected String productos[];
    protected boolean profesional;

    public Cliente() {
        this.dni = "";
        this.nombre = "";
        this.ccpp = "";
        this.ttcc = "";
        this.productos = ;
        this.profesional = false;
}
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getccpp() {
        return ccpp;
    }
    
    public void setccpp(String ccpp) {
        this.ccpp = ccpp;
    }
    public String getTTCC() {
        return ttcc;
    }
    
    public void setTTCC(String ttcc) {
        this.ttcc = ttcc;
    }
    
    
    
}

