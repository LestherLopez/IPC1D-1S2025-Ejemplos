/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

/**
 *
 * @author Lesther
 */
import Controller.Controlador;
import Model.Persona;
import View.Vista;
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        // Utilizar controladores
        Persona persona  = new Persona("estudiante1", 18,"ingeniero" );
        Controlador controlador = new Controlador(persona, vista);
        Persona persona1  = new Persona("estudiante2",  18, "bombero" );
        Controlador controlador1 = new Controlador(persona1, vista);
        
        //utilizar funciones controlador
        controlador.accionPersona();
        controlador1.accionPersona();
    }
    
}
