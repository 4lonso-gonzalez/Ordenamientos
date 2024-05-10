/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos.de.odenamientos;
import java.util.Scanner;

/**
 *
 * @author alons
 */
public class MetodosDeOdenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("MENU ORDENAMIENTOS");
            System.out.println("1. Metodo BubleSort");
            System.out.println("2. Metodo SelectionSort");
            System.out.println("3. Metodo InsertionSort");
            System.out.println("4. Metodo ShellSort");
            System.out.println("5. Metodo MergeSort");
            System.out.println("6. Metodo QuickSort");
            System.out.println("7. Cerrar Menu");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            Ordenamientos metodo = new Ordenamientos();
            int array[] = {54, 26, 93, 17, 77, 31, 44, 55, 20};

            switch (opcion) {
                case 1:
                    metodo.BubleSort(array);
                    break;
                case 2:
                    metodo.SelectionSort(array);
                    break;
                case 3:
                    metodo.InsertionSort(array);
                    break;
                case 4:
                    metodo.ShellSort(array);
                    break;
                case 5:
                    metodo.mergeSort(array);
                    break;
                case 6:
                    System.out.println("Array inicial: ");
                    metodo.MuestraArray(array);
                    metodo.quickSort(array, 0, array.length - 1);
                    metodo.intercambiosQuick();
                    break;
                case 7:
                    System.out.println("Cerrando Menu...");
                    break;
            }

        } while (opcion != 7);
    }
}

