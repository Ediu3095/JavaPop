package clases.utils;

import clases.Producto;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class Searching {

    public static void merge(ArrayList<Producto> arr, int index1, int index2) {

    }

    public static void sort(ArrayList<Producto> arr, int i, int j) {
        if (i == j) {
            
        } else {
            int middle = (i + j) / 2;

            sort(arr, i, middle);
            sort(arr, middle + 1, j);
        }

    }

    public static ArrayList<Producto> ordenarProductos(ArrayList<Producto> arr, String[] keyWords) {
        String[] productoActual;
        int[] coincidences = new int[arr.size()];
        for (int index = 0; index < arr.size(); index++) {
            productoActual = arr.get(index).getTitulo;
        }
    }
}
