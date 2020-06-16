package interfaz.panels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class LoginField extends javax.swing.JPanel {

    /**
     * Creates new form loginCard
     */
    public LoginField() {
        initComponents();
        emailErrorLabel.setText("");
        passwordErrorLabel.setText("");
    }

    public JTextField getEmailField1() {
        return emailField1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailLabel1 = new javax.swing.JLabel();
        emailField1 = new javax.swing.JTextField();
        emailErrorLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordErrorLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        emailLabel1.setText("Email:");
        add(emailLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 20));

        emailField1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(emailField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 260, -1));

        emailErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        emailErrorLabel.setText("Error");
        add(emailErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 20));

        passwordLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordLabel1.setText("Contraseña:");
        add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 20));

        passwordField1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordField1.setEchoChar('*');
        add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, -1));

        passwordErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        passwordErrorLabel.setText("Error");
        add(passwordErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel emailErrorLabel;
    private javax.swing.JTextField emailField1;
    private javax.swing.JLabel emailLabel1;
    public javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel passwordLabel1;
    // End of variables declaration//GEN-END:variables
}
