package cleancodeppl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LoginForm extends javax.swing.JFrame {
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form in the screen
        this.setBackground(new Color(30,75,112));//Set Background for the screen
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel2.setBackground(new Color(255, 255, 255)); //jPanel2 set transparent
        
        jPasswordField.setBackground(new Color(255, 255, 255));
        jPasswordField.setBorder(new RoundedBorder(5));
        
        jTextFieldUsername.setBackground(new Color(255, 255, 255));
        jTextFieldUsername.setBorder(new RoundedBorder(5));
        
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setBorder(new RoundedBorder(30));
        
        //Load Icon untuk jLabel Profile
        ImageIcon iconProfile = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Profile-02.png")));
        Image profileImage = iconProfile.getImage();
        Image profileScaledImage = profileImage.getScaledInstance(jLabelProfileImage.getWidth(), jLabelProfileImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconProfile = new ImageIcon(profileScaledImage);
        jLabelProfileImage.setIcon(finalIconProfile);
        
        //Load Icon untuk jLabel Username
        ImageIcon iconPeople = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Person-02.png")));
        Image icon_people = iconPeople.getImage();
        Image icon_people_ = icon_people.getScaledInstance(jLabelUsername.getWidth(), jLabelUsername.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIcon = new ImageIcon(icon_people_);
        jLabelUsername.setIcon(finalIcon);
        
        //Load Icon untuk jLabel Password
        ImageIcon loginPassword = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Password-02.png")));
        Image img3 = loginPassword.getImage();
        Image img4 = img3.getScaledInstance(jLabelPassword.getWidth(), jLabelPassword.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon j = new ImageIcon(img4);
        jLabelPassword.setIcon(j);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allert = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLoginForm = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelCloseForm = new javax.swing.JLabel();
        jLabelCloseForm1 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();
        jLabelProfileImage = new javax.swing.JLabel();
        jLabelLoginForm1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 52, 52));
        setMaximumSize(new java.awt.Dimension(720, 490));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(710, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(710, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(470, 470));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 470));
        jPanel2.setPreferredSize(new java.awt.Dimension(470, 470));

        jLabelLoginForm.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelLoginForm.setForeground(new java.awt.Color(30, 75, 112));
        jLabelLoginForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginForm.setText("Login Form");

        jTextFieldUsername.setText("Fill Username");
        jTextFieldUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldUsername.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setSelectionColor(new java.awt.Color(30, 75, 112));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabelUsername.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabelUsername.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabelUsername.setPreferredSize(new java.awt.Dimension(30, 30));

        jPasswordField.setText("fillusername");
        jPasswordField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField.setMaximumSize(new java.awt.Dimension(66, 30));
        jPasswordField.setMinimumSize(new java.awt.Dimension(66, 30));
        jPasswordField.setPreferredSize(new java.awt.Dimension(66, 30));
        jPasswordField.setSelectionColor(new java.awt.Color(30, 75, 112));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jLabelCloseForm.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelCloseForm.setForeground(new java.awt.Color(30, 75, 112));
        jLabelCloseForm.setText("X");
        jLabelCloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseFormMouseClicked(evt);
            }
        });

        jLabelCloseForm1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelCloseForm1.setForeground(new java.awt.Color(30, 75, 112));
        jLabelCloseForm1.setText("<");
        jLabelCloseForm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseForm1MouseClicked(evt);
            }
        });

        jButtonLogin.setText("Login");
        jButtonLogin.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonLogin.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonLogin.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLoginForm, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCloseForm1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCloseForm)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCloseForm)
                    .addComponent(jLabelCloseForm1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jLabelLoginForm.getAccessibleContext().setAccessibleName("jLabelLoginForm");
        jLabelUsername.getAccessibleContext().setAccessibleName("jLabel6");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 470, 470));

        jLabelBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBackgroundMousePressed(evt);
            }
        });
        jPanel1.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabelProfileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 90));

        jLabelLoginForm1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelLoginForm1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginForm1.setText("Authentication User");
        jPanel1.add(jLabelLoginForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jLabelCloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseFormMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCloseFormMouseClicked

    private void jLabelBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackgroundMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelBackgroundMousePressed

    private void jLabelCloseForm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseForm1MouseClicked
        new LandingPageForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelCloseForm1MouseClicked

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String uname = jTextFieldUsername.getText();
        String psswd = jPasswordField.getText();
        if (uname.equals("test") && psswd.equals("test")) {
            new DashboardFormHome().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(LoginForm.this, "gagal login");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane allert;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelCloseForm;
    private javax.swing.JLabel jLabelCloseForm1;
    private javax.swing.JLabel jLabelLoginForm;
    private javax.swing.JLabel jLabelLoginForm1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelProfileImage;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
