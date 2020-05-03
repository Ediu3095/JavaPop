package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    // Funciones de entrada de datos por consola
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
    public String getCorreo() {
        String correo;
        char[] correoChars;
        int atCounter = 0;
        int atPosition = 0;
        try {
            correo = this.read.readLine();
            correoChars = correo.toCharArray();
            for (int i = 0; i < correoChars.length; i++) {
                if (correoChars[i] == '@') {
                    atCounter++;
                    atPosition = i;
                }
            }
            if (atCounter != 1) {
                throw new RuntimeException("Correo no valido");
            } else {
                for (int i = ++atPosition; i < correoChars.length; i++) {
                    if (correoChars[i] == '.') {
                        atCounter++;
                        break;
                    }
                }
                if (atCounter == 1) {
                    throw new RuntimeException("Correo no valido");
                } else {
                    return correo;
                }
            }
        } catch (IOException e) {
            return "";
        } catch (RuntimeException e) {
            System.out.println(e);
            return "";
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
    public String getClave() {
        String contraseña;
        char[] validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        boolean valid = false;
        try {
            contraseña = this.read.readLine();
            for (int i = 0; i < contraseña.length(); i++) {
                for (int j = 0; j < validChars.length; j++) {
                    if (contraseña.charAt(i) == validChars[j]) {
                        valid = true;
                    }
                }
                if (valid == false) {
                    throw new RuntimeException("Caracter invalido en la contraseña");
                }
                valid = false;
            }
            return contraseña;
        } catch (IOException e) {
            return "";
        } catch (RuntimeException e) {
            return "";
        }
    }

    public Categoria getCategoria() {
        String cat;
        Categoria categoria = Categoria.Moda_y_accesorios;
        boolean run = true;
        while (run) {
            try {
                cat = this.read.readLine().toLowerCase();
                switch (cat) {
                    case "moda y accesorios":
                        categoria = Categoria.Moda_y_accesorios;
                        break;
                    case "tv audio y foto":
                        categoria = Categoria.Tv_audio_y_foto;
                        break;
                    case "moviles y telefonia":
                        categoria = Categoria.Moviles_y_telefonia;
                        break;
                    case "informatica y electronica":
                        categoria = Categoria.Informatica_y_electronica;
                        break;
                    case "consolas y videojuegos":
                        categoria = Categoria.Consolas_y_videojuegos;
                        break;
                    case "deporte y ocio":
                        categoria = Categoria.Deporte_y_ocio;
                        break;
                    default:
                        throw new RuntimeException("Categoria inexistente");
                }
                run = false;
            } catch (RuntimeException e) {
                System.out.println(e);
            } catch (IOException e) {

            }
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
