package cleancodeppl;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class DashboardFormAbout extends javax.swing.JFrame {

    public DashboardFormAbout() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form in the screen
        this.setBackground(new Color(30,75,112));
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel1.setOpaque(true);
        
        jPanel3.setBackground(new Color(30,75,112));
        jPanel3.setOpaque(true);
        
        jLabelAboutPage.setBackground(new Color(255,255,255,230));
        jLabelAboutPage.setOpaque(true);
        
        jLabelJudulHome.setBackground(new Color(30,75,112));
        jLabelJudulHome.setOpaque(true);
        
        jButtonLogOut.setBorder(new LineBorder(Color.WHITE));
        jButtonLogOut.setBorder(new RoundedBorder(30));
        jButtonLogOut.setContentAreaFilled(false);
        
        //Load Icon untuk jLabelHome
        ImageIcon iconHome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Home_white.png")));
        Image homeImage = iconHome.getImage();
        Image homeScaledImage = homeImage.getScaledInstance(jLabelImageHome.getWidth(), jLabelImageHome.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconHome = new ImageIcon(homeScaledImage);
        jLabelImageHome.setIcon(finalIconHome);
        
        //Load Icon untuk jLabelPerson
        ImageIcon iconPerson = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Person_white.png")));
        Image personImage = iconPerson.getImage();
        Image personScaledImage = personImage.getScaledInstance(jLabelImagePerson.getWidth(), jLabelImagePerson.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconPerson = new ImageIcon(personScaledImage);
        jLabelImagePerson.setIcon(finalIconPerson);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelJudulHome = new javax.swing.JLabel();
        jLabelAboutPage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jLabelHome = new javax.swing.JLabel();
        jLabelAbout = new javax.swing.JLabel();
        jLabelImagePerson = new javax.swing.JLabel();
        jLabelImageHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 75, 112));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(30, 75, 112));
        jPanel2.setMaximumSize(new java.awt.Dimension(470, 470));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 470));

        jLabelJudulHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelJudulHome.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelJudulHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJudulHome.setText("About");
        jLabelJudulHome.setMaximumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setMinimumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setPreferredSize(new java.awt.Dimension(480, 60));

        jLabelAboutPage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAboutPage.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelAboutPage.setForeground(new java.awt.Color(30, 75, 112));
        jLabelAboutPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAboutPage.setText("This is About");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabelAboutPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAboutPage, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 480, 490));

        jButtonLogOut.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("LogOut");
        jButtonLogOut.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogOutMouseClicked(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelHome.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabelAbout.setBackground(new java.awt.Color(30, 75, 112));
        jLabelAbout.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelAbout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAbout.setText("About");
        jLabelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseClicked(evt);
            }
        });

        jLabelImagePerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagePersonMouseClicked(evt);
            }
        });

        jLabelImageHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabelImageHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImageHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelImagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(252, 252, 252)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 490));

        jLabel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jLabel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jLabel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

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

    private void jButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogOutMouseClicked
        new LandingPageForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogOutMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelImageHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImageHomeMouseClicked

    private void jLabelImagePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagePersonMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagePersonMouseClicked

    private void jLabelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFormAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelAboutPage;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelImageHome;
    private javax.swing.JLabel jLabelImagePerson;
    private javax.swing.JLabel jLabelJudulHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
