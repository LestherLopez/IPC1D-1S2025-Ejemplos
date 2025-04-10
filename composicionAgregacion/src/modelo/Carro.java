/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lesther
 */
public class Carro {
    private String modelo;
    private Motor motor; // Esencial que carro tenga un motor, composicion.
    private Servicio[] servicios; // agregacion, un carro puede tener o no tener servicios.
    public Carro(String modelo, String tipoMotor, Servicio[] servicios){
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor);
        this.servicios = servicios;
        
    }        
    //devolvemos cadena
    public String getModelo(){
        return modelo;
    }
    // devolvemos clase
    public Motor getMotor(){
        return motor;
    }
    
    // devolvemos servicio
    public Servicio[] getServicios(){
        return servicios;
    }
}
