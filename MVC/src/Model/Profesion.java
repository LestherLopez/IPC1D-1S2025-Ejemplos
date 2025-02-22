/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lesther
 */
public class Profesion {
    public String nombreProfesion;

    public Profesion(String nombreProfesion) {
        this.nombreProfesion = nombreProfesion;
    }

    public String getNombreProfesion() {
        return nombreProfesion;
    }

    public void setNombreProfesion(String nombreProfesion) {
        this.nombreProfesion = nombreProfesion;
    }
   
    
    
    public String accionProfesion() {
        return "La persona tiene la profesion " + nombreProfesion;
    }
    
    
}
