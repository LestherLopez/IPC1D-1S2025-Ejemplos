/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Vista;

/**
 *
 * @author Lesther
 */
public class Reloj extends Thread{
    private Vista vista;
    int minutos =0;
    int segundos = 0;
    public Reloj(Vista vista){
        this.vista = vista;
    }
    
    public void run(){
          
        vista.mostrarMensaje("hilo reloj");
        while (true) {  // 🔹 Mantiene la ejecución continua
            vista.mostrarMensaje("--> M: " + minutos + " S: " + segundos);
            
            segundos++; // 🔹 Incrementa correctamente
            
            if (segundos == 30) {
                segundos = 0;
                minutos++;
            }
            
            try {
                sleep(1000); // 🔹 Ahora es 1 segundo por cada iteración
            } catch (InterruptedException e) {
                vista.mostrarMensaje("ERROR en el hilo Reloj");
                break;
            }
        }
        
       
    }
     
}
/*CORRECCION
Se cambio el for por un while, el cual permite que el reloj avance de manera continua y realista, 
esperando 1 segundo en cada iteración.
*/