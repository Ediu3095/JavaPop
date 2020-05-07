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

    private static void crearClientesDat() {
        try {
            File clientesDat = new File("./resources/datFiles/clientes.dat");
            if (!clientesDat.exists()) {
                clientesDat.createNewFile();
                System.out.println("Se creo el fichero clientes.dat");
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

    public static void guardarClientes(ArrayList<Cliente> userList) {
        try {
            FileOutputStream fos = new FileOutputStream("./resources/datFiles/clientes.dat");
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

    public static ArrayList<Cliente> leerClientes() {
        ArrayList<Cliente> clientes = new ArrayList();
        boolean run = true;
        while (run) {
            try {
                FileInputStream fis = new FileInputStream("./resources/datFiles/clientes.dat");
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(fis);
                    while (true) {
                        clientes.add((Cliente) ois.readObject());
                    }
                } catch (EOFException ex) {
                    System.out.println("Lectura de clientes finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    System.out.println("Aun no hay clientes!!");
                    System.out.println(ex);
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearClientesDat();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return clientes;
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
