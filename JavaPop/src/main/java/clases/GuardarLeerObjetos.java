package clases;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes y Luis Miguel Sobrino Zamora
 */
public class GuardarLeerObjetos {
    
    public void GuardarCliente(Cliente c) throws IOException{
        FileOutputStream fosClientStorage = new FileOutputStream("clientes.dat");
        ObjectOutputStream oosClientStorage = new ObjectOutputStream(fosClientStorage);
        oosClientStorage.writeObject(c);
        fosClientStorage.close();
        oosClientStorage.close();
    }
    
    public ArrayList<Cliente> LeerClientes() throws FileNotFoundException, IOException{
        ArrayList<Cliente> Clientes = new ArrayList();
        FileInputStream fisClientStorage = new FileInputStream("clientes.dat");
        ObjectInputStream oisClientStorage = new ObjectInputStream(fisClientStorage);
        try{
            while (true){
                Clientes.add((Cliente) oisClientStorage.readObject());
            }
        }catch(Exception e){
            System.out.println(e);
        }
        fisClientStorage.close();
        oisClientStorage.close();
        return Clientes;
    }
    
    public void GuardarProducto(Producto p) throws IOException{
        FileOutputStream fosProductStorage = new FileOutputStream("clientes.dat");
        ObjectOutputStream oosProductStorage = new ObjectOutputStream(fosProductStorage);
        oosProductStorage.writeObject(p);
        fosProductStorage.close();
        oosProductStorage.close();
    }
    
    public ArrayList<Producto> LeerProductos() throws ClassNotFoundException, IOException{
        FileInputStream fisProductStorage;
        ObjectInputStream oisProductStorage;
        oisProductStorage.readObject();
    }
}
