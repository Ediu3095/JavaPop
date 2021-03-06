package interfaz;

import clases.Producto;
import clases.Venta;
import static clases.utils.Colecciones.productos;
import static clases.utils.Colecciones.usuarios;
import static clases.utils.Colecciones.ventas;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Ruiz Sabajanes
 */
public class MenuVentas extends javax.swing.JFrame {

    private MenuPrincipal menu;
    private int posicionMin;
    private int posicionMax;

    /**
     * Creates new form MenuVentas
     * @param menu menu del que se viene
     */
    public MenuVentas(MenuPrincipal menu) {
        initComponents();

        // setup icon
        super.setIconImage(new ImageIcon(".\\resources\\logo\\IconoJavaPop2.png").getImage());

        menu.setEnabled(false);

        this.menu = menu;
        posicionMin = 0;
        posicionMax = 0;

        displayMisVentas();
        lockUnlockBotonesMisVentas();

        super.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc=" actualizar página mis ventas ">
    /**
     * <p>
     * Esta función recoge cuantas ventas va a haber en la nueva página,
     * mostrando y ocultando las que sean necesarias, así como adjudicando cada
     * venta a su correspondiente casilla. </p>
     *
     * <p>
     * Se harán invisibles las casillas donde no haya una venta y se mostrarán y
     * asignarán las que si lo tengan. </p>
     *
     * @author Eduardo Ruiz Sabajanes
     *
     */
    public final void displayMisVentas() {
        miVentaMin5.setVisible(false);
        jLabel5.setVisible(false);
        miVentaMin4.setVisible(false);
        jLabel4.setVisible(false);
        miVentaMin3.setVisible(false);
        jLabel3.setVisible(false);
        miVentaMin2.setVisible(false);
        jLabel2.setVisible(false);
        miVentaMin1.setVisible(false);
        jLabel1.setVisible(false);

        // actualizamos posicionMax (De esta forma sabemos que productos deberemos mostrar)
        ArrayList<Venta> misVentas = menu.user.getVentasNuevas();
        for (int i = posicionMin; i < posicionMin + 5; i++) {
            posicionMax = i;
            if (posicionMax < misVentas.size()) {
            } else {
                posicionMax--;
                break;
            }
        }

        // mostramos los productos corresponcientes
        switch (posicionMax + 1 - posicionMin) {
            case 5: // Hay que mostrar 5 ventas
                miVentaMin5.setVisible(true);
                miVentaMin5.setVenta(misVentas.get(posicionMin + 4));
                jLabel5.setVisible(true);

            case 4: // Hay que mostrar 4 ventas
                miVentaMin4.setVisible(true);
                miVentaMin4.setVenta(misVentas.get(posicionMin + 3));
                jLabel4.setVisible(true);
            case 3: // Hay que mostrar 3 ventas
                miVentaMin3.setVisible(true);
                miVentaMin3.setVenta(misVentas.get(posicionMin + 2));
                jLabel3.setVisible(true);
            case 2: // Hay que mostrar 2 ventas
                miVentaMin2.setVisible(true);
                miVentaMin2.setVenta(misVentas.get(posicionMin + 1));
                jLabel2.setVisible(true);
            case 1: // Hay que mostrar 1 ventas
                miVentaMin1.setVisible(true);
                miVentaMin1.setVenta(misVentas.get(posicionMin));
                jLabel1.setVisible(true);
                fotoSinVentas.setIcon(new ImageIcon(""));
                textoSinVentas1.setText("");
                textoSinVentas2.setText("");
                break;
            case 0: // Hay que mostrar 0 productos
                fotoSinVentas.setIcon(new ImageIcon(".\\resources\\logo\\insomnia.gif"));
                textoSinVentas1.setText("¡Ups!");
                textoSinVentas2.setText("Parece que no tienes ninguna venta");
                break;
        }
    }

    /**
     * <p>
     * Esta función comprueba si hay más páginas de ventas, tanto antes como
     * después para que, en caso de que no las haya, bloquear los respectivos
     * botones. </p>
     *
     * <p>
     * Se bloquearán los botones de las direcciones a las que no se pueda
     * acceder. </p>
     *
     * @author Eduardo Ruiz Sabajanes
     *
     */
    public final void lockUnlockBotonesMisVentas() {
        if (posicionMin - 5 < 0) {
            retrocederPagina.setEnabled(false);
        } else {
            retrocederPagina.setEnabled(true);
        }

        if (posicionMin + 5 >= menu.user.getVentasNuevas().size()) {
            pasarPagina.setEnabled(false);
        } else {
            pasarPagina.setEnabled(true);
        }
    }
    // </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        pasarPagina = new javax.swing.JButton();
        retrocederPagina = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        miVentaMin1 = new interfaz.panels.MiVentaMin();
        jLabel2 = new javax.swing.JLabel();
        miVentaMin2 = new interfaz.panels.MiVentaMin();
        jLabel3 = new javax.swing.JLabel();
        miVentaMin3 = new interfaz.panels.MiVentaMin();
        jLabel4 = new javax.swing.JLabel();
        miVentaMin4 = new interfaz.panels.MiVentaMin();
        jLabel5 = new javax.swing.JLabel();
        miVentaMin5 = new interfaz.panels.MiVentaMin();
        fotoSinVentas = new javax.swing.JLabel();
        textoSinVentas1 = new javax.swing.JLabel();
        textoSinVentas2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Javapop - Mis ventas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        banner.setBackground(new java.awt.Color(51, 153, 255));
        banner.setForeground(new java.awt.Color(0, 0, 51));

        Logo.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 51));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new ImageIcon(".\\resources\\logo\\IconoJavaPop3.png"));
        Logo.setText("JavaPop");
        Logo.setPreferredSize(new java.awt.Dimension(230, 38));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        pasarPagina.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        pasarPagina.setText(">>");
        pasarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarPaginaActionPerformed(evt);
            }
        });

        retrocederPagina.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        retrocederPagina.setText("<<");
        retrocederPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocederPaginaActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("confirmar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        miVentaMin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(miVentaMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("confirmar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, -1, -1));

        miVentaMin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(miVentaMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 940, 40));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("confirmar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        miVentaMin3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(miVentaMin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 940, -1));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("confirmar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        miVentaMin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(miVentaMin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 940, -1));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("confirmar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));

        miVentaMin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(miVentaMin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 940, -1));

        fotoSinVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fotoSinVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 340));

        textoSinVentas1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        textoSinVentas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSinVentas1.setText("jLabel7");
        textoSinVentas1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(textoSinVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 460, 160));

        textoSinVentas2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textoSinVentas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSinVentas2.setText("jLabel8");
        textoSinVentas2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(textoSinVentas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 460, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retrocederPagina)
                .addGap(18, 18, 18)
                .addComponent(pasarPagina)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasarPagina)
                    .addComponent(retrocederPagina))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc=" efectos visuales labels ">
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_jLabel1MouseEntered
    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_jLabel1MouseExited
    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_jLabel2MouseEntered
    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_jLabel2MouseExited
    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_jLabel3MouseEntered
    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_jLabel3MouseExited
    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_jLabel4MouseExited
    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_jLabel4MouseEntered
    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_jLabel5MouseEntered
    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_jLabel5MouseExited
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" eventos click en labels "confirmar" ">
    /**
     * <p>
     * Esta función crea una ventana emergente para confirmar la venta del
     * producto colocado en la primera casilla. </p>
     *
     * <p>
     * Si se decide aceptar la venta, se añade a ventas confirmadas, se añaden a
     * ventas de los usuarios y se elimina el producto
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int i = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la venta de " + miVentaMin1.venta.getProducto().getTitulo() + "?");
        if (i == JOptionPane.YES_OPTION) {
            miVentaMin1.venta.getComprador().getComprasConfirmadas().add(miVentaMin1.venta);
            miVentaMin1.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin1.venta);
            Producto p = miVentaMin1.venta.getProducto();
            usuarios.remove(p.getVendedor());
            p.getVendedor().sacarProducto(p);
            usuarios.add(p.getVendedor());
            productos.remove(p);
            new File(p.getFoto()).delete();

            for (int j = 0; j < miVentaMin1.venta.getProducto().getVendedor().getVentasNuevas().size(); j++) {
                if (miVentaMin1.venta.getProducto().getVendedor().getVentasNuevas().get(j).getProducto().equals(miVentaMin1.venta.getProducto())) {
                    miVentaMin1.venta.getProducto().getVendedor().getVentasNuevas().remove(j);
                    j--;
                }
            }

            ventas.add(miVentaMin1.venta);
        } else {
            miVentaMin1.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin1.venta);
        }

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * <p>
     * Esta función crea una ventana emergente para confirmar la venta del
     * producto colocado en la segunda casilla. </p>
     *
     * <p>
     * Si se decide aceptar la venta, se añade a ventas confirmadas, se añaden a
     * ventas de los usuarios y se elimina el producto
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int i = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la venta de " + miVentaMin2.venta.getProducto().getTitulo() + "?");
        if (i == JOptionPane.YES_OPTION) {
            miVentaMin2.venta.getComprador().getComprasConfirmadas().add(miVentaMin2.venta);
            miVentaMin2.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin2.venta);
            Producto p = miVentaMin2.venta.getProducto();
            usuarios.remove(p.getVendedor());
            p.getVendedor().sacarProducto(p);
            usuarios.add(p.getVendedor());
            productos.remove(p);
            new File(p.getFoto()).delete();

            for (int j = 0; j < miVentaMin2.venta.getProducto().getVendedor().getVentasNuevas().size(); j++) {
                if (miVentaMin2.venta.getProducto().getVendedor().getVentasNuevas().get(j).getProducto().equals(miVentaMin2.venta.getProducto())) {
                    miVentaMin2.venta.getProducto().getVendedor().getVentasNuevas().remove(j);
                    j--;
                }
            }

            ventas.add(miVentaMin2.venta);
        } else {
            miVentaMin2.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin2.venta);
        }

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * <p>
     * Esta función crea una ventana emergente para confirmar la venta del
     * producto colocado en la tercera casilla. </p>
     *
     * <p>
     * Si se decide aceptar la venta, se añade a ventas confirmadas, se añaden a
     * ventas de los usuarios y se elimina el producto
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int i = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la venta de " + miVentaMin3.venta.getProducto().getTitulo() + "?");
        if (i == JOptionPane.YES_OPTION) {
            miVentaMin3.venta.getComprador().getComprasConfirmadas().add(miVentaMin3.venta);
            miVentaMin3.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin3.venta);
            Producto p = miVentaMin3.venta.getProducto();
            usuarios.remove(p.getVendedor());
            p.getVendedor().sacarProducto(p);
            usuarios.add(p.getVendedor());
            productos.remove(p);
            new File(p.getFoto()).delete();

            for (int j = 0; j < miVentaMin3.venta.getProducto().getVendedor().getVentasNuevas().size(); j++) {
                if (miVentaMin3.venta.getProducto().getVendedor().getVentasNuevas().get(j).getProducto().equals(miVentaMin3.venta.getProducto())) {
                    miVentaMin3.venta.getProducto().getVendedor().getVentasNuevas().remove(j);
                    j--;
                }
            }

            ventas.add(miVentaMin3.venta);
        } else {
            miVentaMin3.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin3.venta);
        }

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * <p>
     * Esta función crea una ventana emergente para confirmar la venta del
     * producto colocado en la cuarta casilla. </p>
     *
     * <p>
     * Si se decide aceptar la venta, se añade a ventas confirmadas, se añaden a
     * ventas de los usuarios y se elimina el producto
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int i = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la venta de " + miVentaMin4.venta.getProducto().getTitulo() + "?");
        if (i == JOptionPane.YES_OPTION) {
            miVentaMin4.venta.getComprador().getComprasConfirmadas().add(miVentaMin4.venta);
            miVentaMin4.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin4.venta);
            Producto p = miVentaMin4.venta.getProducto();
            usuarios.remove(p.getVendedor());
            p.getVendedor().sacarProducto(p);
            usuarios.add(p.getVendedor());
            productos.remove(p);
            new File(p.getFoto()).delete();

            for (int j = 0; j < miVentaMin4.venta.getProducto().getVendedor().getVentasNuevas().size(); j++) {
                if (miVentaMin4.venta.getProducto().getVendedor().getVentasNuevas().get(j).getProducto().equals(miVentaMin4.venta.getProducto())) {
                    miVentaMin4.venta.getProducto().getVendedor().getVentasNuevas().remove(j);
                    j--;
                }
            }

            ventas.add(miVentaMin4.venta);
        } else {
            miVentaMin4.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin4.venta);
        }

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * <p>
     * Esta función crea una ventana emergente para confirmar la venta del
     * producto colocado en la quinta casilla. </p>
     *
     * <p>
     * Si se decide aceptar la venta, se añade a ventas confirmadas, se añaden a
     * ventas de los usuarios y se elimina el producto
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int i = JOptionPane.showConfirmDialog(this, "¿Desea confirmar la venta de " + miVentaMin5.venta.getProducto().getTitulo() + "?");
        if (i == JOptionPane.YES_OPTION) {
            miVentaMin5.venta.getComprador().getComprasConfirmadas().add(miVentaMin5.venta);
            miVentaMin5.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin5.venta);
            Producto p = miVentaMin5.venta.getProducto();
            usuarios.remove(p.getVendedor());
            p.getVendedor().sacarProducto(p);
            usuarios.add(p.getVendedor());
            productos.remove(p);
            new File(p.getFoto()).delete();

            for (int j = 0; j < miVentaMin5.venta.getProducto().getVendedor().getVentasNuevas().size(); j++) {
                if (miVentaMin5.venta.getProducto().getVendedor().getVentasNuevas().get(j).getProducto().equals(miVentaMin5.venta.getProducto())) {
                    miVentaMin5.venta.getProducto().getVendedor().getVentasNuevas().remove(j);
                    j--;
                }
            }

            ventas.add(miVentaMin5.venta);
        } else {
            miVentaMin5.venta.getProducto().getVendedor().getVentasNuevas().remove(miVentaMin5.venta);
        }

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_jLabel5MouseClicked
    // </editor-fold>
    
    /**
     * <p>
     * Esta función permite al vendedor avanzar de página en el menú de sus
     * solicitudes de venta. </p>
     *
     * <p>
     * Se actualiza la pagina para cambiar las ventas por las 5 posteriores.
     * </p>
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void pasarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarPaginaActionPerformed
        posicionMin += 5;

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_pasarPaginaActionPerformed

    /**
     * <p>
     * Esta función permite al vendedor retroceder de página en el menú de sus
     * solicitudes de venta. </p>
     *
     * <p>
     * Se actualiza la pagina para cambiar las ventas por las 5 posteriores.
     * </p>
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     */
    private void retrocederPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocederPaginaActionPerformed
        posicionMin -= 5;

        displayMisVentas();
        lockUnlockBotonesMisVentas();
    }//GEN-LAST:event_retrocederPaginaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Reactivamos la ventana.
        menu.setEnabled(true);
        
        //Ocultamos los productos.
        menu.miProductoMin1.setVisible(false);
        menu.miProductoMin2.setVisible(false);
        menu.miProductoMin3.setVisible(false);
        menu.miProductoMin4.setVisible(false);

        //Volvemos a elegir que productos mostrar.
        menu.displayMisProductos();
        //Comprobamos si tenemos que bloquear algun botón.
        menu.lockUnlockBotonesMisProductos();
        //Centramos la ventana.
        menu.toFront();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel fotoSinVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private interfaz.panels.MiVentaMin miVentaMin1;
    private interfaz.panels.MiVentaMin miVentaMin2;
    private interfaz.panels.MiVentaMin miVentaMin3;
    private interfaz.panels.MiVentaMin miVentaMin4;
    private interfaz.panels.MiVentaMin miVentaMin5;
    private javax.swing.JButton pasarPagina;
    private javax.swing.JButton retrocederPagina;
    private javax.swing.JLabel textoSinVentas1;
    private javax.swing.JLabel textoSinVentas2;
    // End of variables declaration//GEN-END:variables
}
