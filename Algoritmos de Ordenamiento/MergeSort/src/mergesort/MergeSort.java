/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author Lesther
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
   

    // Método que mezcla dos partes ordenadas del arreglo
    static void merge(int arr[], int left, int middle, int right) {
        // Calculamos el tamaño de las dos mitades del arreglo
        int leftSize = middle - left + 1; // Tamaño de la primera mitad del arreglo
        int rightSize = right - middle;   // Tamaño de la segunda mitad del arreglo

        // Creamos arreglos temporales para almacenar las dos mitades
        int leftArray[] = new int[leftSize];  // Arreglo temporal para la primera mitad
        int rightArray[] = new int[rightSize]; // Arreglo temporal para la segunda mitad

        // Copiamos los elementos de la primera mitad del arreglo original al arreglo temporal leftArray[]
        for (int i = 0; i < leftSize; i++)
            leftArray[i] = arr[left + i]; // Copia los elementos del arreglo original al arreglo temporal

        // Copiamos los elementos de la segunda mitad del arreglo original al arreglo temporal rightArray[]
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = arr[middle + 1 + j]; // Copia los elementos del arreglo original al arreglo temporal

        // Inicializamos los índices para recorrer los arreglos temporales leftArray[] y rightArray[]
        int i = 0, j = 0;

        // Índice k para colocar los elementos ordenados de vuelta en el arreglo original arr[]
        int k = left;

        // Comparamos los elementos de los dos subarreglos -> leftArray[] y rightArray[]
        // los colocamos en el arreglo original en el orden correcto
        while (i < leftSize && j < rightSize) {
            // Si el elemento en leftArray[i] es menor o igual al de rightArray[j]
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i]; // Coloca el elemento de leftArray[] en el arreglo original
                i++; // Avanza al siguiente elemento en leftArray[]
            } else {
                arr[k] = rightArray[j]; // Coloca el elemento de rightArray[] en el arreglo original
                j++; // Avanza al siguiente elemento en rightArray[]
            }
            k++; // Avanza al siguiente índice en el arreglo original
        }

        // Si quedan elementos en leftArray[], es decir, no hemos procesado todos los elementos, los copiamos al arreglo original
        while (i < leftSize) {
            arr[k] = leftArray[i]; // Coloca el elemento restante de leftArray[] en el arreglo original
            i++; // Avanza al siguiente elemento en leftArray[]
            k++; // Avanza al siguiente índice en el arreglo original
        }

        // Si quedan elementos en rightArray[], es decir, no hemos procesado todos los elementos, los copiamos al arreglo original
        while (j < rightSize) {
            arr[k] = rightArray[j]; // Coloca el elemento restante de rightArray[] en el arreglo original
            j++; // Avanza al siguiente elemento en rightArray[]
            k++; // Avanza al siguiente índice en el arreglo original
        }

        // En este punto, el arreglo original 'arr[]' está parcialmente ordenado:
        // Las dos mitades del arreglo original han sido combinadas de forma ordenada
    }   
    // Método que divide el arreglo en mitades y las ordena recursivamente
    static void sort(int arr[], int left, int right) {
        if (left < right) { // Verificamos que haya más de un elemento para dividir
            // Calculamos el punto medio
            int middle = left + (right - left) / 2;

            // Ordenamos la primera mitad del arreglo
            sort(arr, left, middle);

            // Ordenamos la segunda mitad del arreglo
            sort(arr, middle + 1, right);

            // Mezclamos ambas mitades ordenadas en una sola lista
            merge(arr, left, middle, right);
        }

        // Durante el proceso de ordenación, el arreglo se va dividiendo en mitades:
        // Inicialmente, el arreglo es:
        // [12, 11, 13, 5, 6, 7]

        // Después de dividir, las mitades serían:
        // [12, 11, 13] y [5, 6, 7]

        // Al seguir dividiendo, obtenemos:
        // [12, 11] y [13], y [5, 6] y [7]

        // Luego de ordenar cada mitad individualmente, combinamos las mitades ordenadas:
        // [11, 12] y [13], y [5, 6] y [7]

        // Y finalmente, después de mezclar todas las partes, obtenemos el arreglo ordenado:
        // [5, 6, 7, 11, 12, 13]
    }

    // Método para imprimir el arreglo en la pantalla
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) // Recorremos el arreglo
            System.out.print(arr[i] + " "); // Mostramos cada número separado por un espacio
        System.out.println(); // Salto de línea al final
    }

    // Método principal (main), que ejecuta el programa
    public static void main(String args[]) {
        // Definimos un arreglo desordenado
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Arreglo original:");
        printArray(arr); // Mostramos el arreglo original en pantalla

        // Llamamos al método sort para ordenar el arreglo
        sort(arr, 0, arr.length - 1);

        // Mostramos el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        printArray(arr);
    }


}
