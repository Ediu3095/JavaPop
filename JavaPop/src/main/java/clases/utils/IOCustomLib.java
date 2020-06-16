package clases.utils;

import clases.Cliente;
import clases.Venta;
import clases.Producto;
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
public class IOCustomLib {

    /**
     * <p>
     * La función crea el fichero <b>ventas.dat</b> en el directorio
     * <b>./resources/datFiles</b>.</p>
     *
     * <p>
     * Esta solamente es llamada en el caso de que el archivo no exista.</p>
     *
     * @author Luis Miguel Sobrino Zamora
     */
    private static void crearVentasDat() {
        try {
            File ventasDat = new File("./resources/datFiles/ventas.dat");
            if (!ventasDat.exists()) {
                ventasDat.createNewFile();
                //System.out.println("Se creo el fichero ventas.dat");
            }
        } catch (IOException ex) {
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función crea el fichero <b>clientes.dat</b> en el directorio
     * <b>./resources/datFiles</b>.</p>
     *
     * <p>
     * Esta solamente es llamada en el caso de que el archivo no exista.</p>
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private static void crearClientesDat() {
        try {
            File clientesDat = new File("./resources/datFiles/clientes.dat");
            if (!clientesDat.exists()) {
                clientesDat.createNewFile();
                //System.out.println("Se creo el fichero clientes.dat");
            }
        } catch (IOException ex) {
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función crea el fichero <b>productos.dat</b> en el directorio
     * <b>./resources/datFiles</b>.</p>
     *
     * <p>
     * Esta solamente es llamada en el caso de que el archivo no exista.</p>
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private static void crearProductosDat() {
        try {
            File productosDat = new File("./resources/datFiles/productos.dat");
            if (!productosDat.exists()) {
                productosDat.createNewFile();
                //System.out.println("Se creo el fichero productos.dat");
            }
        } catch (IOException ex) {
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función reescribe el fichero <b>ventas.dat</b> para que almacene los
     * datos de una lista de ventas que pasaremos como parametro, de forma que
     * se pueda acceder a esta información la siguiente vez que se ejecute el
     * programa.</p>
     *
     * <p>
     * Las ventas se almacenan de una en una de forma que en la lectura también
     * se leeran las ventas como objetos independientes y se deberan volver a
     * almacenar en alguna estructura de datos para su manejo en el
     * programa.</p>
     *
     * @param saleList El ArrayList que contiene las ventas que se han de
     * guardar para la proxima ejecución del programa.
     *
     * @author Luis Miguel Sobrino Zamora
     */
    public static void guardarVentas(ArrayList<Venta> saleList) {
        try {
            FileOutputStream fos = new FileOutputStream("./resources/datFiles/ventas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < saleList.size(); i++) {
                oos.writeObject(saleList.get(i));
            }
            fos.close();
            oos.close();
        } catch (IOException ex) {
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función reescribe el fichero <b>clientes.dat</b> para que almacene los
     * datos de una lista de clientes que pasaremos como parametro, de forma que
     * se pueda acceder a esta información la siguiente vez que se ejecute el
     * programa.</p>
     *
     * <p>
     * Los clientes se almacenan de uno en uno de forma que en la lectura
     * también se leeran los clientes como objetos independientes y se deberan
     * volver a almacenar en alguna estructura de datos para su manejo en el
     * programa.</p>
     *
     * @param userList El ArrayList que contiene los clientes que se han de
     * guardar para la proxima ejecución del programa.
     *
     * @author Eduardo Ruiz Sabajanes
     */
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
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función reescribe el fichero <b>productos.dat</b> para que almacene
     * los datos de una lista de productos que pasaremos como parametro, de
     * forma que se pueda acceder a esta información la siguiente vez que se
     * ejecute el programa.</p>
     *
     * <p>
     * Los productos se almacenan de uno en uno de forma que en la lectura
     * también se leeran los productos como objetos independientes y se deberan
     * volver a almacenar en alguna estructura de datos para su manejo en el
     * programa.</p>
     *
     * @param productList El ArrayList que contiene los productos que se han de
     * guardar para la proxima ejecución del programa.
     *
     * @author Eduardo Ruiz Sabajanes
     */
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
            //System.out.println(ex);
        }
    }

    /**
     * <p>
     * La función lee el fichero <b>ventas.dat</b> y almacena las ventas leídas
     * en una ArrayList de ventas que devolveremos.</p>
     *
     * @return Un <b>ArrayList</b> con todos las ventas almacenadas en el
     * fichero <b>ventas.dat</b>
     *
     * @author Luis Miguel Sobrino Zamora
     */
    public static ArrayList<Venta> leerVentas() {
        ArrayList<Venta> ventas = new ArrayList();
        boolean run = true;
        while (run) {
            try {
                FileInputStream fis = new FileInputStream("./resources/datFiles/ventas.dat");
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(fis);
                    while (true) {
                        ventas.add((Venta) ois.readObject());
                    }
                } catch (EOFException ex) {
                    //System.out.println("Lectura de ventas finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    //System.out.println("Aun no hay ventas!!");
                    //System.out.println(ex);
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearVentasDat();
            } catch (Exception ex) {
                //System.out.println(ex);
            }
        }
        return ventas;
    }

    /**
     * <p>
     * La función lee el fichero <b>clientes.dat</b> y almacena los clientes
     * leídos en una ArrayList de clientes que devolveremos.</p>
     *
     * @return Un <b>ArrayList</b> con todos los clientes almacenados en el
     * fichero <b>clientes.dat</b>
     *
     * @author Eduardo Ruiz Sabajanes
     */
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
                    //System.out.println("Lectura de clientes finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    //System.out.println("Aun no hay clientes!!");
                    //System.out.println(ex);
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearClientesDat();
            } catch (Exception ex) {
                //System.out.println(ex);
            }
        }
        return clientes;
    }

    /**
     * <p>
     * La función lee el fichero <b>productos.dat</b> y almacena los clientes
     * leídos en una ArrayList de productos que devolveremos.</p>
     *
     * @return Un <b>ArrayList</b> con todos los productos almacenados en el
     * fichero <b>productos.dat</b>
     *
     * @author Eduardo Ruiz Sabajanes
     */
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
                    //System.out.println("Lectura de productos finalizada");
                }
                fis.close();
                try {
                    ois.close();
                } catch (NullPointerException ex) {
                    //System.out.println(ex + ": Aun no hay productos");
                }
                run = false;
            } catch (FileNotFoundException ex) {
                crearProductosDat();
            } catch (Exception ex) {
                //System.out.println(ex);
            }
        }
        return productList;
    }
}
