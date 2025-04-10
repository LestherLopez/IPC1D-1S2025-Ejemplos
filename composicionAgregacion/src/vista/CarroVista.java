/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Servicio;

/**
 *
 * @author Lesther
 */
public class CarroVista {
    public void mostrarInfoCarro(String modelo, String tipoMotor, Servicio[] servicios){
        System.out.println("Modelo de carro: " + modelo);
        System.out.println("tipo de motor: " + tipoMotor);
        System.out.println("SERVICIOS ASOCIADOS: ");
        for(int i=0; i<servicios.length; i++){
            if(servicios[i]!=null){
                System.out.println("-" + servicios[i].getDescripcion());
            }
        }
    }
}
