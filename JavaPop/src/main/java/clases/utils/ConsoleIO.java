package clases.utils;

import clases.enumeradores.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class ConsoleIO {

    private final BufferedReader read;
    private final FileSystem fileSys;

    public ConsoleIO() {
        this.read = new BufferedReader(new InputStreamReader(System.in));
        this.fileSys = FileSystems.getDefault();
    }

    /**
     * <p>
     * Recibe un String y lo compara con un pattern para comprobar que tenga
     * formato de correo electronico.</p>
     *
     * @param str_ el string del que se va a comprobar el formato.
     *
     * @return verdadero si el string tiene formato de correo y false si no lo
     * tiene.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public boolean checkCorreo(String str_) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher_ = pattern.matcher(str_);
        return matcher_.matches();
    }

    /**
     * <p>
     * Recibe un string y comprueba que solo tiene letras y numeros (únicos
     * caracteres permitidos para las contraseñas).</p>
     *
     * @param str_ el string del que se comprobaran los caracteres.
     *
     * @return verdadero si no tiene caracteres prohibidos y falso si los tiene.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public boolean checkClave(String str_) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{1,}");
        Matcher matcher = pattern.matcher(str_);
        return matcher.matches();
    }

    /**
     * <p>
     * Se pide un dni a traves de la consola y se comprueba que tenga formato de
     * dni y que la letra sea la correspondiente a el número.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string introducido por consola como dni que haya cumplido las
     * condiciones.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public String getDNI(String str_) {
        char[] letras = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        Pattern pattern = Pattern.compile("[0-9]{7,8}[A-Z]");
        Matcher matcher_;
        String DNI;
        int NIE;
        while (true) {
            DNI = this.getString(str_);
            matcher_ = pattern.matcher(DNI);
            if (matcher_.matches()) {
                NIE = Integer.parseInt(DNI.substring(0, DNI.length() - 1));
                if (DNI.charAt(DNI.length() - 1) == letras[NIE % 23]) {
                    return DNI;
                }
            }
        }
    }

    /**
     * <p>
     * Se pide un codigo postal a través de la consola y se comprueba que tenga
     * el formato de uno.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el entero introducido por consola como codigo postal que haya
     * cumplido las condiciones.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public int getCodigoPostal(String str_) {
        Pattern pattern = Pattern.compile("[0-9]{5}");
        Matcher matcher_;
        String ccpp;
        while (true) {
            ccpp = this.getString(str_, 5);
            matcher_ = pattern.matcher(ccpp);
            if (matcher_.matches()) {
                return Integer.parseInt(ccpp);
            }
        }
    }

    /**
     * <p>
     * Se pide el número de una tarjeta de crédito a través de la consola y se
     * comprueba que tenga el formato de uno.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string introducido por consola como numero de tarjeta de
     * credito que haya cumplido las condiciones.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public String getTarjetaCredito(String str_) {
        Pattern pattern = Pattern.compile("[0-9]{16}");
        Matcher matcher_;
        String ttcc;
        while (true) {
            ttcc = this.getString(str_, 16);
            matcher_ = pattern.matcher(ttcc);
            if (matcher_.matches()) {
                return ttcc;
            }
        }
    }

    /**
     * <p>
     * Se pide un número de telefono a través de la consola y se comprueba que
     * tenga el formato de uno.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string introducido por consola como numero de teléfono válido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public String getTelefono(String str_) {
        Pattern pattern = Pattern.compile("[0-9]{4,}");
        Matcher matcher_;
        String ttcc;
        while (true) {
            ttcc = this.getString(str_);
            matcher_ = pattern.matcher(ttcc);
            if (matcher_.matches()) {
                return ttcc;
            }
        }
    }

    /**
     * <p>
     * Se pide un horario (hh:mm-hh:mm) a través de la consola y se comprueba que
     * tenga el formato de uno.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string introducido por consola como horario válido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public String getHorario(String str_) {
        Pattern pattern = Pattern.compile("[0-9]{2}+:+[0-9]{2}" + "-" + "[0-9]{2}+:+[0-9]{2}");
        Matcher matcher_;
        String horario;
        while (true) {
            horario = this.getString(str_);
            matcher_ = pattern.matcher(horario);
            if (matcher_.matches()) {
                if (Integer.parseInt(horario.substring(0, 2)) < 24
                        && Integer.parseInt(horario.substring(3, 5)) < 60
                        && Integer.parseInt(horario.substring(6, 8)) < 24
                        && Integer.parseInt(horario.substring(9, 11)) < 60) {
                    return horario;
                }
            }
        }
    }

    /**
     * <p>
     * Se pide una pagina web (la url) a través de la consola y se comprueba que
     * tenga el formato de una.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string introducido por consola como pagina web válida.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public String getWeb(String str_) {
        Pattern pattern = Pattern.compile("^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))"
                + "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$, A-Za-z0-9])+)" + "([).!';/?:, ][[:blank:]])?$");
        Matcher matcher_;
        String web;
        while (true) {
            web = this.getString(str_);
            matcher_ = pattern.matcher(web);
            if (matcher_.matches()) {
                return web;
            }
        }
    }

    /**
     * <p>
     * Pide un string que se debe corresponder con el path de una foto, en el
     * caso de que la foto exista, la copia en <b>./resources/imagenes</b>
     * para poder acceder a ella más tarde aunque se borre la original y
     * finalmente crea un objeto Icon de la imagen copiada y lo devuelve.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return un objeto de la clase <b>Icon</b>.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    public Icon getImage(String str_) {
        boolean run = true;
        File imgFolder = new File("./resources/imagenes/");
        String address;
        String newAddress = "./resources/imagenes/";
        newAddress += imgFolder.listFiles().length + "_";
        while (run) {
            System.out.println("Introduzca la dirección en su ordenador de una imagen del producto:\n"
                    + "(La separación entre carpetas se indicará con /)\n"
                    + "(Indicar el formato de la imagen con .jpg, .png ...)");
            address = this.getString(str_);
            try {
                File imagen = new File(address);
                if (!imagen.exists()) {
                    throw new RuntimeException("La foto no existe");
                } else if (imagen.isDirectory()) {
                    throw new RuntimeException("Lo que se introdujo no es una foto");
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

    /**
     * <p>
     * Pide un numero del 1 al 5 que se corresponda con alguno de los estados
     * enumeradas previamente en la consola.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return un estado del enum Estado.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide un numero del 1 al 6 que se corresponda con alguna de las categorías
     * enumeradas previamente en la consola.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return una categoría del enum Categoria.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola un número entero hasta que este sea introducido.</p>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el número entero introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola un número entero que se encuente entre dos limites (o en
     * los limites) hasta que este sea introducido.</p>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param low limite inferior para el numero que se pide.
     * @param high limite superior para el numero que se pide.
     *
     * @return el número entero introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola un número decimal hasta que este sea introducido.</p>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el número decimal introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola un número decimal que se encuente entre dos limites (o
     * en los limites) hasta que este sea introducido.</p>
     *
     * @param str un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param low limite inferior para el numero que se pide.
     * @param high limite superior para el numero que se pide.
     *
     * @return el número decimal introducido por consola.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola una cadena de texto.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     *
     * @return el string de texto introducido por la consola.
     *
     * @author Eduardo Ruiz Sabajanes
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

    /**
     * <p>
     * Pide por consola una cadena de texto de una longitud determinada.</p>
     *
     * @param str_ un string que mostrar en la consola para indicar que se está
     * pidiendo una entrada.
     * @param length_ longitud que debe tener la entrada.
     *
     * @return el string de texto introducido por la consola.
     *
     * @author Eduardo Ruiz Sabajanes
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
