/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilo;

import Modelo.Reloj;
import Vista.Vista;

/**
 *
 * @author Lesther
 */
public class Hilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo.Proceso p1 = new Modelo.Proceso(vista);
        Modelo.Proceso2 p2 = new Modelo.Proceso2(vista);
        Reloj reloj =new Reloj(vista);
        p1.start();
        p2.start();
        reloj.start();
    
    }
    
}
