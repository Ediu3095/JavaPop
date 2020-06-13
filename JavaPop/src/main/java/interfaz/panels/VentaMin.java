/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.panels;

import clases.Venta;

/**
 *
 * @author luism
 */
public class VentaMin extends javax.swing.JPanel {

    private Venta venta;
    /**
     * Creates new form NewJPanel
     */
    public VentaMin() {
        initComponents();
    }
    
    

    public void setVenta(Venta venta) {
        this.venta = venta;
        this.etiquetaVendedor.setText(venta.getProducto().getVendedor().getNombre());
        this.etiquetaComprador.setText(venta.getComprador().getNombre());
        this.etiquetaFecha.setText(venta.getProducto().getFechaPublicacion().toString());
 
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
        etiquetaProducto = new javax.swing.JLabel();
        etiquetaVendedor = new javax.swing.JLabel();
        etiquetaComprador = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        etiquetaProducto.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaProducto.setText("Producto");

        etiquetaVendedor.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaVendedor.setText("Seller");

        etiquetaComprador.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaComprador.setText("Buyer");

        etiquetaFecha.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaFecha.setText("Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaProducto)
                .addGap(105, 105, 105)
                .addComponent(etiquetaVendedor)
                .addGap(125, 125, 125)
                .addComponent(etiquetaComprador)
                .addGap(212, 212, 212)
                .addComponent(etiquetaFecha)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(etiquetaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaComprador)
                    .addComponent(etiquetaFecha))
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
    private javax.swing.JLabel etiquetaComprador;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaProducto;
    private javax.swing.JLabel etiquetaVendedor;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
