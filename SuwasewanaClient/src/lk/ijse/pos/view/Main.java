/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import java.awt.Color;

/* @author DEll
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        ImageLable.setVisible(true);
        lblReceptionist.setBackground(new Color(25, 181, 254, 100));
        lblAdmin.setBackground(new Color(25, 181, 254, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        txtRec = new javax.swing.JLabel();
        lblReceptionist = new javax.swing.JLabel();
        txtAd = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        ImageLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRec.setText("Receptionist");
        mainPanel.add(txtRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 140, 30));

        lblReceptionist.setBackground(new java.awt.Color(82, 179, 217));
        lblReceptionist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/receptionist-icon.png 128.png"))); // NOI18N
        lblReceptionist.setText("       ");
        lblReceptionist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        lblReceptionist.setOpaque(true);
        lblReceptionist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReceptionistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReceptionistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReceptionistMouseExited(evt);
            }
        });
        mainPanel.add(lblReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 230));

        txtAd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAd.setText("Admin");
        mainPanel.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 140, 30));

        lblAdmin.setBackground(new java.awt.Color(82, 179, 217));
        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/administrator-icon.png 128.png"))); // NOI18N
        lblAdmin.setText("       ");
        lblAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        lblAdmin.setOpaque(true);
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminMouseExited(evt);
            }
        });
        mainPanel.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 170, 230));

        ImageLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/1511998416o-DOCTOR-facebook878797.jpg"))); // NOI18N
        ImageLable.setText("jLabel1");
        mainPanel.add(ImageLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 500));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblReceptionistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReceptionistMouseEntered
        lblReceptionist.setSize(180, 240);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReceptionistMouseEntered

    private void lblReceptionistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReceptionistMouseExited
        lblReceptionist.setSize(170, 230);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReceptionistMouseExited

    private void lblReceptionistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReceptionistMouseClicked
        ReceptionLogin r = new ReceptionLogin();
        lblReceptionist.setBackground(Color.BLUE);
        txtRec.setForeground(Color.DARK_GRAY);
        this.setVisible(false);
        r.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReceptionistMouseClicked

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        ReceptionLogin r = new ReceptionLogin();
        lblAdmin.setBackground(Color.lightGray);
        txtAd.setForeground(Color.DARK_GRAY);
        r.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdminMouseClicked

    private void lblAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdminMouseEntered

    private void lblAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdminMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLable;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblReceptionist;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel txtAd;
    private javax.swing.JLabel txtRec;
    // End of variables declaration//GEN-END:variables
}
