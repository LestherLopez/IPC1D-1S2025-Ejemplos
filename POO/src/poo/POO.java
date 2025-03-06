/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import Controller.Controlador;
import Model.Usuario;
import View.Vista;

/**
 *
 * @author Lesther
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        Usuario modelo = new Usuario("Auxiliar", "YS3", "Apellido", "auxiliar@gmail.com", "123456789801");
       Controlador controlador = new Controlador(vista, modelo);
       controlador.CrearCuenta("123A", "Ahorro");
       controlador.MostrarInformacion();
    }
    
}
