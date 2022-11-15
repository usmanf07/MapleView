/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginScreen;

import static UserVerification.User.*;

/**
 *
 * @author usman
 */
public class selectHomeType extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */

    public selectHomeType() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        galleryBtn = new javax.swing.JButton();
        editorBtn = new javax.swing.JButton();
        orLabel = new javax.swing.JLabel();
        loginCredLabel = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MapleView");
        setBackground(new java.awt.Color(255, 51, 102));
        setBounds(new java.awt.Rectangle(500, 300, 500, 300));
        setForeground(java.awt.Color.red);
        setMinimumSize(new java.awt.Dimension(1000, 555));
        getContentPane().setLayout(null);

        galleryBtn.setBackground(new java.awt.Color(255, 102, 102));
        galleryBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        galleryBtn.setForeground(new java.awt.Color(255, 255, 255));
        galleryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-gallery-25.png"))); // NOI18N
        galleryBtn.setText("Open Social Gallery");
        galleryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galleryBtnActionPerformed(evt);
            }
        });
        getContentPane().add(galleryBtn);
        galleryBtn.setBounds(510, 270, 210, 36);

        editorBtn.setBackground(new java.awt.Color(0, 102, 255));
        editorBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        editorBtn.setForeground(new java.awt.Color(255, 255, 255));
        editorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-image-25.png"))); // NOI18N
        editorBtn.setText(" Open Photo Editor");
        editorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editorBtn);
        editorBtn.setBounds(240, 270, 210, 36);

        orLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        orLabel.setText("OR");
        getContentPane().add(orLabel);
        orLabel.setBounds(470, 280, 19, 15);

        loginCredLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        loginCredLabel.setText("What would you like to do today?");
        getContentPane().add(loginCredLabel);
        loginCredLabel.setBounds(250, 180, 450, 50);

        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg-preview-(1).png"))); // NOI18N
        getContentPane().add(logoImage);
        logoImage.setBounds(400, 20, 150, 110);

        welcomeLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        welcomeLabel.setText("Welcome " + currentUser.userName);
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(360, 130, 280, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void galleryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_galleryBtnActionPerformed

    private void editorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(selectHomeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectHomeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectHomeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectHomeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectHomeType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editorBtn;
    private javax.swing.JButton galleryBtn;
    private javax.swing.JLabel loginCredLabel;
    private javax.swing.JLabel logoImage;
    private javax.swing.JLabel orLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
