package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import clases.enumeradores.*;

public class FuncionesEstaticas {

    // Funciones de entrada de datos por consola
    public static String getCorreo() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String correo;
        char[] correoChars;
        int atCounter = 0;
        int atPosition = 0;
        try {
            correo = read.readLine();
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
            return "Error";
        } catch (RuntimeException e) {
            System.out.println(e);
            return "Error";
        }
    }

    public static Categoria getCategoria() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String cat;
        Categoria categoria = Categoria.Moda_y_accesorios;
        boolean run = true;
        while (run) {
            try {
                cat = read.readLine().toLowerCase();
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
}
