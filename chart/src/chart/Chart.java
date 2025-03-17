/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chart;
import Model.DatosGrafico;
import View.Inicio;
/**
 *
 * @author Lesther
 */
public class Chart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] categorias = {"Enero", "Febrero", "Marzo", "Abril"};
        int[] valores = {60, 25, 100, 200};

        // Crear el modelo de datos
        DatosGrafico datos = new DatosGrafico(categorias, valores);

        // Crear la vista y mostrar el gráfico por medio del metodo mostrarGrafico que recibe como parametro los datis
        Inicio inicio = new Inicio();
        inicio.mostrarGrafico(datos);

        // Mostrar la ventana
        inicio.setVisible(true);
    }
    
}
