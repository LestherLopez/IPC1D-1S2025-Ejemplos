/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progressbar;
// importacion de clases
import javax.swing.SwingUtilities; // clase para actualizar la interfaz

/**
 *
 * @author Lesther
 */
public class Progreso {
    // referencia a la vista
    vistaCarga vista;
    // arreglo con capacidad para 10 registros
    private int[] colaVehiculos = new int[10]; 
    // variable que nos indica cuantos registros se han agregado
    private int indiceActual = 0;    
    // variable que nos da el indice del registro que esta en proceso
    private int indiceProcesado = 0; 
    // constructor de la clase que recibe la vista
    public Progreso(vistaCarga vista) {
        this.vista = vista;
        // bloque para iniciar hilos de los procesos
        new Thread(this::cargarColaEspera).start();
    }
    // metodo para agregar registros a la cola
    public void agregarVehiculo(int idVehiculo) {
        
       
        // Guardamos el ID del vehículo en el arreglo
        colaVehiculos[indiceActual] = idVehiculo;
        System.out.println("Vehículo " + idVehiculo + " agregado.");
        indiceActual++; // aumentar el contador de vehiculos agregados
     
    }
    // simulacion de la barra de progreso de la cola de espera
    public void cargarColaEspera() {
        while (true) {
            // verificar que aun queden por procesar en la cola, comparando el numero de registro con el numero total de registros
            if (indiceProcesado < indiceActual) {
                // obtener el vehiculo o el id de lo que se va procesar.
                int vehiculo = colaVehiculos[indiceProcesado];
                // simular la barra de 0 a 100
                for (int i = 0; i <= 100; i++) {
                    final int progreso = i; // valor que se asigna a la barra de progreso
                    SwingUtilities.invokeLater(() -> vista.progressBar.setValue(progreso)); 
                    try {
                        Thread.sleep(100); // Espera entre cada incremento 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); //si falla colocar el hilo como interrumpido
                    }
                }
                // al completar la barra de progreso se actualiza el label con los registros procesados
                SwingUtilities.invokeLater(() -> vista.lblCola.setText("registro procesado: " + vehiculo));
                System.out.println("Vehículo " + vehiculo + " procesado.");
                // -- mandar los registros o vehiculos a otro vector para poder pasar a otro proceso--
                indiceProcesado++;
            } else {
                try {
                    Thread.sleep(500); // espera 500 ms si no hay nada que procesar
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // interrumpir hilo
                }
            }
        }
    }
}
