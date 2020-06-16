package interfaz.panels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class RegisterField extends javax.swing.JPanel {

    /**
     * Creates new form registerCard
     */
    public RegisterField() {
        initComponents();
        emailErrorLabel.setText("");
        passwordErrorLabel.setText("");
        nameErrorLabel.setText("");
        ppccErrorLabel.setText("");
        ccErrorLabel.setText("");
        idErrorLabel.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailErrorLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordErrorLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        nameErrorLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ppccErrorLabel = new javax.swing.JLabel();
        ppccLabel = new javax.swing.JLabel();
        ppccField = new javax.swing.JFormattedTextField();
        ccLabel = new javax.swing.JLabel();
        ccErrorLabel = new javax.swing.JLabel();
        ccField = new javax.swing.JFormattedTextField();
        idLabel = new javax.swing.JLabel();
        idErrorLabel = new javax.swing.JLabel();
        idField = new javax.swing.JFormattedTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        emailErrorLabel.setText("Email no válido");
        emailErrorLabel.setToolTipText("");
        add(emailErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 20));

        emailLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        emailLabel.setText("Email:");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 20));

        emailField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, -1));

        passwordErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        passwordErrorLabel.setText("Contraseña inválida");
        passwordErrorLabel.setToolTipText("");
        add(passwordErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 20));

        passwordLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordLabel.setText("Contraseña:");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 20));

        passwordField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        passwordField.setEchoChar('*');
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        nameErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        nameErrorLabel.setText("Error");
        add(nameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 20));

        nameLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        nameLabel.setText("Nombre y apellidos:");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 20));

        nameField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, -1));

        ppccErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ppccErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ppccErrorLabel.setText("Codigo postal no válido");
        ppccErrorLabel.setToolTipText("");
        add(ppccErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 20));

        ppccLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ppccLabel.setText("Código Postal:");
        add(ppccLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 20));

        try {
            ppccField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ppccField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(ppccField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, -1));

        ccLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ccLabel.setText("Tarjeta de Crédito:");
        add(ccLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 20));

        ccErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ccErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ccErrorLabel.setText("Tarjeta de credito no válida");
        ccErrorLabel.setToolTipText("");
        add(ccErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 20));

        try {
            ccField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(ccField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, -1));

        idLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        idLabel.setText("DNI:");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 20));

        idErrorLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        idErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        idErrorLabel.setText("DNI no válido");
        idErrorLabel.setToolTipText("");
        add(idErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 20));

        try {
            idField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    public String getEmail() {
        return emailField.getText();
    }

    public String getNameSurname() {
        return nameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public String getPPCC() {
        return ppccField.getText();
    }

    public String getCC() {
        return ccField.getText();
    }

    public String getID() {
        return idField.getText().strip();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ccErrorLabel;
    private javax.swing.JFormattedTextField ccField;
    private javax.swing.JLabel ccLabel;
    public static javax.swing.JLabel emailErrorLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    public static javax.swing.JLabel idErrorLabel;
    private javax.swing.JFormattedTextField idField;
    private javax.swing.JLabel idLabel;
    public static javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    public static javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    public static javax.swing.JLabel ppccErrorLabel;
    private javax.swing.JFormattedTextField ppccField;
    private javax.swing.JLabel ppccLabel;
    // End of variables declaration//GEN-END:variables
}
