/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lesther
 */
public class Servicio {
    private String descripcion;
    public Servicio(String descripcion) {
        this.descripcion = descripcion;
    }
    //metod get de descripcion de servicio
    public String getDescripcion(){
        return descripcion;
    }
}
