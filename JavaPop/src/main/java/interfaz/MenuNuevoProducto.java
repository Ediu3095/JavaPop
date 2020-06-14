/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;
import clases.enumeradores.Categoria;
import clases.enumeradores.Estado;
import static clases.utils.Colecciones.*;
import static clases.utils.CheckFunctions.*;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TheElctrMsc_Gaming
 */
public class MenuNuevoProducto extends javax.swing.JFrame {

    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen (*.jpg, *.jpeg, *.png, *.gif)", "jpg", "png", "jpeg", "gif");
    private String imageAddress;
    private boolean imagenSubida;
    private final Cliente user;
    private final MenuPrincipal menu;

    /**
     * Creates new form MenuNuevoProducto
     *
     * @param menu Menu principal del usuario al que volveremos cuando se cierre
     * esta ventana.
     */
    public MenuNuevoProducto(MenuPrincipal menu) {
        initComponents();

        // setup icon
        super.setIconImage(new ImageIcon(".\\resources\\logo\\IconoJavaPop2.png").getImage());

        // Iniciamos image address para poder utilizarla posteriormente e imagen subida
        this.imageAddress = "";
        this.imagenSubida = false;

        // Nos guardamos el usuario
        this.user = menu.user;

        // Nos guardamos el menu para poder volver a este a posteriori 
        this.menu = menu;
        this.menu.setEnabled(false);

        super.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 30), new java.awt.Dimension(60, 30), new java.awt.Dimension(60, 30));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120), new java.awt.Dimension(60, 120));
        jLabel1 = new javax.swing.JLabel();
        foto = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        urgencia = new javax.swing.JCheckBox();
        botonSubir = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        fieldPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JavaPop - Subir nuevo producto");
        setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        banner.setBackground(new java.awt.Color(51, 153, 255));

        logo.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 0, 51));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new ImageIcon(".\\resources\\logo\\IconoJavaPop3.png"));
        logo.setText("JavaPop");
        logo.setPreferredSize(new java.awt.Dimension(230, 38));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setText("Foto del producto:");

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        foto.setPreferredSize(new java.awt.Dimension(250, 250));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new ImageIcon(".\\resources\\logo\\uploadIcon.png"));
        icono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fotoLayout = new javax.swing.GroupLayout(foto);
        foto.setLayout(fotoLayout);
        fotoLayout.setHorizontalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        fotoLayout.setVerticalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel3.setText("Descripción:");

        jScrollPane1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        fieldDescripcion.setColumns(20);
        fieldDescripcion.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldDescripcion.setRows(5);
        fieldDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(fieldDescripcion);

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel4.setText("Categoría:");

        categoriaBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y acesorios", "Tv, audio y foto", "Moviles y telefónica", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        estadoBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Como nuevo", "Bueno", "Aceptable", "Regular" }));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel6.setText("Precio:");

        urgencia.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        urgencia.setText("Urgente (Cuesta 5€)");

        botonSubir.setText("Subir producto");
        botonSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        fieldPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(fieldNombre)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fieldPrecio))
                        .addGap(18, 18, 18)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urgencia)
                            .addComponent(jLabel1)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(urgencia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonSubir)
                            .addComponent(botonCancelar))
                        .addGap(18, 18, 18)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void iconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);

        int i = fileChooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            imageAddress = fileChooser.getSelectedFile().getPath();

            ImageIcon icon = new ImageIcon(this.imageAddress);
            Image resizedImage = icon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_DEFAULT);
            this.icono.setIcon(new ImageIcon(resizedImage));

            this.imagenSubida = true;
        }
    }//GEN-LAST:event_iconoMouseClicked

    private void iconoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseEntered
        this.foto.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_iconoMouseEntered
    private void iconoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseExited
        this.foto.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_iconoMouseExited

    private void botonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirActionPerformed
        String titulo = fieldNombre.getText();
        String descripcion = fieldDescripcion.getText();
        Categoria categoria = getCategoria(categoriaBox.getSelectedIndex());
        Estado estado = getEstado(estadoBox.getSelectedIndex());
        double precio = getPrecio(fieldPrecio.getText());
        boolean urgente = urgencia.isSelected();

        if (precio == -1) {
            JOptionPane.showMessageDialog(this, "El formato del precio es incorrecto.\nSolamente debe separar los céntimos con una coma.", "Formato incorrecto", JOptionPane.ERROR_MESSAGE);
        } else if (titulo.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe añadir un titulo al producto.", "Campo obligatorio vacio", JOptionPane.INFORMATION_MESSAGE);
        } else if (!this.imagenSubida) {
            JOptionPane.showMessageDialog(this, "Debe añadir una imagen al producto.", "Campo obligatorio vacio", JOptionPane.INFORMATION_MESSAGE);
        } else {

            // Copiamos la imagen a un directorio propio para evitar problemas si esta es borrada o cambiada de directorio
            FileSystem fileSys = FileSystems.getDefault();
            File image = new File(imageAddress);
            String newAddress;
            newAddress = "./resources/imagenes/" + randomSequence() + "_" + image.getName();
            try {
                Files.copy(fileSys.getPath(imageAddress), fileSys.getPath(newAddress), REPLACE_EXISTING);
                this.imageAddress = newAddress;
            } catch (IOException ex) {
            }

            // Creamos el producto y lo añadimos a la lista de productos del cliente y a la lista global de productos
            Producto producto = new Producto(titulo, descripcion, categoria, estado, precio, this.imageAddress, this.user, urgente);
            user.introducirProducto(producto);
            if (!productos.contains(producto)) {
                productos.add(producto);
            }
            this.menu.setEnabled(true);
            this.dispose();
        }
    }//GEN-LAST:event_botonSubirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        menu.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private static String randomSequence() {
        String str = "";
        Random rnd = new Random();
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();

        for (int i = 0; i < 12; i++) {
            str += chars[rnd.nextInt(chars.length)];
        }

        return str;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonSubir;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JComboBox<String> estadoBox;
    private javax.swing.JTextArea fieldDescripcion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel foto;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JCheckBox urgencia;
    // End of variables declaration//GEN-END:variables
}
