package clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Image;

import clases.enumeradores.*;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class EntradasPorConsola {

    private final BufferedReader read;

    public EntradasPorConsola() {
        this.read = new BufferedReader(new InputStreamReader(System.in));
    }
    
    /**
     * Esta funcion pide un String al usuario y comprueba que pueda ser un
     * correo asegurandose de que tiene al menos un '@' y un '.' despues del
     * '@'.
     *
     * El String que se retorna será el correo en caso de que este sea valido o
     * "" en el caso de que no lo sea.
     *
     * @return String
     */
    public boolean checkCorreo(String str_) {
        char[] correoChars;
        int atCounter = 0;
        int atPosition = 0;
        correoChars = str_.toCharArray();
        for (int i = 0; i < correoChars.length; i++) {
            if (correoChars[i] == '@') {
                atCounter++;
                atPosition = i;
            }
        }
        if (atCounter != 1) {
            return false;
        } else {
            for (int i = ++atPosition; i < correoChars.length; i++) {
                if (correoChars[i] == '.') {
                    atCounter++;
                    break;
                }
            }
            if (atCounter == 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    /**
     * Esta funcion pide un String al usuario y comprueba que pueda ser una
     * clave asegurandose de que no tiene ningun caracter invalido.
     *
     * El String que se retorna será el correo en caso de que este sea valido o
     * "" en el caso de que no lo sea.
     *
     * @return String
     */
    public boolean checkClave(String str_) {
        char[] validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        boolean valid = false;
        for (int i = 0; i < str_.length(); i++) {
            for (int j = 0; j < validChars.length; j++) {
                if (str_.charAt(i) == validChars[j]) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                break;
            } else if (i != str_.length() - 1) {
                valid = false;
            }
        }
        return valid;
    }

    public Image getImage(String str_){
        boolean run = true;
        String address;
        Image icon;
        while(run){
            System.out.print(str_);
            address = this.getString(str_);
            try{
                icon = new Image(address);
            }
        }
        return icon;
    }
    
    public Estado getEstado() {
        Estado estado = Estado.Bueno;
        System.out.println("Introduzca el estado del producto:"
                + "1.- Nuevo"
                + "2.- Como nuevo"
                + "3.- Bueno"
                + "4.- Aceptable"
                + "5.- Regular");
        int opcion = this.getInt(">> ", 1, 5);
        switch (opcion){
            case 4:
                estado = Estado.Aceptable;
                break;
            case 3:
                estado = Estado.Bueno;
                break;
            case 2:
                estado = Estado.Como_nuevo;
                break;
            case 1:
                estado = Estado.Nuevo;
                break;
            case 5:
                estado = Estado.Regular;
                break;
        }
        return estado;
    }
    
    public Categoria getCategoria() {
        Categoria categoria = Categoria.Moda_y_accesorios;
        System.out.println("Introduzca una categoría:"
                + "1.- moda y accesorios"
                + "2.- tv audio y foto"
                + "3.- moviles y telefonia"
                + "4.- informatica y electronica"
                + "5.- consolas y videojuegos"
                + "6.- deporte y ocio");
        int opcion = this.getInt(">> ", 1, 6);
        switch (opcion){
            case 1:
                categoria = Categoria.Moda_y_accesorios;
                break;
            case 2:
                categoria = Categoria.Tv_audio_y_foto;
                break;
            case 3:
                categoria = Categoria.Moviles_y_telefonia;
                break;
            case 4:
                categoria = Categoria.Informatica_y_electronica;
                break;
            case 5:
                categoria = Categoria.Consolas_y_videojuegos;
                break;
            case 6:
                categoria = Categoria.Deporte_y_ocio;
                break;
        }
        return categoria;
    }

    public int getInt(String str) {
        boolean run = true;
        int num = 0;
        while (run) {
            try {
                System.out.print(str);
                num = Integer.parseInt(this.read.readLine());
                run = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return num;
    }

    public int getInt(String str, int low, int high) {
        boolean run = true;
        int num = 0;
        while (run) {
            try {
                System.out.print(str);
                num = Integer.parseInt(this.read.readLine());
                if (num < low || num > high) {
                    throw new RuntimeException("Out of limit");
                }
                run = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return num;
    }

    public double getDouble(String str) {
        boolean run = true;
        double num = 0;
        while (run) {
            try {
                System.out.print(str);
                num = Double.parseDouble(this.read.readLine());
                run = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return num;
    }

    public double getDouble(String str, double low, double high) {
        boolean run = true;
        double num = 0;
        while (run) {
            try {
                System.out.print(str);
                num = Double.parseDouble(this.read.readLine());
                if (num < low || num > high) {
                    throw new RuntimeException("Out of limit");
                }
                run = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return num;
    }

    public String getString(String str_) {
        boolean run = true;
        String str = "";
        while (run) {
            try {
                System.out.print(str_);
                str = this.read.readLine();
                run = false;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return str;
    }

    public String getString(String str_, String[] options) {
        boolean run = true;
        String str = "";
        while (run) {
            try {
                System.out.print(str_);
                str = this.read.readLine();
                for (int i = 0; i < options.length; i++) {
                    if (str.equals(options[i])) {
                        run = false;
                        break;
                    }
                }
                if (run) {
                    throw new RuntimeException("");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return str;
    }

}
