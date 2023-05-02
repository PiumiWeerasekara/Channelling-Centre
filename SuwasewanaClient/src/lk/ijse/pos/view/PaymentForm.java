/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.pos.controller.AppointmentController;
import lk.ijse.pos.dto.AppointmentDTO;

/**
 *
 * @author DEll
 */
public class PaymentForm extends javax.swing.JFrame {

    /**
     * Creates new form PaymentForm
     */
    public PaymentForm() {
        initComponents();
        loadSystemDate();
        loadSystemTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        pnlLayOut = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAID = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-minimize-window-40 (1).png"))); // NOI18N
        lblMinimize.setText("jLabel3");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        TitlePanel.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 40));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-close-window-40.png"))); // NOI18N
        lblClose.setText("jLabel3");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        TitlePanel.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 40, 40));

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setOpaque(true);
        TitlePanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 30));

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setOpaque(true);
        TitlePanel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 30));

        lblHome.setBackground(new java.awt.Color(255, 255, 255));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/home.png"))); // NOI18N
        lblHome.setText("jLabel3");
        lblHome.setOpaque(true);
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });
        TitlePanel.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Minion Pro Cond", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                               Suwasewana");
        jLabel1.setOpaque(true);
        TitlePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 130));

        getContentPane().add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 130));

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLayOut.setBackground(new java.awt.Color(255, 255, 255));
        pnlLayOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                               Payment");
        jLabel3.setOpaque(true);
        pnlLayOut.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1300, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Patient Name");
        pnlLayOut.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        pnlLayOut.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 260, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Appointment ID");
        pnlLayOut.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 30));

        txtAID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAIDActionPerformed(evt);
            }
        });
        pnlLayOut.add(txtAID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 30));

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 204, 51));
        btnAdd.setText("Add");
        pnlLayOut.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 40));

        btnCancel.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(239, 54, 54));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlLayOut.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Amount");
        pnlLayOut.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 30));

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        pnlLayOut.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        tblAppointments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Date", "Doctor Name"
            }
        ));
        jScrollPane1.setViewportView(tblAppointments);

        pnlLayOut.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 240));

        lblSearch.setBackground(new java.awt.Color(255, 255, 255));
        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-search-30.png"))); // NOI18N
        lblSearch.setOpaque(true);
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });
        pnlLayOut.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 40, 50));

        MainPanel.add(pnlLayOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1300, 580));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int response=JOptionPane.showConfirmDialog(this, "Are you sure want to exit?");
        if(response==0){
            System.exit(0);
        }else if(response==1){
        }else if(response==2){
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtAIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAIDActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        this.setVisible(false);
        ReceptionHome r = new ReceptionHome();
        r.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        lblHome.setBackground(Color.gray);
        lblHome.setSize(60,60);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        lblHome.setBackground(Color.white);
        lblHome.setSize(50,50);
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked

        try {
            String name = txtPatientName.getText();
            
            AppointmentDTO appointmentDTO=AppointmentController.searchAppointmentsByPatient(name);
            DefaultTableModel dtm=(DefaultTableModel) tblAppointments.getModel();
            dtm.setRowCount(0);
            List<AppointmentDTO> appointments=AppointmentController.getAllAppointments();
            if (appointments==null) {
                return;
            }
            for (AppointmentDTO appointment : appointments) {
                Object[] rowData={
                    appointment.getAppointmentID(),
                    appointment.getAppDate(),
                    appointment.getdName()};
                dtm.addRow(rowData);
            }
            /*
            String name = txtPatientName.getText();
            
            DefaultTableModel dtm=(DefaultTableModel) tblAppointments.getModel();
            dtm.setRowCount(0);
            AppointmentDTO appointments=AppointmentController.searchAppointmentsByPatient(name);
            if (appointments==null) {
                return;
            }
            for (AppointmentDTO appointment : appointments) {
                Object[] rowData={
                    appointment.getAppointmentID(),
                    appointment.getAppDate(),
                    appointment.getdName()};
                dtm.addRow(rowData);
            }
            */

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(pnlAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblSearchMouseClicked

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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlLayOut;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextField txtAID;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private void loadSystemTime() {
        new javax.swing.Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss ");
                String DateFormat = df.format(d1);
                lblTime.setText(DateFormat);
            }
        }).start();
    }

    private void loadSystemDate() {
        Date d1=new Date();
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        String DateFormat=df.format(d1);
        lblDate.setText(DateFormat);
    }
}
