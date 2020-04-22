/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancodeppl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shabrina
 */
public class LandingPageForm extends javax.swing.JFrame {

    /**
     * Creates new form LandingPageForm
     */
    public LandingPageForm() {
        initComponents();
        this.setLocationRelativeTo(null);

        jButtonLogin.setBorder(new LineBorder(Color.WHITE));
        jButtonLogin.setBorder(new RoundedBorder(30));

        jButtonRegister.setBorder(new LineBorder(Color.WHITE));
        jButtonRegister.setBorder(new RoundedBorder(30));

        jButtonExit.setBorder(new LineBorder(Color.WHITE));
        jButtonExit.setBorder(new RoundedBorder(30));

        //Load Icon untuk jLabelBackground
        ImageIcon iconBackground = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LandingPage.png")));
        Image imageBackground = iconBackground.getImage();
        Image scaledImageBackground = imageBackground.getScaledInstance(jLabelBackground.getWidth(), jLabelBackground.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalImageBackground = new ImageIcon(scaledImageBackground);
        jLabelBackground.setIcon(finalImageBackground);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 490));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 490));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBackground.setMaximumSize(new java.awt.Dimension(720, 490));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(720, 490));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(720, 490));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonLogin.setBackground(new java.awt.Color(30, 75, 112));
        jButtonLogin.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonLogin.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonLogin.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(30, 75, 112));
        jButtonRegister.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonRegister.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonRegister.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(30, 75, 112));
        jButtonExit.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonExit.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonExit.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseClicked
        new RegisterForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegisterMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        new LoginForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
