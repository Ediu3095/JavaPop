/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Producto;
import interfaz.panels.MiProductoMin;
import static clases.utils.Colecciones.*;
import static clases.utils.CheckFunctions.*;

import java.util.Random;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TheElctrMsc_Gaming
 */
public class MenuEditarProducto extends javax.swing.JFrame {

    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen (*.jpg, *.jpeg, *.png, *.gif)", "jpg", "png", "jpeg", "gif");
    private String imageAddress;
    private String newImageAddress;
    private boolean imagenEditable;
    private Producto producto;
    private Producto productoOriginal; // Lo creo para guardar una instancia del producto original pero no se si es necesario
    private final MenuPrincipal menu;
    private boolean borrar;

    /**
     * Creates new form MenuEditarProducto
     *
     * @param menu
     * @param container
     */
    public MenuEditarProducto(MenuPrincipal menu, MiProductoMin container) {
        initComponents();

        // Setup icon
        super.setIconImage(new ImageIcon(".\\resources\\logo\\IconoJavaPop2.png").getImage());

        // Iniciamos imagenEditable para poder utilizarla posteriormente
        this.imagenEditable = false;

        // Nos guardamos el producto
        this.producto = container.producto;
        this.productoOriginal = container.producto;

        // Eliminamos el producto del usuario y de los productos globales
        menu.user.getProductos().remove(this.producto);
        productos.remove(this.producto);

        // Guardamos un booleano para decidir si volvemos a subir los productos o no
        this.borrar = false;

        // Displayeamos los datos editables del producto
        fieldNombre.setText(producto.getTitulo());
        fieldDescripcion.setText(producto.getDescripcion());
        fieldPrecio.setText(("" + producto.getPrecio()).replace('.', ','));
        categoriaBox.setSelectedIndex(indexOfCategoria(producto.getCategoria()));
        estadoBox.setSelectedIndex(indexOfEstado(producto.getEstado()));
        imageAddress = producto.getFoto();
        newImageAddress = producto.getFoto();
        icono.setIcon(new ImageIcon(new ImageIcon(imageAddress).getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_DEFAULT)));
        urgencia.setSelected(producto.isUrgente());

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
        fotoLabel = new javax.swing.JLabel();
        editarFoto = new javax.swing.JLabel();
        foto = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        editarNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        descripcionLabel = new javax.swing.JLabel();
        editarDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        precioLabel = new javax.swing.JLabel();
        editarPrecio = new javax.swing.JLabel();
        fieldPrecio = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        editarCategoria = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        estadoLabel = new javax.swing.JLabel();
        editarEstado = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox<>();
        urgencia = new javax.swing.JCheckBox();
        botonConfirmar = new javax.swing.JButton();
        botonBaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Javapop - Editar producto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
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

        fotoLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fotoLabel.setText("Foto del producto:");

