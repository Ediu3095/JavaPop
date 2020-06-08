package interfaz;

import clases.utils.Colecciones;
import clases.utils.IOCustomLib;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
class Main {

    public static void main(String args[]) {
        
        Colecciones.usuarios = IOCustomLib.leerClientes();
        Colecciones.productos = IOCustomLib.leerProductos();
        Colecciones.ventas = IOCustomLib.leerVentas();
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new LogReg().setVisible(true);
        
        /*
        IOCustomLib.guardarClientes(Colecciones.usuarios);
        IOCustomLib.guardarProductos(Colecciones.productos);
        IOCustomLib.guardarVentas(Colecciones.ventas);
        */
        
    }
}
