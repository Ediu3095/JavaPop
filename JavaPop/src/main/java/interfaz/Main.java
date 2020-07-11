package interfaz;

import static clases.utils.Colecciones.*;
import clases.utils.IOCustomLib;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        LoadingScreen ls = new LoadingScreen();
        
        usuarios = IOCustomLib.leerClientes();
        productos = IOCustomLib.leerProductos();
        ventas = IOCustomLib.leerVentas();
        
        Thread.sleep(2000);
        
        /*
        System.out.println("\n\n\n\nUsusarios 1:\n" + usuarios);
        System.out.println("\n\n\n\nProductos 1:\n" + productos);
        System.out.println("\n\n\n\nVentas 1:\n" + ventas);
        */
        
        new LoginScreen();
        ls.dispose();
    }
}