        editarFoto.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarFoto.setForeground(new java.awt.Color(51, 153, 255));
        editarFoto.setText("editar");
        editarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarFotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarFotoMouseExited(evt);
            }
        });

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        foto.setMaximumSize(new java.awt.Dimension(250, 250));
        foto.setMinimumSize(new java.awt.Dimension(250, 250));
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
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        fotoLayout.setVerticalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );

        nombreLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        nombreLabel.setText("Nombre:");

        editarNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarNombre.setForeground(new java.awt.Color(51, 153, 255));
        editarNombre.setText("editar");
        editarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarNombreMouseExited(evt);
            }
        });

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldNombre.setEnabled(false);

        descripcionLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        descripcionLabel.setText("Descripción:");

        editarDescripcion.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarDescripcion.setForeground(new java.awt.Color(51, 153, 255));
        editarDescripcion.setText("editar");
        editarDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarDescripcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarDescripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarDescripcionMouseExited(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        fieldDescripcion.setColumns(20);
        fieldDescripcion.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldDescripcion.setRows(5);
        fieldDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(fieldDescripcion);

        precioLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        precioLabel.setText("Precio:");

        editarPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarPrecio.setForeground(new java.awt.Color(51, 153, 255));
        editarPrecio.setText("editar");
        editarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarPrecioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarPrecioMouseExited(evt);
            }
        });

        fieldPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldPrecio.setEnabled(false);

        categoriaLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        categoriaLabel.setText("Categoría:");

        editarCategoria.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarCategoria.setForeground(new java.awt.Color(51, 153, 255));
        editarCategoria.setText("editar");
        editarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarCategoriaMouseExited(evt);
            }
        });

        categoriaBox.setEditable(true);
        categoriaBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y acesorios", "Tv, audio y foto", "Moviles y telefónica", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        categoriaBox.setEnabled(false);

        estadoLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        estadoLabel.setText("Estado:");

        editarEstado.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarEstado.setForeground(new java.awt.Color(51, 153, 255));
        editarEstado.setText("editar");
        editarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarEstadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarEstadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarEstadoMouseExited(evt);
            }
        });

        estadoBox.setEditable(true);
        estadoBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Como nuevo", "Bueno", "Aceptable", "Regular" }));
        estadoBox.setEnabled(false);

        urgencia.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        urgencia.setText("Urgente (Cuesta 5€)");
        urgencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                urgenciaStateChanged(evt);
            }
        });

        botonConfirmar.setText("Confirmar cambios");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        botonBaja.setText("Dar de baja");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estadoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(editarEstado))
                            .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarNombre))
                            .addComponent(fieldNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descripcionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarDescripcion))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(precioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarPrecio))
                            .addComponent(fieldPrecio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(categoriaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarCategoria))
                            .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(urgencia)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fotoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarFoto))
                            .addComponent(botonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreLabel)
                                    .addComponent(editarNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(descripcionLabel)
                                    .addComponent(editarDescripcion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precioLabel)
                                    .addComponent(editarPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(categoriaLabel)
                                    .addComponent(editarCategoria))
                                .addGap(12, 12, 12)
                                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(estadoLabel)
                                    .addComponent(editarEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fotoLabel)
                                    .addComponent(editarFoto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(urgencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(botonBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseClicked
        if (imagenEditable) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(filter);
            fileChooser.setAcceptAllFileFilterUsed(false);

            int i = fileChooser.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                newImageAddress = fileChooser.getSelectedFile().getPath();

                ImageIcon icon = new ImageIcon(this.newImageAddress);
                Image resizedImage = icon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_DEFAULT);
                this.icono.setIcon(new ImageIcon(resizedImage));
            }
        }
    }//GEN-LAST:event_iconoMouseClicked

    private void iconoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseEntered
        this.foto.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_iconoMouseEntered

    private void iconoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseExited
        this.foto.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_iconoMouseExited

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        this.borrar = false;
        this.dispose();
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void editarNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNombreMouseEntered
        editarNombre.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarNombreMouseEntered
    private void editarNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNombreMouseExited
        editarNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarNombreMouseExited
    private void editarDescripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarDescripcionMouseEntered
        editarDescripcion.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarDescripcionMouseEntered
    private void editarDescripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarDescripcionMouseExited
        editarDescripcion.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarDescripcionMouseExited
    private void editarPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarPrecioMouseEntered
        editarPrecio.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarPrecioMouseEntered
    private void editarPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarPrecioMouseExited
        editarPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarPrecioMouseExited
    private void editarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarCategoriaMouseEntered
        editarCategoria.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarCategoriaMouseEntered
    private void editarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarCategoriaMouseExited
        editarCategoria.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarCategoriaMouseExited
    private void editarEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarEstadoMouseEntered
        editarEstado.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarEstadoMouseEntered
    private void editarEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarEstadoMouseExited
        editarEstado.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarEstadoMouseExited
    private void editarFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarFotoMouseEntered
        editarFoto.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_editarFotoMouseEntered
    private void editarFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarFotoMouseExited
        editarFoto.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_editarFotoMouseExited

    private void editarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNombreMouseClicked
        if (fieldNombre.isEnabled()) {
            fieldNombre.setEnabled(false);

            if (fieldNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "El nombre del producto no puede estar vacio.\nNo se guardaron los cambios", "Error de formato", JOptionPane.ERROR_MESSAGE);
            } else {
                producto.setTitulo(fieldNombre.getText());
            }

            fieldNombre.setText(producto.getTitulo());
            editarNombre.setText("editar");
        } else {
            fieldNombre.setEnabled(true);
            editarNombre.setText("guardar");
        }
    }//GEN-LAST:event_editarNombreMouseClicked

    private void editarDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarDescripcionMouseClicked
        if (fieldDescripcion.isEnabled()) {
            fieldDescripcion.setEnabled(false);

            producto.setDescripcion(fieldDescripcion.getText());

            editarDescripcion.setText("editar");
        } else {
            fieldDescripcion.setEnabled(true);
            editarDescripcion.setText("guardar");
        }
    }//GEN-LAST:event_editarDescripcionMouseClicked

    private void editarPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarPrecioMouseClicked
        if (fieldPrecio.isEnabled()) {
            fieldPrecio.setEnabled(false);

            if (checkPrecio(fieldPrecio.getText())) {
                producto.setPrecio(getPrecio(fieldPrecio.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "El formato del precio es incorrecto.\nDebe escribir los centimos separados por una coma.\nNo se guardaron los cambios.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            }

            fieldPrecio.setText(("" + producto.getPrecio()).replace('.', ','));
            editarPrecio.setText("editar");
        } else {
            fieldPrecio.setEnabled(true);
            editarPrecio.setText("guardar");
        }
    }//GEN-LAST:event_editarPrecioMouseClicked

    private void editarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarCategoriaMouseClicked
        if (categoriaBox.isEnabled()) {
            categoriaBox.setEnabled(false);

            producto.setCategoria(getCategoria(categoriaBox.getSelectedIndex()));

            editarCategoria.setText("editar");
        } else {
            categoriaBox.setEnabled(true);
            editarCategoria.setText("guardar");
        }
    }//GEN-LAST:event_editarCategoriaMouseClicked

    private void editarEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarEstadoMouseClicked
        if (estadoBox.isEnabled()) {
            estadoBox.setEnabled(false);

            producto.setEstado(getEstado(estadoBox.getSelectedIndex()));

            editarEstado.setText("editar");
        } else {
            estadoBox.setEnabled(true);
            editarEstado.setText("guardar");
        }
    }//GEN-LAST:event_editarEstadoMouseClicked

    private void editarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarFotoMouseClicked
        if (imagenEditable) {
            imagenEditable = false;

            producto.setFoto(newImageAddress);

            FileSystem fileSys = FileSystems.getDefault();

            // Eliminamos la imagen vieja
            try {
                Files.delete(fileSys.getPath(imageAddress));
            } catch (IOException ex) {
            }

            // Cambiamos por la imagen nueva
            imageAddress = newImageAddress;

            // Copiamos la nueva imagen a un directorio propio para evitar problemas si esta es borrada o cambiada de directorio
            File image = new File(imageAddress);
            String newAddress = "./resources/imagenes/" + randomSequence() + "_" + image.getName();
            try {
                Files.copy(fileSys.getPath(imageAddress), fileSys.getPath(newAddress), REPLACE_EXISTING);
                this.imageAddress = newAddress;
            } catch (IOException ex) {
            }

            editarFoto.setText("editar");
        } else {
            imagenEditable = true;
            editarFoto.setText("guardar");
        }
    }//GEN-LAST:event_editarFotoMouseClicked

    private void urgenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_urgenciaStateChanged
        this.producto.toggleUrgente();
    }//GEN-LAST:event_urgenciaStateChanged

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        this.borrar = true;
        this.dispose();
    }//GEN-LAST:event_botonBajaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        menu.setEnabled(true);

        if (!borrar) {
            menu.user.introducirProducto(this.producto);
            productos.add(this.producto);
            usuarios.remove(this.menu.user);
            for (int i = 0; i < this.menu.user.getVentasNuevas().size(); i++) {
                if (this.menu.user.getVentasNuevas().get(i).getProducto().equals(this.productoOriginal) || this.menu.user.getVentasNuevas().get(i).getProducto().equals(this.producto)) {
                    this.menu.user.getVentasNuevas().get(i).setProducto(this.producto);
                }
            }
            usuarios.add(this.menu.user);
        } else {
            new File(this.producto.getFoto()).delete();
            usuarios.remove(this.menu.user);
            for (int i = 0; i < this.menu.user.getVentasNuevas().size(); i++) {
                if (this.menu.user.getVentasNuevas().get(i).getProducto().equals(this.productoOriginal) || this.menu.user.getVentasNuevas().get(i).getProducto().equals(this.producto)) {
                    this.menu.user.getVentasNuevas().remove(i);
                    i--;
                }
            }
            usuarios.add(this.menu.user);
        }

        menu.miProductoMin1.setVisible(false);
        menu.miProductoMin2.setVisible(false);
        menu.miProductoMin3.setVisible(false);
        menu.miProductoMin4.setVisible(false);
        menu.posicionMin = 0;

        menu.displayMisProductos();

        menu.lockUnlockBotonesMisProductos();

        menu.toFront();
    }//GEN-LAST:event_formWindowClosed

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
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel editarCategoria;
    private javax.swing.JLabel editarDescripcion;
    private javax.swing.JLabel editarEstado;
    private javax.swing.JLabel editarFoto;
    private javax.swing.JLabel editarNombre;
    private javax.swing.JLabel editarPrecio;
    private javax.swing.JComboBox<String> estadoBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JTextArea fieldDescripcion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel foto;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel icono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JCheckBox urgencia;
    // End of variables declaration//GEN-END:variables
}
