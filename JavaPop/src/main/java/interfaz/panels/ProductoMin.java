package interfaz.panels;

import clases.Producto;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class ProductoMin extends javax.swing.JPanel {
    
    public Producto producto;

    /**
     * Creates new form ProductoMin
     */
    public ProductoMin() {
        initComponents();
    }

    /**
     * <p>
     * Añade un producto a este contenedor y modifica los labels con los datos
     * de este.</p>
     *
     * @param prod producto que vamos a guardar
     * 
     * @author Eduardo Ruiz Sabajanes
     */
    public void setProducto(Producto prod) {
        this.producto = prod;
        this.etiquetaTitulo.setText(prod.getTitulo());
        this.etiquetaPrecio.setText(prod.getPrecio() + " €");
        this.imagen.setIcon(new ImageIcon(new ImageIcon(prod.getFoto()).getImage().getScaledInstance(180, 180,  java.awt.Image.SCALE_DEFAULT)));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaPrecio = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panelImagen.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        etiquetaTitulo.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        etiquetaTitulo.setText("Titulo");

        etiquetaPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        etiquetaPrecio.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaTitulo)
                    .addComponent(etiquetaPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(etiquetaPrecio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables
}
