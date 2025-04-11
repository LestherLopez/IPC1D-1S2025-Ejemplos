/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progressbar;

/**
 *
 * @author Lesther
 */
public class Progressbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancia de vista
        vistaCarga vista = new vistaCarga();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        // instancia de progreso
        Progreso progreso = new Progreso(vista);
        // enviar los registros (vehiculos) a la cola, los cuales son 5
        for (int i=1; i<=5; i++){
            progreso.agregarVehiculo(i);
            try{
                // se hace pausa de 2 segundos entre cada registro enviado (2000ms)
                Thread.sleep(2000);
            }catch(InterruptedException e){
                // si el hilo falla en el sleep se coloca como interrumpido.
                Thread.currentThread().interrupt();
            }
                  
        }
        
    }
    
}
