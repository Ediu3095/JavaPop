/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cliente;
import static clases.utils.Colecciones.usuarios;
import static clases.utils.CheckFunctions.*;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TheElctrMsc_Gaming
 */
public class LoginScreen extends javax.swing.JFrame {

    private CardLayout itemCL;

    /**
     * Creates new form LogReg
     */
    public LoginScreen() {
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

        banner = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loginFields = new interfaz.panels.loginFields();
        loginButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 160), new java.awt.Dimension(40, 160), new java.awt.Dimension(80, 160));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 160), new java.awt.Dimension(40, 160), new java.awt.Dimension(80, 160));
        jLabel1 = new javax.swing.JLabel();
        registerButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaPop - Inicio de sesión");
        setBackground(new java.awt.Color(0, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        banner.setBackground(new java.awt.Color(51, 153, 255));
        banner.setForeground(new java.awt.Color(0, 0, 51));

        logo.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 0, 51));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new ImageIcon(".\\resources\\logo\\IconoJavaPop3.png"));
        logo.setText("JavaPop");

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        loginButton.setText("Iniciar Sesión");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel1.setText("¿Nuevo en Javapop?");

        registerButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 153, 255));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButton.setText("Resgístrate");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerButton)))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerButton)
                            .addComponent(jLabel1)))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginFields.emailErrorLabel.setText("");
        loginFields.passwordErrorLabel.setText("");
        boolean validUser = true;

        // Recoje los credenciales del usuario
        String correo = loginFields.getEmailField1().getText();
        String clave = new String(loginFields.getPasswordField1().getPassword());

        // Comprobamos si el correo es válido
        if (checkCorreo(correo)) {
            // Si la contraseña es valida
            if (checkClave(clave)) {
                if (correo.equals("admin@javapop.com") && clave.equals("admin")) {
                    // Abrir menu admin
                    new MenuAdmin();
                    this.dispose();
                } else {
                    validUser = false;
                    // Se comprueba que exista algún usuario con ese correo y contraseña
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).correo.equals(correo)) {
                            if (usuarios.get(i).clave.equals(clave)) {
                                // vv Abrir menu usuario con ese user vv
                                new MenuPrincipal(usuarios.get(i));
                                validUser = true;
                                this.dispose();
                                break;
                            }
                        }
                    }
                }
            } else {// Si la contraseña y el correo no coinciden con los de ningun usuario
                // JOptionPane.showMessageDialog(this, "Los datos introducidos son incorrectos", "Credenciales no válidos", JOptionPane.INFORMATION_MESSAGE);
                loginFields.passwordErrorLabel.setText("Contraseña inválida");
            }
        } else {
            // JOptionPane.showMessageDialog(this, "El correo no es válido", "Credenciales no válidos", JOptionPane.INFORMATION_MESSAGE);
            loginFields.emailErrorLabel.setText("Correo inválido");
        }

        if (!validUser) {
            JOptionPane.showMessageDialog(this, "No existe un usuario con el correo indicado, o la contraseña es incorrecta.\nPor favor revise los credenciales e intentelo de nuevo.", "Credenciales no válidos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        new RegisterScreen();
        this.dispose();
    }//GEN-LAST:event_registerButtonMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setFont(new java.awt.Font("OCR A Extended", 1, 12));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButton.setFont(new java.awt.Font("OCR A Extended", 0, 12));
    }//GEN-LAST:event_registerButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private interfaz.panels.loginFields loginFields;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel registerButton;
    // End of variables declaration//GEN-END:variables
}