/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Vista;

import Model.Usuario;
/**
 *
 * @author Lesther
 */
public class Controlador {

    public Vista vista;
    public Usuario usuario;

    public Controlador(Vista vista, Usuario usuario) {
        this.vista = vista;
        this.usuario = usuario;
    }
    public void CrearUsuario(String nombre, String idUsuario, String apellido, String correo, String cui){
        Usuario auxiliar = new Usuario(nombre, idUsuario, apellido, correo, cui);
        this.usuario = auxiliar;
    }
   
   public void CrearCuenta(String idCuenta, String tipoCuenta){
       usuario.agregarCuenta(idCuenta, idCuenta);
   }
    
   public void MostrarInformacion(){
       vista.imprimir(usuario.retornarCuentasUsuario());
   }
}
