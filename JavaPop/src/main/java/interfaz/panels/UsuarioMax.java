/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.panels;

/**
 *
 * @author luism
 */
public class UsuarioMax extends javax.swing.JPanel {

    /**
     * Creates new form UsuarioMax
     */
    public UsuarioMax() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameEditField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailEditField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dniEditField = new javax.swing.JFormattedTextField();
        pcEditField = new javax.swing.JFormattedTextField();
        ccEditField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordEditField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameEditField.setEditable(false);
        nameEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        nameEditField.setForeground(new java.awt.Color(153, 153, 153));
        nameEditField.setText("Nombre");
        nameEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEditFieldActionPerformed(evt);
            }
        });
        add(nameEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 396, 35));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        emailEditField.setEditable(false);
        emailEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        emailEditField.setForeground(new java.awt.Color(153, 153, 153));
        emailEditField.setText("Correo");
        emailEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailEditFieldActionPerformed(evt);
            }
        });
        add(emailEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 396, 35));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel2.setText("Correo:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        dniEditField.setEditable(false);
        dniEditField.setForeground(new java.awt.Color(153, 153, 153));
        dniEditField.setText("DNI");
        dniEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        dniEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniEditFieldActionPerformed(evt);
            }
        });
        add(dniEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 396, 35));

        pcEditField.setEditable(false);
        pcEditField.setForeground(new java.awt.Color(153, 153, 153));
        pcEditField.setText("Código postal");
        pcEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        pcEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcEditFieldActionPerformed(evt);
            }
        });
        add(pcEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 396, 35));

        ccEditField.setEditable(false);
        ccEditField.setForeground(new java.awt.Color(153, 153, 153));
        ccEditField.setText("Tarjeta de crédito");
        ccEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        ccEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccEditFieldActionPerformed(evt);
            }
        });
        add(ccEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 396, 35));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel3.setText("Clave:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel4.setText("Dni:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel5.setText("Tarjeta de crédito:"); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        jLabel6.setText("Código postal:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        passwordEditField.setEditable(false);
        passwordEditField.setFont(new java.awt.Font("OCR A Extended", 2, 11)); // NOI18N
        passwordEditField.setForeground(new java.awt.Color(153, 153, 153));
        passwordEditField.setText("Clave");
        add(passwordEditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 396, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void emailEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailEditFieldActionPerformed

    private void pcEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcEditFieldActionPerformed

    private void dniEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniEditFieldActionPerformed

    private void ccEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccEditFieldActionPerformed

    private void nameEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameEditFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ccEditField;
    private javax.swing.JFormattedTextField dniEditField;
    public javax.swing.JTextField emailEditField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField nameEditField;
    private javax.swing.JTextField passwordEditField;
    private javax.swing.JFormattedTextField pcEditField;
    // End of variables declaration//GEN-END:variables
}
