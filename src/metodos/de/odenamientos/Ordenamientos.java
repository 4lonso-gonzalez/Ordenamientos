/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.odenamientos;

/**
 *
 * @author alons
 */
public class Ordenamientos {

    public void MuestraArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println("");
        System.out.println("");
    }

    public void BubleSort(int[] a) {
        System.out.println("Array inicial: ");
        this.MuestraArray(a);
        int n = a.length;
        int temp = 0;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {  
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    contador++;
                    System.out.println("Paso " + contador);
                    this.MuestraArray(a);
                }
            }
        }
        System.out.println("Intercambios totales: " + contador);
    }

    public void SelectionSort(int[] a) {
        System.out.println("Array inicial: ");
        this.MuestraArray(a);
        int n = a.length;
        int contador = 0;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar arreglo[i]
            //y arreglo[indiceMinimo]
            int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
            contador++;
            System.out.println("Paso " + contador);
            this.MuestraArray(a);
        }
        System.out.println("Intercambios totales: " + contador);
    }

    public void InsertionSort(int[] a) {
        System.out.println("Array inicial: ");
        this.MuestraArray(a);
        int n = a.length;
        int contador = 0;
        for (int i = 1; i < n; i++) {
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = valorActual;
            contador++;
            System.out.println("Paso " + contador);
            this.MuestraArray(a);
        }
        System.out.println("Intercambios totales: " + contador);
    }

    public void ShellSort(int[] a) {
        System.out.println("Array inicial: ");
        this.MuestraArray(a);
        int n = a.length;
        int incremento = n;
        int contador = 0;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        j -= incremento;
                        contador++;
                        System.out.println("Paso " + contador);
                        this.MuestraArray(a);
                    }
                }
            }
        } while (incremento > 1);
        System.out.println("Intercambios totales: " + contador);
    }

    public void mergeSort(int[] a) {
        if (a.length < 2) {
            return;
        }
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
    }

    public void merge(int[] arr, int[] left, int[] right) {
        System.out.println("Array inicial: ");
        this.MuestraArray(arr);
        int i = 0, j = 0, k = 0;
        int contador = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
            contador++;
            System.out.println("Paso " + contador);
            this.MuestraArray(arr);
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
            contador++;
            System.out.println("Paso " + contador);
            this.MuestraArray(arr);
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
            contador++;
            System.out.println("Paso " + contador);
            this.MuestraArray(arr);
        }
        System.out.println("Intercambios totaes: " + contador);
    }
    
    private int contador = 0;
    
    public void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = quick(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
        
    private int quick(int[] a, int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j <= high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        contador++;
        System.out.println("Paso " + contador);
        this.MuestraArray(a);

        return i + 1;
    }
    
    public void intercambiosQuick(){
        System.out.println("Intercambios totales: " + contador);
    }
}
