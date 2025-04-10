/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicionagregacion;

import controlador.CarroControlador;
import modelo.Carro;
import modelo.Servicio;
import vista.CarroVista;

/**
 *
 * @author Lesther
 */
public class ComposicionAgregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println("Hola");
       Servicio[] servicios = new Servicio[2];
       servicios[0] = new Servicio("cambio de aceite");
       servicios[1] = new Servicio("cambio de llantas");
       
       Carro carro = new Carro("Toyota", "motor", servicios);
       CarroVista vista = new CarroVista();
       CarroControlador controlador = new CarroControlador(carro, vista);
       controlador.mostrarCarro();
    }
    
}
