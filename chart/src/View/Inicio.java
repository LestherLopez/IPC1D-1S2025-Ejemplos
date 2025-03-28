/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.DatosGrafico;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

/**
 *
 * @author Lesther
 */
public class Inicio extends javax.swing.JFrame {

    

  
    public Inicio() {
        // se inicializan los componentes de la ventana
        initComponents();
       
    }


    public void mostrarGrafico(DatosGrafico datos) {
        // Se crea un objeto DefaultCategoryDataset para almacenar los datos que se usarán en el gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Se obtienen las categorías y los valores desde el objeto DatosGrafico que se pasa como parámetro
        String[] categorias = datos.getCategorias();
        int[] valores = datos.getValores();

        // Se recorren las categorías y los valores, y se agregan al dataset para poder crear la grafica de barras
        for (int i = 0; i < categorias.length; i++) {
            // Se agrega cada valor al dataset, el primer parámetro es el valor,
            // el segundo es la serie (en este caso "Ventas"), y el tercero es la categoría
            dataset.addValue(valores[i], "Ventas", categorias[i]);
        }

        // Se crea el gráfico de barras utilizando el dataset creado anteriormente
        JFreeChart barChart = ChartFactory.createBarChart(
                "Ventas por Producto", // Título del gráfico
                "Producto",            // Etiqueta del eje X (categorías de productos)
                "Cantidad",            // Etiqueta del eje Y (valores de ventas)
                dataset               // El dataset que contiene los datos
        );

        // Se crea un panel para mostrar el gráfico, el ChartPanel es un contenedor especializado en mostrar gráficos
        ChartPanel chartPanel = new ChartPanel(barChart);

        // Se ajusta el tamaño del panel del gráfico al tamaño del JPanel en el cual se mostrará
        chartPanel.setSize(jPanel1.getWidth(), jPanel1.getHeight());

        // Se establece el layout de jPanel1 como BorderLayout para que el gráfico se ajuste correctamente
        jPanel1.setLayout(new java.awt.BorderLayout());

        // Se agrega el panel del gráfico (chartPanel) a jPanel1
        jPanel1.add(chartPanel);

        // Se actualiza el diseño y se vuelve a dibujar el JPanel para asegurarse de que el gráfico se muestre correctamente
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
