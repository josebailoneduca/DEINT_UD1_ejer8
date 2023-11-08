/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer8.logica;

import ud1_ejer8.dto.PulsacionesBoton;
import ud1_ejer8.gui.VentanaPrincipal;

/**
 * Logica de negocio de la aplicacion.
 * Recibe mensajes para ir almacenando la cantidad de pulsaciones de
 * los botones
 * @author Jose Javier Bailon Ortiz
 */
public class Logica {
 
    
    /**
     * Almacena las pulsaciones de los botones para mostrar en la tabla
     */
    PulsacionesBoton[] pulsaciones;

    /**
     * Constructor
     */
    public Logica() {
        //inicialiar el array de pulsaciones
        pulsaciones = new PulsacionesBoton[4];
        pulsaciones[0] = new PulsacionesBoton(1);
        pulsaciones[1] = new PulsacionesBoton(2);
        pulsaciones[2] = new PulsacionesBoton(3);
        pulsaciones[3] = new PulsacionesBoton(4);
    }

 

    /**
     * Agrega una pulsacion de boton al contador en el indice de array especificado
     * @param id Indice del array de pulsaciones donde se quiere guardar la pulsacion
     */
    public void addPulsacion(int id) {
        this.pulsaciones[id].agregarPulsacion();
    }
    
    /**
     * Devuelve un array con las pulsaciones de los botones
     * @return  El array de pulsaciones
     */
    public PulsacionesBoton[] getPulsaciones(){
            return this.pulsaciones;
            }
    
    
    /**
     * MAIN DE LA APLICACION
     * @param args 
     */
    public static void main(String[] args) {
        Logica logica = new Logica();

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            VentanaPrincipal vp = new VentanaPrincipal(logica);
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
        });
    }
}//end Logica
