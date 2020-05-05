package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 * @author Luis Miguel Sobrino Zamora
 */
public class GuardarLeerObjetos {

    private static void crearUsuariosDat() {
        try {
            File usuariosDat = new File("./resources/datFiles/usuarios.dat");
            if (!usuariosDat.exists()) {
                usuariosDat.createNewFile();
                System.out.println("Se creo el fichero usuarios.dat");
            }
        } catch (IOException ex) {
                System.out.println(ex);
        }
    }

    private static void crearProductosDat() {
        try {
            File productosDat = new File("./resources/datFiles/productos.dat");
            if (!productosDat.exists()) {
                productosDat.createNewFile();
                System.out.println("Se creo el fichero productos.dat");
            }
        } catch (IOException ex) {
                System.out.println(ex);
        }
    }

    public static void guardarUsuarios(ArrayList<Usuario> userList) {
        try {
            FileOutputStream fos = new FileOutputStream("./resources/datFiles/usuarios.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < userList.size(); i++) {
                oos.writeObject(userList.get(i));
            }
            fos.close();
            oos.close();
        } catch (IOException ex) {
                System.out.println(ex);
        }
    }

    public static void guardarProductos(ArrayList<Producto> productList) {
        try {
            FileOutputStream fos = new FileOutputStream("./resources/datFiles/productos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < productList.size(); i++) {
                oos.writeObject(productList.get(i));
            }
            fos.close();
            oos.close();
        } catch (IOException ex) {
                System.out.println(ex);
        }
    }

    public static ArrayList<Usuario> leerUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        boolean run = true;
        while (run) {
            try {
                FileInputStream fis = new FileInputStream("./resources/datFiles/usuarios.dat");
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(fis);
                    while (true) {
                        usuarios.add((Usuario) ois.readObject());
                    }
                } catch (EOFException ex) {
                    System.out.println("Lectura de usuarios finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    System.out.println("Aun no hay usuarios!!");
                    System.out.println(ex);
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearUsuariosDat();
                ArrayList<Usuario> admList = new ArrayList();
                admList.add(new Admin());
                guardarUsuarios(admList);
                usuarios = leerUsuarios();
                run = false;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return usuarios;
    }

    public static ArrayList<Producto> leerProductos() {
        ArrayList<Producto> productList = new ArrayList();
        boolean run = true;
        while (run) {
            try {
                FileInputStream fis = new FileInputStream("./resources/datFiles/productos.dat");
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(fis);
                    while (true) {
                        productList.add((Producto) ois.readObject());
                    }
                } catch (EOFException ex) {
                    System.out.println("Lectura de productos finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    // System.out.println(ex + ": Aun no hay productos");
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearProductosDat();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return productList;
    }
}
