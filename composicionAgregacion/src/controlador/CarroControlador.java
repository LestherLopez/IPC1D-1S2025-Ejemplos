/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Carro;
import vista.CarroVista;

/**
 *
 * @author Lesther
 */
public class CarroControlador {
    private Carro modelo;
    private CarroVista vista;

    public CarroControlador(Carro modelo, CarroVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void mostrarCarro(){
        vista.mostrarInfoCarro(modelo.getModelo(), modelo.getMotor().getTipo(), modelo.getServicios());
        
    }
}
