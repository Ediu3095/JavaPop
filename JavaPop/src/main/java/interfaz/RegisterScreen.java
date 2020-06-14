/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cliente;
import static clases.utils.Colecciones.usuarios;
import static clases.utils.CheckFunctions.*;
import clases.utils.IOCustomLib;
import javax.swing.ImageIcon;

/**
 *
 * @author TheElctrMsc_Gaming
 */
public class RegisterScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {
        initComponents();
        
        ImageIcon img = new ImageIcon(".\\resources\\logo\\IconoJavaPop2.png");
        super.setIconImage(img.getImage());
        
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

        registerButton = new javax.swing.JButton();
        banner = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 160), new java.awt.Dimension(40, 160), new java.awt.Dimension(40, 160));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 160), new java.awt.Dimension(40, 160), new java.awt.Dimension(40, 160));
        registerFields = new interfaz.panels.registerFields();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaPop - Registro");
        setResizable(false);

        registerButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        registerButton.setText("Registrarse");
        registerButton.setPreferredSize(new java.awt.Dimension(87, 30));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        banner.setBackground(new java.awt.Color(51, 153, 255));

        Logo.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 51));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new ImageIcon(".\\resources\\logo\\IconoJavaPop3.png"));
        Logo.setText("JavaPop");

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setText("¿Ya tienes cuenta de Javapop?");

        loginButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 153, 255));
        loginButton.setText("Inicia sesión");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(registerFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(loginButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // Borra todas las alertas de errores
        registerFields.emailErrorLabel.setText("");
        registerFields.passwordErrorLabel.setText("");
        registerFields.nameErrorLabel.setText("");
        registerFields.ppccErrorLabel.setText("");
        registerFields.ccErrorLabel.setText("");
        registerFields.idErrorLabel.setText("");

        // Variable auxiliar
        boolean validUser;

        // Recoje los creedenciales del usuario
        String correo = registerFields.getEmail();
        String clave = registerFields.getPassword();
        String name = registerFields.getNameSurname();
        String ccpp = registerFields.getPPCC();
        String ttcc = registerFields.getCC();
        String dni = registerFields.getID();

        // Comprobamos que el correo sea válido
        if (!checkCorreo(correo)) {
            registerFields.emailErrorLabel.setText("Correo inválido");
        } else if (!checkClave(clave)) {
            registerFields.passwordErrorLabel.setText("Contraseña inválida");
        } else if (!checkCodigoPostal(ccpp)) {
            registerFields.ppccErrorLabel.setText("Codigo postal inválido");
        } else if (!checkTarjetaCredito(ttcc)) {
            registerFields.ccErrorLabel.setText("Tarjeta de crédito inválido");
        } else if (!checkDni(dni)) {
            registerFields.idErrorLabel.setText("DNI inválido");
        } else {
            validUser = true;
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).correo.equals(correo)) {
                    registerFields.emailErrorLabel.setText("Correo en uso");
                    validUser = false;
                    break;
                }
            }

            // Si superamos todas estas comprobaciones el usuario es valido y entra al menú principal
            if (validUser) {
                Cliente user = new Cliente(correo, clave, dni, name, Integer.parseInt(ccpp), ttcc);
                usuarios.add(user);
                IOCustomLib.guardarClientes(usuarios);
                // vv Abrir menu usuario con ese user vv
                new LoginScreen();
                this.dispose();
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        new LoginScreen();
        this.dispose();
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_loginButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel banner;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginButton;
    private javax.swing.JButton registerButton;
    private interfaz.panels.registerFields registerFields;
    // End of variables declaration//GEN-END:variables
}
