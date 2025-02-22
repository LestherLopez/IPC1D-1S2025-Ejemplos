/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Vista;
import Model.Persona;
/**
 *
 * @author Lesther
 */
public class Controlador {
    public Persona persona;
    public Vista vista;
    
    //constructor
    public Controlador(Persona persona, Vista vista){
        this.persona = persona;
        this.vista = vista;
    }
    
    public void accionPersona(){
        vista.imprimir(persona.accionProfesion());
    }
    
    
}
