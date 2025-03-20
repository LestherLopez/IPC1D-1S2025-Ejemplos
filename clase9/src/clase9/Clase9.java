/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lesther
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la ruta de tu archivo: ");
        String nombreArchivo = scanner.nextLine();
        File archivo = new File(nombreArchivo);
        if(!archivo.exists()){
            System.out.println("Error: no se encontro");
            return;
        }
        leerCSV(nombreArchivo);
    }
    
    public static void leerCSV(String nombreArchivo){
        try(BufferedReader lector  = new BufferedReader(new FileReader(nombreArchivo))){
            String fila;
            int contador = 0;
            String encabezado = lector.readLine();
            System.out.println(encabezado);
            while ((fila = lector.readLine()) != null){
                //valor1,valor -> [valor1, valor2]
                String [] datos = fila.split(",");
               if (datos.length < 2){
                    continue;
                } 
                String nombreJuego = datos[0];
                int cantidad = Integer.parseInt(datos[1]);
                System.out.println("juego: " + nombreJuego + " Cantidad: "+ cantidad);
                contador++;
            }
            System.out.println("Todos los juegos leidos: "+contador);
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
    
}
