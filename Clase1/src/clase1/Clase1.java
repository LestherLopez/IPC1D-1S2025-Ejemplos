/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

/**
 *
 * @author Lesther
 */
import java.util.Scanner;
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mi primer comentario
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Mi primer menu");
            System.out.println("1. Un saludo");
            System.out.println("2. Calcular suma de dos numeros");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("hola " + nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    int numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int numero2 = scanner.nextInt();
                    System.out.println(numero1 + numero2);
                    break;
                case 3:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (opcion != 3);
        
    }
    
}
