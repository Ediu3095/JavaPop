/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static clases.utils.Colecciones.*;
import static clases.utils.ConsoleIO.*;
import static clases.utils.Searching.*;
import clases.enumeradores.*;
import clases.*;

import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author luism
 * 
 */
public class MenuAdminPrueba extends javax.swing.JFrame {

    private CardLayout camposCL;
    private Cliente user;
    private ArrayList<Producto> prodDefinitivo;
    private int posicionMin;
    private int posicionMax;
    
    /**
     * Creates new form MenuPrincipal1
     */
    public MenuAdminPrueba(Cliente user) {
        initComponents();
        this.user = user;
        this.camposCL = (CardLayout) this.jPanel1.getLayout();
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
        busquedaButton = new javax.swing.JButton();
        claveBusqueda = new javax.swing.JTextField();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        Logo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 30), new java.awt.Dimension(60, 30), new java.awt.Dimension(100, 30));
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 100), new java.awt.Dimension(60, 100), new java.awt.Dimension(80, 100));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 100), new java.awt.Dimension(60, 100), new java.awt.Dimension(80, 100));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 80), new java.awt.Dimension(80, 30), new java.awt.Dimension(80, 80));
        jPanel1 = new javax.swing.JPanel();
        panelBienvenida = new javax.swing.JPanel();
        panelCompra = new javax.swing.JPanel();
        productoMin1 = new interfaz.panels.ProductoMin();
        productoMin2 = new interfaz.panels.ProductoMin();
        productoMin3 = new interfaz.panels.ProductoMin();
        productoMin4 = new interfaz.panels.ProductoMin();
        productoMin5 = new interfaz.panels.ProductoMin();
        productoMin6 = new interfaz.panels.ProductoMin();
        productoMin7 = new interfaz.panels.ProductoMin();
        productoMin8 = new interfaz.panels.ProductoMin();
        rePag = new javax.swing.JButton();
        etiquetaPagina = new javax.swing.JLabel();
        avPag = new javax.swing.JButton();
        panelPerfil = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        banner.setBackground(new java.awt.Color(51, 153, 255));
        banner.setForeground(new java.awt.Color(0, 0, 51));
        banner.setPreferredSize(new java.awt.Dimension(945, 79));

        busquedaButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        busquedaButton.setText("Buscar");
        busquedaButton.setPreferredSize(new java.awt.Dimension(130, 23));
        busquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaButtonActionPerformed(evt);
            }
        });

        claveBusqueda.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        claveBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveBusquedaActionPerformed(evt);
            }
        });

        comboBoxCategoria.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y acesorios", "Tv, audio y foto", "Moviles y telefónica", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 51));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new ImageIcon(".\\resources\\logo\\IconoJavaPop3.png"));
        Logo.setText("JavaPop");
        Logo.setPreferredSize(new java.awt.Dimension(230, 38));

        jButton3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButton3.setText("Cerrar Sesión");

        jButton4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setText("Categoria:");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel2.setText("Función:");

        jComboBox1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultar usuario", "Consultar producto", "Consultar ventas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel3.setText("Buscar:");

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(busquedaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bannerLayout.createSequentialGroup()
                        .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bannerLayout.createSequentialGroup()
                                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(claveBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(busquedaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)))
                            .addGroup(bannerLayout.createSequentialGroup()
                                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jPanel1.add(panelBienvenida, "card2");

        rePag.setText("<<");
        rePag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePagActionPerformed(evt);
            }
        });

        etiquetaPagina.setText("Página 0 de 100");

        avPag.setText(">>");
        avPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(productoMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(productoMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoMin8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rePag)
                .addGap(18, 18, 18)
                .addComponent(etiquetaPagina)
                .addGap(18, 18, 18)
                .addComponent(avPag)
                .addContainerGap())
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productoMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productoMin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoMin8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rePag)
                    .addComponent(avPag)
                    .addComponent(etiquetaPagina)))
        );

        jPanel1.add(panelCompra, "card3");

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jPanel1.add(panelPerfil, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void claveBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveBusquedaActionPerformed

    private void busquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaButtonActionPerformed
        // TODO add your handling code here:
        Categoria cat;
        String[] keyWords;

        // productos = IOCustomLib.leerProductos();
        prodDefinitivo.clear();

        /*
        for (Producto prod: productos) {
            System.out.println(prod);
        }
        */
        // Se filtran los productos por categoría
        cat = getCategoria(comboBoxCategoria.getSelectedIndex());
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoria() == cat) {
                if (!productos.get(i).getVendedor().equals(user)) {
                    prodDefinitivo.add(productos.get(i));
                }
            }
        }

        // Se pidan unas palabras clave
        String kW = claveBusqueda.getText();
        keyWords = kW.split(" ");

        // Se actualizan los parametros de busqueda de los productos
        for (int i = 0; i < prodDefinitivo.size(); i++) {
            updateTags(user, prodDefinitivo.get(i), keyWords);
        }

        if (!kW.equals("")) {
            for (int i = 0; i < prodDefinitivo.size(); i++) {
                if (prodDefinitivo.get(i).getMatchDeg() == 0) {
                    prodDefinitivo.remove(i);
                    i--;
                }
            }
        }

        // Se organizan los productos
        sort(prodDefinitivo, 0, prodDefinitivo.size() - 1);

        posicionMin = 0;
        posicionMax = 0;
        displayProductos(posicionMin + 1);

        lockUnlockBotonesComprar();
        etiquetaPagina.setText("Página " + (posicionMin / 8 + 1) + " de " + (prodDefinitivo.size() / 8));
    }//GEN-LAST:event_busquedaButtonActionPerformed

    private void rePagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePagActionPerformed
        posicionMin -= 10;
        displayProductos(posicionMin + 1);

        lockUnlockBotonesComprar();
        etiquetaPagina.setText("Página " + (posicionMin / 8 + 1) + " de " + (prodDefinitivo.size() / 8));
    }//GEN-LAST:event_rePagActionPerformed

    private void avPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avPagActionPerformed
        posicionMin += 10;
        displayProductos(posicionMin + 1);

        lockUnlockBotonesComprar();
        etiquetaPagina.setText("Página " + (posicionMin / 8 + 1) + " de " + (prodDefinitivo.size() / 8 + 1));
    }//GEN-LAST:event_avPagActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lockUnlockBotonesComprar() {
        if (posicionMin - 10 < 0) {
            rePag.setEnabled(false);
        } else {
            rePag.setEnabled(true);
        }

        if (posicionMin + 10 >= prodDefinitivo.size()) {
            avPag.setEnabled(false);
        } else {
            avPag.setEnabled(true);
        }
    }

    private void displayProductos(int n) {
        // actualizamos posicionMax
        for (int i = n; i <= n + 8; i++) {
            posicionMax = posicionMin + i - 1;
            if (posicionMax < prodDefinitivo.size()) {
                //System.out.println((i) + ".- " + prodDefinitivo.get(posicionMax).getTitulo());
            } else {
                posicionMax--;
                break;
            }
        }

        // mostramos los productos corresponcientes
        for (int i = posicionMin; i <= posicionMax; i++) {
            switch (i % 8) {
                case 0:
                    productoMin1.setProducto(prodDefinitivo.get(i));
                    productoMin1.setVisible(true);
                    break;
                case 1:
                    productoMin2.setProducto(prodDefinitivo.get(i));
                    productoMin2.setVisible(true);
                    break;
                case 2:
                    productoMin3.setProducto(prodDefinitivo.get(i));
                    productoMin3.setVisible(true);
                    break;
                case 3:
                    productoMin4.setProducto(prodDefinitivo.get(i));
                    productoMin4.setVisible(true);
                    break;
                case 4:
                    productoMin5.setProducto(prodDefinitivo.get(i));
                    productoMin5.setVisible(true);
                    break;
                case 5:
                    productoMin6.setProducto(prodDefinitivo.get(i));
                    productoMin6.setVisible(true);
                    break;
                case 6:
                    productoMin7.setProducto(prodDefinitivo.get(i));
                    productoMin7.setVisible(true);
                    break;
                case 7:
                    productoMin8.setProducto(prodDefinitivo.get(i));
                    productoMin8.setVisible(true);
                    break;
            }
        }

        // ponemos invisibles las casillas que no deban tener producto
        for (int i = posicionMax + 1; i < posicionMin + 8; i++) {
            switch (i % 8) {
                case 0:
                    productoMin1.setVisible(false);
                    break;
                case 1:
                    productoMin2.setVisible(false);
                    break;
                case 2:
                    productoMin3.setVisible(false);
                    break;
                case 3:
                    productoMin4.setVisible(false);
                    break;
                case 4:
                    productoMin5.setVisible(false);
                    break;
                case 5:
                    productoMin6.setVisible(false);
                    break;
                case 6:
                    productoMin7.setVisible(false);
                    break;
                case 7:
                    productoMin8.setVisible(false);
                    break;
                default:
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton avPag;
    private javax.swing.JPanel banner;
    private javax.swing.JButton busquedaButton;
    private javax.swing.JTextField claveBusqueda;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JLabel etiquetaPagina;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelPerfil;
    private interfaz.panels.ProductoMin productoMin1;
    private interfaz.panels.ProductoMin productoMin2;
    private interfaz.panels.ProductoMin productoMin3;
    private interfaz.panels.ProductoMin productoMin4;
    private interfaz.panels.ProductoMin productoMin5;
    private interfaz.panels.ProductoMin productoMin6;
    private interfaz.panels.ProductoMin productoMin7;
    private interfaz.panels.ProductoMin productoMin8;
    private javax.swing.JButton rePag;
    // End of variables declaration//GEN-END:variables
}
