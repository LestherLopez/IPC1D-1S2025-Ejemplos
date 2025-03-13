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
SE CAMBIO EL FOR POR UN WHILE, EL CUAL PERMITE EJECUTAR EL RELOJ DE MANERA INDEFINIDA, YA QUE CON FOR TENIAMOS UN LIMITE ES
MEJOR MANEJAR ESTO CON UN WHILE INDEFINIDO.
*/