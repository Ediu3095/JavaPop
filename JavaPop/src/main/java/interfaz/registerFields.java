/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author TheElctrMsc_Gaming
 */
public class registerFields extends javax.swing.JPanel {

    /**
     * Creates new form registerCard
     */
    public registerFields() {
        initComponents();
        emailErrorLabel.setText("");
        passwordErrorLabel.setText("");
        nameErrorLabel.setText("");
        ppccErrorLabel.setText("");
        ccErrorLabel.setText("");
        dniErrorLabel.setText("");
        
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
        ppccField = new javax.swing.JTextField();
        ccLabel = new javax.swing.JLabel();
        ccField = new javax.swing.JTextField();
        ccErrorLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        dniErrorLabel = new javax.swing.JLabel();

        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        emailErrorLabel.setText("Error");
        emailErrorLabel.setToolTipText("");

        emailLabel.setText("Email:");

        passwordErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        passwordErrorLabel.setText("Error");
        passwordErrorLabel.setToolTipText("");

        passwordLabel.setText("Contraseña:");

        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        nameErrorLabel.setText("Error");

        nameLabel.setText("Nombre y apellidos:");

        ppccErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ppccErrorLabel.setText("Error");
        ppccErrorLabel.setToolTipText("");

        ppccLabel.setText("Código Postal:");

        ccLabel.setText("Tarjeta de Crédito:");

        ccErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ccErrorLabel.setText("Error");
        ccErrorLabel.setToolTipText("");

        idLabel.setText("DNI:");

        dniErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        dniErrorLabel.setText("Error");
        dniErrorLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(emailLabel)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailErrorLabel)
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addComponent(emailField)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(passwordLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordErrorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(nameErrorLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(ccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dniErrorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ccField)
                    .addComponent(idField)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ppccLabel)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppccField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccErrorLabel)
                            .addComponent(ppccErrorLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(emailErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(8, 8, 8)
                .addComponent(nameErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ppccErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppccField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppccLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ccErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dniErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getCcField() {
        return ccField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getIdField() {
        return idField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JTextField getPpccField() {
        return ppccField;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ccErrorLabel;
    private javax.swing.JTextField ccField;
    private javax.swing.JLabel ccLabel;
    public static javax.swing.JLabel dniErrorLabel;
    public static javax.swing.JLabel emailErrorLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    public static javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    public static javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    public static javax.swing.JLabel ppccErrorLabel;
    private javax.swing.JTextField ppccField;
    private javax.swing.JLabel ppccLabel;
    // End of variables declaration//GEN-END:variables
}
