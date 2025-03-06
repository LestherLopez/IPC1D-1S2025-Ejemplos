/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lesther
 */
public class Usuario {
    private String nombre;
    private String idUsuario;
    private String apellido;
    private String correo;
    private String cui;
    Cuentas [] cuentas = new Cuentas[4];

    public Usuario(String nombre, String idUsuario, String apellido, String correo, String cui) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.apellido = apellido;
        this.correo = correo;
        this.cui = cui;
    }
    // metodo agregar cuentas
    public void agregarCuenta(String idCuenta, String tipoCuenta){
        int i = 0; //vector empieza desde 0
        while(true){
            if (i >= 4){
                System.out.println("No se pueden agregar mas cuentas");
                 break;
            }
            if (cuentas[i]!=null){ // verificar si cuenta ya esta usada no hacer nada
                i++;
                continue;
            } else{ 
                Cuentas auxiliar = new Cuentas(idCuenta, tipoCuenta);
                cuentas[i] = auxiliar;
                break;
            }
        }
    }
    
    public String retornarCuentasUsuario(){
        String variable = "";
        for(int i=0; i<cuentas.length; i++){
            if(cuentas[i] != null){
                variable += cuentas[i].retornoCuenta();
            }
        }
        return variable;
    }
}
