/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.panels;

import clases.Cliente;

/**
 *
 * @author luism
 */
public class UsuarioMin extends javax.swing.JPanel {

    private Cliente cliente;
    /**
     * Creates new form NewJPanel
     */
    public UsuarioMin() {
        initComponents();
    }

    public void setCliente(Cliente client){
        this.cliente = client;
        this.etiquetaDNI.setText (client.getDni());
        this.etiquetaNombre.setText (client.getNombre());
        this.etiquetaCorreo.setText (client.getCorreo());    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        etiquetaDNI = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaCorreo = new javax.swing.JLabel();
        etiquetaTipo = new javax.swing.JLabel();
        etiquetaEditar = new javax.swing.JLabel();
        etiquetaBorrar = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        etiquetaDNI.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaDNI.setText("ID");

        etiquetaNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaNombre.setText("Name");

        etiquetaCorreo.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaCorreo.setText("Email");

        etiquetaTipo.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaTipo.setText("Type");

        etiquetaEditar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaEditar.setText("Edit");

        etiquetaBorrar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaBorrar.setText("Delete");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaDNI)
                .addGap(105, 105, 105)
                .addComponent(etiquetaNombre)
                .addGap(125, 125, 125)
                .addComponent(etiquetaCorreo)
                .addGap(212, 212, 212)
                .addComponent(etiquetaTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(etiquetaEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaBorrar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaCorreo)
                    .addComponent(etiquetaTipo)
                    .addComponent(etiquetaEditar)
                    .addComponent(etiquetaBorrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaBorrar;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDNI;
    private javax.swing.JLabel etiquetaEditar;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
