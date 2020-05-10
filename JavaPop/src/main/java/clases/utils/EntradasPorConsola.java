package clases.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import clases.enumeradores.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class EntradasPorConsola {

    private final BufferedReader read;
    private final FileSystem fileSys;

    public EntradasPorConsola() {
        this.read = new BufferedReader(new InputStreamReader(System.in));
        this.fileSys = FileSystems.getDefault();
    }

    /** <head>
     * <p>
     * Recibe un String y comprueba que pueda ser un correo asegurandose de que
     * tiene al menos un <b>@</b>, y un <b>.</b> después del
     * <b>@</b>.</p></head>
     *
     * <body>
     *
     * @param str_ el string del que se va a comprobar el formato.
     *
     * @return verdadero si el string tiene formato de correo y false si no lo
     * tiene.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
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

    /** <head>
     * <p>
     * Recibe un string y comprueba que solo tiene caracteres de entre una lista
     * de caracteres permitidos para las contraseñas.</p></head>
     *
     * <body>
     *
     * @param str_ el string del que se comprobaran los caracteres.
     *
     * @return verdadero si no tiene caracteres prohibidos y falso si los tiene.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
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

    /** <head>
     * <p>
     * Pide un string que se debe corresponder con el path de una foto, en el
     * caso de que la foto exista, la copia en <b>./resources/imagenes</b>
     * para poder acceder a ella más tarde aunque se borre la original y
     * finalmente crea un objeto Icon de la imagen copiada y lo
     * devuelve.</p></head>
     *
     * <body>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return un objeto de la clase <i>Icon</i>.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public Icon getImage(String str_) {
        boolean run = true;
        File imgFolder = new File("./resources/imagenes/");
        String address;
        String newAddress = "./resources/imagenes/";
        while (run) {
            System.out.println("Introduzca la dirección en su ordenador de una imagen del producto:\n"
                    + "(La separación entre carpetas se indicará con /)\n"
                    + "(Indicar el formato de la imagen con .jpg, .png ...)");
            address = this.getString(str_);
            newAddress += imgFolder.listFiles().length + "_";
            try {
                File imagen = new File(address);
                if (!imagen.exists()) {
                    throw new RuntimeException("La foto no existe");
                }
                newAddress += imagen.getName();
                Files.copy(this.fileSys.getPath(address), this.fileSys.getPath(newAddress), REPLACE_EXISTING);
                run = false;
            } catch (IOException ex) {
                System.out.println(ex + ": Ocurrió un error desconocido");
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        }
        Icon icon = new ImageIcon(newAddress);
        return icon;
    }

    /** <head>
     * <p>
     * Pide un numero del 1 al 5 que se corresponda con alguno de los estados
     * enumeradas previamente en la consola.</p></head>
     *
     * <body>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return un estado del enum Estado.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public Estado getEstado(String str_) {
        Estado estado = Estado.Bueno;
        System.out.println("Introduzca el estado del producto:\n"
                + "1.- Nuevo\n"
                + "2.- Como nuevo\n"
                + "3.- Bueno\n"
                + "4.- Aceptable\n"
                + "5.- Regular");
        int opcion = this.getInt(str_, 1, 5);
        switch (opcion) {
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

    /** <head>
     * <p>
     * Pide un numero del 1 al 6 que se corresponda con alguna de las categorías
     * enumeradas previamente en la consola.</p></head>
     *
     * <body>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return una categoría del enum Categoria.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public Categoria getCategoria(String str_) {
        Categoria categoria = Categoria.Moda_y_accesorios;
        System.out.println("Introduzca la categoría del producto:\n"
                + "1.- moda y accesorios\n"
                + "2.- tv audio y foto\n"
                + "3.- moviles y telefonia\n"
                + "4.- informatica y electronica\n"
                + "5.- consolas y videojuegos\n"
                + "6.- deporte y ocio");
        int opcion = this.getInt(str_, 1, 6);
        switch (opcion) {
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

    /** <head>
     * <p>
     * Pide por consola un número entero hasta que este sea
     * introducido.</p></head>
     *
     * <body>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el número entero introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
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

    /** <head>
     * <p>
     * Pide por consola un número entero que se encuente entre dos limites (o en
     * los limites) hasta que este sea introducido.</p></head>
     *
     * <body>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param low limite inferior para el numero que se pide.
     * @param high limite superior para el numero que se pide.
     *
     * @return el número entero introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
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

    /** <head>
     * <p>
     * Pide por consola un número decimal hasta que este sea
     * introducido.</p></head>
     *
     * <body>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el número decimal introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
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

    /** <head>
     * <p>
     * Pide por consola un número decimal que se encuente entre dos limites (o
     * en los limites) hasta que este sea introducido.</p></head>
     *
     * <body>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param low limite inferior para el numero que se pide.
     * @param high limite superior para el numero que se pide.
     *
     * @return el número decimal introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
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

    /** <head>
     * <p>
     * Pide por consola una cadena de texto.</p></head>
     *
     * <body>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string de texto introducido por la consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public String getString(String str_) {
        boolean run = true;
        String str = "";
        while (run) {
            try {
                System.out.print(str_);
                str = this.read.readLine();
                run = false;
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return str;
    }

    /** <head>
     * <p>
     * Pide por consola una cadena de texto de una longitud
     * determinada.</p></head>
     *
     * <body>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param length_ longitud que debe tener la entrada.
     *
     * @return el string de texto introducido por la consola.
     *
     * @author Eduardo Ruiz Sabajanes
     * </body>
     */
    public String getString(String str_, int length_) {
        boolean run = true;
        String str = "";
        while (run) {
            try {
                System.out.print(str_);
                str = this.read.readLine();
                if (str.length() != length_) {
                    throw new RuntimeException("La longitud de la entrada debe ser de " + length_ + " caracteres");
                }
                run = false;
            } catch (IOException | RuntimeException e) {
                System.out.println(e);
            }
        }
        return str;
    }
}
