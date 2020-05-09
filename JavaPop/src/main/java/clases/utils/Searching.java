package clases.utils;

import clases.Producto;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class Searching {

    public static void merge(ArrayList<Producto> arr, int i1, int i2, int j1, int j2) {
        Producto aux;
        do {
            if (arr.get(i1).matchDeg < arr.get(j1).matchDeg) {
                aux = arr.get(j1);
                arr.remove(j1);
                arr.add(i1, aux);
                i1++;
                j1++;
            } else if (arr.get(i1).matchDeg == arr.get(j1).matchDeg) {
                if (arr.get(i1).lejania > arr.get(j1).lejania) {
                    aux = arr.get(j1);
                    arr.remove(j1);
                    arr.add(i1, aux);
                    i1++;
                    j1++;
                } else if (arr.get(i1).lejania <= arr.get(j1).lejania) {
                    i1++;
                }
            }else if (arr.get(i1).matchDeg > arr.get(j1).matchDeg) {
                i1++;
            }
        } while (i1 <= i2 && j1 <= j2);
    }

    public static void sort(ArrayList<Producto> arr, int i, int j) {
        if (!(i == j)) {
            int middle = (i + j) / 2;

            sort(arr, i, middle);
            sort(arr, middle + 1, j);

            merge(arr, i, middle, middle + 1, j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> arr = new ArrayList();
        arr.add(new Producto(1, 3));
        arr.add(new Producto(3, 6));
        arr.add(new Producto(3, 8));
        arr.add(new Producto(1, 6));
        arr.add(new Producto(4, 3));
        arr.add(new Producto(0, 7));
        arr.add(new Producto(1, 6));
        arr.add(new Producto(5, 9));
        arr.add(new Producto(3, 1));
        arr.add(new Producto(5, 2));

        sort(arr, 0, arr.size() - 1);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
