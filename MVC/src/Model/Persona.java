/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lesther
 */
public class Persona extends Profesion{
    public String nombre;
    private int edad;

    public Persona(String nombre, int edad, String nombreProfesion) {
        super(nombreProfesion);
        this.edad = edad;
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String acccionProfesion(){
        return "La persona de profesion " + getNombreProfesion() + " llamada " + getNombre() + " tiene la edad de: " + getEdad() + " años";
    }
}
