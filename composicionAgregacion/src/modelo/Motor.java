/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lesther
 */
public class Motor {
    private String tipo; 
    public Motor(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
}
//Un carro sin motor no funciona 