package interfaz;

import clases.*;
import interfaz.panels.ProductoMin;
import static clases.utils.Colecciones.*;
import static clases.utils.CheckFunctions.*;

import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Miguel Sobrino Zamora
 */
public class MenuAdminProducto extends javax.swing.JFrame {

    private boolean borrar;
    private final String imageAddress;
    private final Cliente user;
    private Producto producto;
    private final Producto productoOriginal;
    private final MenuAdmin menu;

    /**
     * <p>
     * Esta función genera otra ventana donde el administrador podrá comprobar
     * más datos del producto, asi como eliminarlo si lo cree necesario. </p>
     *
     * <p>
     * Se creará una ventana emergente y se bloqueará el acceso a la anterior
     * hasta que esta se cierre. </p>
     *
     * @param menu Menu del administrador del que venimos.
     * @param container Producto que hemos elegido
     *
     * @Luis Miguel Sobrino Zamora
     *
     */
    public MenuAdminProducto(MenuAdmin menu, ProductoMin container) {
        initComponents();

        //Iniciamos los componentes
        this.producto = container.producto;
        this.productoOriginal = container.producto;
        this.user = this.producto.getVendedor();

        //Eliminamos el producto de los productos globales.
        productos.remove(this.producto);
        menu.productosFiltrado.remove(this.producto);

        //Eliminamos el producto de los productos del usuario.
        usuarios.remove(this.user);
        this.user.getProductos().remove(this.producto);
        usuarios.add(this.user);

        //Colocamos en cada casilla los datos del producto que hemos elegido.
        fieldNombre.setText(this.producto.getTitulo());
        fieldDescripcion.setText(this.producto.getDescripcion());
        fieldPrecio.setText("" + this.producto.getPrecio());
        categoriaBox.setSelectedIndex(indexOfCategoria(this.producto.getCategoria()));
        estadoBox.setSelectedIndex(indexOfEstado(this.producto.getEstado()));
        urgencia.setSelected(this.producto.isUrgente());
        imageAddress = this.producto.getFoto();
        icono.setIcon(new ImageIcon(new ImageIcon(imageAddress).getImage().getScaledInstance(248, 248, Image.SCALE_DEFAULT)));
        jTextField1.setText(this.producto.getVendedor().getCorreo());

        this.borrar = false;

        //Bloqueamos el uso de la venta general del administrador.
        this.menu = menu;
        this.menu.setEnabled(false);

        //Hacemos visible la ventana emergente
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
        foto = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        descripcionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescripcion = new javax.swing.JTextArea();
        precioLabel = new javax.swing.JLabel();
        fieldPrecio = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        estadoLabel = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox<>();
        urgencia = new javax.swing.JCheckBox();
        botonConfirmar = new javax.swing.JButton();
        botonBaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Javapop - Administrar producto");
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

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        foto.setMaximumSize(new java.awt.Dimension(250, 250));
        foto.setMinimumSize(new java.awt.Dimension(250, 250));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new ImageIcon(".\\resources\\logo\\uploadIcon.png"));

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

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldNombre.setEnabled(false);

        descripcionLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        descripcionLabel.setText("Descripción:");

        jScrollPane1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        fieldDescripcion.setColumns(20);
        fieldDescripcion.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldDescripcion.setRows(5);
        fieldDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(fieldDescripcion);

        precioLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        precioLabel.setText("Precio:");

        fieldPrecio.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        fieldPrecio.setEnabled(false);

        categoriaLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        categoriaLabel.setText("Categoría:");

        categoriaBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y acesorios", "Tv, audio y foto", "Moviles y telefónica", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));
        categoriaBox.setEnabled(false);

        estadoLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        estadoLabel.setText("Estado:");

        estadoBox.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Como nuevo", "Bueno", "Aceptable", "Regular" }));
        estadoBox.setEnabled(false);

        urgencia.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        urgencia.setText("Urgente");
        urgencia.setEnabled(false);

        botonConfirmar.setText("Volver");
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

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setText("Vendedor:");

        jTextField1.setEnabled(false);

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
                            .addComponent(nombreLabel)
                            .addComponent(fieldNombre)
                            .addComponent(descripcionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(fieldPrecio)
                            .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioLabel)
                            .addComponent(categoriaLabel)
                            .addComponent(estadoLabel)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(urgencia)
                                    .addComponent(fotoLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                                .addComponent(nombreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descripcionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoriaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estadoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fotoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(urgencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc=" Acciones de los botones ">
    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        this.borrar = false;
        this.dispose();
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        this.borrar = true;
        this.dispose();
    }//GEN-LAST:event_botonBajaActionPerformed
    // </editor-fold>
    
    /**
     * <p>
     * Esta función comprueba si se ha borrado o no el producto de la ventana
     * emergente, en caso de que no se haya borrado, lo vuelve a añadir a la
     * lista de productos y al usuario correspondiente, por otra parte, si el
     * administrador ha decidido eliminarlo, se termina eliminando la foto del
     * producto y se vuelve a guardar el usuario sin el producto eliminado. </p>
     *
     * <p>
     * Al finalizar su primera tarea, la función vuelve a desplegar la lista de
     * productos anterior. </p>
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     *
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Desbloqueamos el uso del menú general del administrador.
        menu.setEnabled(true);

        //Si no borramos el objeto...
        if (!borrar) {
            user.introducirProducto(this.producto);
            productos.add(this.producto);
            menu.productosFiltrado.add(this.producto);
            usuarios.remove(this.user);
            for (int i = 0; i < this.user.getVentasNuevas().size(); i++) {
                if (this.user.getVentasNuevas().get(i).getProducto().equals(this.productoOriginal) || this.user.getVentasNuevas().get(i).getProducto().equals(this.producto)) {
                    this.user.getVentasNuevas().get(i).setProducto(this.producto);
                }
            }
            usuarios.add(this.user);
        //Si borramos el objeto...
        } else {
            new File(this.producto.getFoto()).delete();
            usuarios.remove(this.user);
            for (int i = 0; i < this.user.getVentasNuevas().size(); i++) {
                if (this.user.getVentasNuevas().get(i).getProducto().equals(this.productoOriginal) || this.user.getVentasNuevas().get(i).getProducto().equals(this.producto)) {
                    this.user.getVentasNuevas().remove(i);
                }
            }
            //Eliminamos el producto del usuario.
            usuarios.add(this.user);
            productos.remove(this.producto);
        }
        //Volvemos a mostrar los productos presentes en la página.
        menu.posicionMin = 0;
        //Elegimos que productos mostrar.
        menu.displayProductos();
        //Bloqueamos o desbloqueamos los botones pertinentes.
        menu.lockUnlockBotonesProductos();
        //Colocamos la ventana en el centro.
        menu.toFront();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel descripcionLabel;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JCheckBox urgencia;
    // End of variables declaration//GEN-END:variables
}
