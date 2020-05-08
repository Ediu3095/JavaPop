package clases.utils;

import clases.Producto;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class Searching {

    private static void swap(int[] arr, int a, int b){
        int store = arr[a];
        arr[a] = arr[b];
        arr[b] = store;
    }

    private static int partition(int[] arr, int low, int high) {
        int index = low;
        for (int i = low; i<high; i++) {
                if (arr[i]<arr[high]) {
                        swap(arr, i, index);
                        index++;
                }
        }
        swap(arr, index, high);
        return index;
    }

    public static void quick_sort(int[] arr, int low, int high) {
        int pivot;
        if(low<high) {
                pivot = partition(arr, low, high);
                quick_sort(arr, low, pivot-1);
                quick_sort(arr, pivot+1, high);
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
