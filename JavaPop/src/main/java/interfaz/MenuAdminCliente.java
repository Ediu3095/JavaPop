package interfaz;

import clases.*;
import static clases.utils.Colecciones.*;
import javax.swing.ImageIcon;

/**
 * @author Eduardo Ruiz Sabajaness
 * @author Luis Miguel Sobrino Zamora
 */
public class MenuAdminCliente extends javax.swing.JFrame {

    private MenuAdmin menu;
    private Cliente user;
    private boolean borrar;

    /**
     * <p>
     * Esta función genera otra ventana donde el administrador podrá comprobar
     * más datos del cliente, asi como eliminarlo si lo cree necesario. </p>
     *
     * <p>
     * Se creará una ventana emergente y se bloqueará el acceso a la anterior
     * hasta que esta se cierre. </p>
     *
     * @param menu Menu del administrador del que venimos.
     * @param user cliente que hemos seleccionado.
     *
     * @author Eduardo Ruiz Sabajanes
     *
     */
    public MenuAdminCliente(MenuAdmin menu, Cliente user) {
        initComponents();

        this.borrar = false;
        this.user = user;
        this.menu = menu;

        //Iniciamos los componentes.
        correoField.setText(user.correo);
        claveField.setText(user.clave);
        nombreField.setText(user.getNombre());
        ccppField.setText("" + user.getCCPP());
        ccField.setText(user.getTTCC());
        dniField.setText(user.getDni());

        
        if (user instanceof Profesional) { //Si el cliente es profesional...
            togglePro.setSelected(true);
            variablesPro.setEnabled(true);
            descripcionField.setText(((Profesional) user).getDescripcion());
            horarioField.setText(((Profesional) user).getHorario());
            telefonoField.setText(((Profesional) user).getTelefono());
            webField.setText(((Profesional) user).getWeb());
            
        } else { //Si no lo es...
            togglePro.setSelected(false);
            variablesPro.setEnabled(false);
            descripcionField.setText("");
            horarioField.setText("");
            telefonoField.setText("");
            webField.setText("");
        }

        //Bloqueamos el uso de la venta general del administrador.
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
        panelPerfil = new javax.swing.JPanel();
        correoLabel = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        claveLabel = new javax.swing.JLabel();
        claveField = new javax.swing.JPasswordField();
        editarNombre = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        ccppLabel = new javax.swing.JLabel();
        ccppField = new javax.swing.JFormattedTextField();
        ccLabel = new javax.swing.JLabel();
        ccField = new javax.swing.JFormattedTextField();
        dniLabel = new javax.swing.JLabel();
        dniField = new javax.swing.JFormattedTextField();
        variablesPro = new javax.swing.JPanel();
        descripcionLabel = new javax.swing.JLabel();
        descripciónScroll = new javax.swing.JScrollPane();
        descripcionField = new javax.swing.JTextArea();
        horarioLabel = new javax.swing.JLabel();
        horarioField = new javax.swing.JFormattedTextField();
        telefonoLabel = new javax.swing.JLabel();
        telefonoField = new javax.swing.JFormattedTextField();
        webLabel = new javax.swing.JLabel();
        webField = new javax.swing.JTextField();
        botonBaja = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        togglePro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Javapop - Administrar cliente");
        setResizable(false);
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
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        correoLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        correoLabel.setText("Correo:");

        correoField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        correoField.setEnabled(false);

        claveLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        claveLabel.setText("Contraseña:");

        claveField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        claveField.setEchoChar('*');
        claveField.setEnabled(false);

        editarNombre.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        editarNombre.setText("Nombre y apellidos:");

        nombreField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        nombreField.setEnabled(false);

        ccppLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ccppLabel.setText("Codigo postal:");

        try {
            ccppField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccppField.setEnabled(false);
        ccppField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        ccLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ccLabel.setText("Tarjeta de crédito:");

        try {
            ccField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ccField.setEnabled(false);
        ccField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        dniLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        dniLabel.setText("DNI:");

        try {
            dniField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dniField.setEnabled(false);
        dniField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        variablesPro.setBackground(new java.awt.Color(51, 153, 255));
        variablesPro.setEnabled(false);

        descripcionLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        descripcionLabel.setText("Descripción");

        descripcionField.setColumns(20);
        descripcionField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        descripcionField.setRows(5);
        descripcionField.setEnabled(false);
        descripciónScroll.setViewportView(descripcionField);

        horarioLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        horarioLabel.setText("Horario");

        try {
            horarioField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horarioField.setEnabled(false);
        horarioField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        telefonoLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        telefonoLabel.setText("Teléfono");

        try {
            telefonoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoField.setEnabled(false);
        telefonoField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        webLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        webLabel.setText("Web");

        webField.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        webField.setEnabled(false);

        javax.swing.GroupLayout variablesProLayout = new javax.swing.GroupLayout(variablesPro);
        variablesPro.setLayout(variablesProLayout);
        variablesProLayout.setHorizontalGroup(
            variablesProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variablesProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(variablesProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoField)
                    .addComponent(horarioField)
                    .addComponent(descripciónScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(webField)
                    .addGroup(variablesProLayout.createSequentialGroup()
                        .addGroup(variablesProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionLabel)
                            .addComponent(horarioLabel)
                            .addComponent(webLabel)
                            .addComponent(telefonoLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        variablesProLayout.setVerticalGroup(
            variablesProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, variablesProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descripcionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripciónScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(horarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefonoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(webLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botonBaja.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        botonBaja.setText("Dar de Baja");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        togglePro.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        togglePro.setText("Pro");
        togglePro.setEnabled(false);

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(correoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccppLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(claveLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(correoField)
                    .addComponent(claveField)
                    .addComponent(dniField)
                    .addComponent(ccField, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(ccppField)
                    .addComponent(nombreField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(variablesPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                            .addComponent(botonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(botonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(togglePro))
                .addContainerGap())
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilLayout.createSequentialGroup()
                        .addComponent(correoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(claveLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccppLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccppField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(variablesPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(togglePro))
                .addGap(1, 1, 1)
                .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonBaja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 417, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * <p>
     * Esta función comprueba si se ha borrado o no el cliente de la ventana
     * emergente, en caso de que el administrador haya decidido darlo de baja,
     * elimina sus productos y ventas y posteriormente elimina el usuario. </p>
     *
     * <p>
     * Al finalizar su primera tarea, la función vuelve a desplegar la lista de
     * clientes anterior. </p>
     *
     * @param evt Evento recogido.
     *
     * @author Eduardo Ruiz Sabajanes
     *
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Desbloqueamos el uso del menú general del administrador.
        this.menu.setEnabled(true);
        //Si borramos el objeto...
        if (borrar) {
            for (Producto prod : user.getProductos()) {
                productos.remove(prod);
            }
            //Borramos las ventas...
            for (Cliente c : usuarios) {
                for (int i = 0; i < c.getVentasNuevas().size(); i++) {
                    if (c.getVentasNuevas().get(i).getComprador().equals(this.user)) {
                        c.getVentasNuevas().remove(i);
                        i--;
                    }
                }
            }
            //Eliminamos el objeto de usuario
            usuarios.remove(this.user);
            menu.usuariosFiltrado.remove(this.user);
        }

        menu.posicionMin = 0;
        //Elegimos que usuarios mostrar.
        menu.displayUsuarios();
        //Bloqueamos o desbloqueamos los botones pertinentes.
        menu.lockUnlockBotonesUsuarios();
        //Colocamos la ventana en el centro.
        menu.toFront();

    }//GEN-LAST:event_formWindowClosed
    
    // <editor-fold defaultstate="collapsed" desc=" Acciones de los botones ">
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.borrar = false;
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed
    
    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        this.borrar = true;
        this.dispose();
    }//GEN-LAST:event_botonBajaActionPerformed
    // </editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonVolver;
    private javax.swing.JFormattedTextField ccField;
    private javax.swing.JLabel ccLabel;
    private javax.swing.JFormattedTextField ccppField;
    private javax.swing.JLabel ccppLabel;
    private javax.swing.JPasswordField claveField;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JTextField correoField;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextArea descripcionField;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JScrollPane descripciónScroll;
    private javax.swing.JFormattedTextField dniField;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel editarNombre;
    private javax.swing.JFormattedTextField horarioField;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nombreField;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JFormattedTextField telefonoField;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JCheckBox togglePro;
    private javax.swing.JPanel variablesPro;
    private javax.swing.JTextField webField;
    private javax.swing.JLabel webLabel;
    // End of variables declaration//GEN-END:variables
}
