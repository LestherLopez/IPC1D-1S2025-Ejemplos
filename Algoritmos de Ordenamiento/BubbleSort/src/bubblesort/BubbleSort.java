/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author Lesther
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    // Método que implementa el algoritmo de ordenamiento burbuja
    // Este método recibe un arreglo de números y su tamaño
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped; // Variable para saber si hubo intercambios en una iteracion
        // Recorremos el arreglo varias veces (n-1 iteraciones como máximo) 
        for (i = 0; i < n - 1; i++) {
            swapped = false; // Al inicio de cada iteracion, asumimos que no habrá intercambios

            // Este segundo bucle compara los elementos de dos en dos
            for (j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (arr[j] > arr[j + 1]) {
                    // Intercambiamos los valores de arr[j] y arr[j + 1]
                    temp = arr[j]; // Guardamos temporalmente el valor de arr[j]
                    arr[j] = arr[j + 1]; // Reemplazamos arr[j] con el valor de arr[j + 1]
                    arr[j + 1] = temp; // Asignamos a arr[j + 1] el valor guardado en temp
                    swapped = true; // Marcamos que hubo un intercambio
                }
            }

            // Si en esta pasada no hubo intercambios, significa que el arreglo ya está ordenado
            // y no necesitamos seguir iterando, por lo que salimos del bucle.
            if (!swapped){
                break;
            }
        }
    }

    // Método que imprime todos los elementos de un arreglo en la consola
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " "); // Imprime cada número seguido de un espacio
        System.out.println(); // Salto de línea al final para mejor visualización
    }

    // Método principal del programa (punto de entrada)
    public static void main(String args[]) {
        // Creamos un arreglo con valores desordenados
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length; // Obtenemos el tamaño del arreglo

        // Llamamos al método bubbleSort para ordenar el arreglo
        System.out.println("Arreglo antes de ordenar:");
        printArray(arr, n); // Mostramos el arreglo original

        bubbleSort(arr, n); // Aplicamos el algoritmo de ordenamiento burbuja

        // Mostramos el resultado después de ordenar
        System.out.println("Arreglo ordenado:");
        printArray(arr, n);
    }
}
