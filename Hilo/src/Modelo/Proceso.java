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
public class Proceso extends Thread{
    private Vista vista;
    public Proceso(Vista vista){
        this.vista = vista;
    }
    
    public void run(){
        for(int i=0; i<= 100; i++){
            vista.mostrarMensaje("Proceso 1");
            try{
                sleep(300);
            }catch (InterruptedException e){
                vista.mostrarMensaje("ERROR");
            }
        }
    }
      
}
