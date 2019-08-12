package HRD;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

 ResultSet rs = null;
 PreparedStatement ps =null;
    int dragXmouse;
    int dragYmouse;
    public FormLogin() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        txt_passwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(51, 51, 51));
        txt_username.setBorder(null);
        txt_username.setSelectedTextColor(new java.awt.Color(0, 102, 255));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 310, 30));

        txt_passwd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_passwd.setForeground(new java.awt.Color(51, 51, 51));
        txt_passwd.setBorder(null);
        txt_passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 320, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRD/image/loginBtn.png"))); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRD/image/closeRed.png"))); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRD/image/loginUI.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(500, 0, 480, 600);

        jPanel2.setBackground(new java.awt.Color(49, 99, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRD/image/logosisdm.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 320, 100));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to Sistem Informasi");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sumber Daya Manusia Version 1.0");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Made in");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRD/image/ID.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, -1, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Created by Umar Ulkhak");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 600);

        setSize(new java.awt.Dimension(981, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed1.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed1.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        ImageIcon B = new ImageIcon(getClass().getResource("image/loginBtn1.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        ImageIcon B = new ImageIcon(getClass().getResource("image/loginBtn1.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon B = new ImageIcon(getClass().getResource("image/loginBtn.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("image/loginBtn.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     try {
         Connection kon = Personalia.sambungKeDatabase();
         ResultSet as = kon.createStatement().executeQuery("select * from user where username='"+txt_username.getText()+"' and password ='"+String.valueOf(txt_passwd.getText())+"'");
         if(as.next()){
             Home ad =new Home();
             ad.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ad.setVisible(true);
             dispose();
         }else{
         JOptionPane.showMessageDialog(rootPane, "Username / Password Salah !");
         }
     } catch (SQLException ex) {
         Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txt_passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwdActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                String tampilan = javax.swing.UIManager.getSystemLookAndFeelClassName();
                try{
                javax.swing.UIManager.setLookAndFeel(tampilan);
               }catch(Exception e){}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_passwd;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
