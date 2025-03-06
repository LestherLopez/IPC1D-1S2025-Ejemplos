/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lesther
 */
public class Cuentas {
    private String idCuenta;
    private String tipoCuenta;
    
    public Cuentas(){
        // iniciar cuentas vacias
    }
    //sobrecarga de constructor
    public Cuentas(String idCuenta, String tipoCuenta){
        this.idCuenta= idCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    
    public void setIdCuenta(String idCuenta){
        this.idCuenta = idCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public String retornoCuenta(){
        if(this.idCuenta.isEmpty() || this.tipoCuenta.isEmpty()){
            return "No hay cuentas";
        }
        return "idCuenta: " + this.idCuenta + " tipo: " + this.tipoCuenta + "\n";
        
    }
    
}
