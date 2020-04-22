package cleancodeppl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author Shabrina
 */
public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        this.setBackground(new Color(0,0,0)); 
        this.setLocationRelativeTo(null);//Center Form in the screen
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel2.setBackground(new Color(255, 255, 255)); //jPanel2 set transparent

        jTextFieldUsername.setBackground(new Color(255, 255, 255));
        jTextFieldUsername.setBorder(new RoundedBorder(5));

        jTextFieldFullName.setBackground(new Color(255, 255, 255));
        jTextFieldFullName.setBorder(new RoundedBorder(5));
        
        jTextFieldEmail.setBackground(new Color(255, 255, 255));
        jTextFieldEmail.setBorder(new RoundedBorder(5));
                
        jPasswordFieldPassword.setBackground(new Color(255, 255, 255));
        jPasswordFieldPassword.setBorder(new RoundedBorder(5));
        
        jTextFieldGender.setBackground(new Color(255, 255, 255));
        jTextFieldGender.setBorder(new RoundedBorder(5));

        jButtonRegister.setContentAreaFilled(false);
        jButtonRegister.setBorder(new RoundedBorder(30));
        
        //Load Icon untuk jLabel Profile
        ImageIcon iconProfile = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Profile-02.png")));
        Image profileImage = iconProfile.getImage();
        Image profileScaledImage = profileImage.getScaledInstance(jLabelProfileImage.getWidth(), jLabelProfileImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconProfile = new ImageIcon(profileScaledImage);
        jLabelProfileImage.setIcon(finalIconProfile);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelRegisterForm = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldGender = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelFormClose = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jLabelFormBack = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jLabelLoginForm1 = new javax.swing.JLabel();
        jLabelProfileImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(470, 470));

        jLabelFullName.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(30, 78, 112));
        jLabelFullName.setText("Full Name");

        jLabelRegisterForm.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelRegisterForm.setForeground(new java.awt.Color(30, 78, 112));
        jLabelRegisterForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegisterForm.setText("Register Form");

        jLabelEmail.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(30, 78, 112));
        jLabelEmail.setText("Email");

        jLabelUsername.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(30, 78, 112));
        jLabelUsername.setText("Username");

        jTextFieldFullName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldFullName.setText("Full Name");
        jTextFieldFullName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldFullName.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setSelectionColor(new java.awt.Color(30, 75, 112));
        jTextFieldFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFullNameActionPerformed(evt);
            }
        });

        jTextFieldUsername.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldUsername.setText("Username");
        jTextFieldUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldUsername.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setSelectionColor(new java.awt.Color(30, 75, 112));

        jTextFieldEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldEmail.setText("Email");
        jTextFieldEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldEmail.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setSelectionColor(new java.awt.Color(30, 75, 112));

        jLabelPassword.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(30, 78, 112));
        jLabelPassword.setText("Password");

        jLabelGender.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(30, 78, 112));
        jLabelGender.setText("Gender");

        jTextFieldGender.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldGender.setText("Male/Female");
        jTextFieldGender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldGender.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setSelectionColor(new java.awt.Color(30, 75, 112));

        jPasswordFieldPassword.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPasswordFieldPassword.setText("jPasswordField1");
        jPasswordFieldPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordFieldPassword.setMaximumSize(new java.awt.Dimension(66, 30));
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(66, 30));
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(66, 30));
        jPasswordFieldPassword.setSelectionColor(new java.awt.Color(30, 75, 112));

        jLabelFormClose.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelFormClose.setForeground(new java.awt.Color(30, 78, 112));
        jLabelFormClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormClose.setText("X");
        jLabelFormClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFormCloseMouseClicked(evt);
            }
        });

        jButtonRegister.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(30, 78, 112));
        jButtonRegister.setText("Register");
        jButtonRegister.setPreferredSize(new java.awt.Dimension(70, 30));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabelFormBack.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelFormBack.setForeground(new java.awt.Color(30, 75, 112));
        jLabelFormBack.setText("<");
        jLabelFormBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFormBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRegisterForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFullName)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelUsername)
                                    .addComponent(jLabelPassword)
                                    .addComponent(jLabelGender))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(jButtonRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelFormBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFormClose)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFormClose)
                    .addComponent(jLabelFormBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegisterForm)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFullName)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));
        jPanel1.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelLoginForm1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelLoginForm1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginForm1.setText("Authentication User");
        jPanel1.add(jLabelLoginForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 240, -1));
        jPanel1.add(jLabelProfileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFormCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFormCloseMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelFormCloseMouseClicked

    private void jTextFieldFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFullNameActionPerformed

    private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseClicked
        String fullName = jTextFieldFullName.getText();
        String gender = jTextFieldGender.getText();
        String email = jTextFieldEmail.getText();
        String uname = jTextFieldUsername.getText();
        String psswd = jPasswordFieldPassword.getText();
        if (uname.equals("test") || email.equals("test@gmail.com")) {
            new LoginForm().setVisible(true);
            this.dispose();//to close the current jframe
        }else{
            JOptionPane.showMessageDialog(RegisterForm.this, "gagal register");
        }
    }//GEN-LAST:event_jButtonRegisterMouseClicked

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jLabelFormBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFormBackMouseClicked
        new LandingPageForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelFormBackMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFormBack;
    private javax.swing.JLabel jLabelFormClose;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLoginForm1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelProfileImage;
    private javax.swing.JLabel jLabelRegisterForm;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
