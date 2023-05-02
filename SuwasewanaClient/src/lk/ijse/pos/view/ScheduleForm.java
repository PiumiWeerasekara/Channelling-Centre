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
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class ScheduleForm extends javax.swing.JFrame {

    /**
     * Creates new form ScheduleForm
     */
    public ScheduleForm() {
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
        jLabel1 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        lblAppointmentList = new javax.swing.JLabel();
        lblMakeAppointment = new javax.swing.JLabel();
        lblManageAppointment = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlLayOut = new javax.swing.JPanel();

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
        TitlePanel.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-close-window-40.png"))); // NOI18N
        lblClose.setText("jLabel3");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        TitlePanel.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Minion Pro Cond", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                        Suwasewana");
        jLabel1.setOpaque(true);
        TitlePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 3, 1090, 130));

        getContentPane().add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1090, 130));

        ButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAppointmentList.setBackground(new java.awt.Color(255, 255, 255));
        lblAppointmentList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAppointmentList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/calendar-icon.png"))); // NOI18N
        lblAppointmentList.setText("View Schedule");
        lblAppointmentList.setOpaque(true);
        lblAppointmentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAppointmentListMouseClicked(evt);
            }
        });
        ButtonPanel.add(lblAppointmentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 60));

        lblMakeAppointment.setBackground(new java.awt.Color(255, 255, 255));
        lblMakeAppointment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMakeAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/add-event-icon.png"))); // NOI18N
        lblMakeAppointment.setText("Add Schedule");
        lblMakeAppointment.setOpaque(true);
        lblMakeAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMakeAppointmentMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMakeAppointmentMouseReleased(evt);
            }
        });
        ButtonPanel.add(lblMakeAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 60));

        lblManageAppointment.setBackground(new java.awt.Color(255, 255, 255));
        lblManageAppointment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-edit-property-30.png"))); // NOI18N
        lblManageAppointment.setText("Edit Schedule");
        lblManageAppointment.setOpaque(true);
        lblManageAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageAppointmentMouseClicked(evt);
            }
        });
        ButtonPanel.add(lblManageAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 60));

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setOpaque(true);
        ButtonPanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 30));

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setOpaque(true);
        ButtonPanel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 30));

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
        ButtonPanel.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("jLabel2");
        jLabel2.setOpaque(true);
        ButtonPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 3, 230, 710));

        getContentPane().add(ButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 710));

        pnlLayOut.setBackground(new java.awt.Color(255, 255, 255));
        pnlLayOut.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlLayOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 1090, 580));

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

    private void lblAppointmentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAppointmentListMouseClicked
        PnlViewSchedule v=new PnlViewSchedule();
        pnlLayOut.removeAll();
        pnlLayOut.add(v);
        pnlLayOut.repaint();;
        pnlLayOut.revalidate();
        pnlLayOut.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAppointmentListMouseClicked

    private void lblMakeAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMakeAppointmentMouseClicked
        PnlAddSchedule a=new PnlAddSchedule();
        pnlLayOut.removeAll();
        pnlLayOut.add(a);
        pnlLayOut.repaint();;
        pnlLayOut.revalidate();
        pnlLayOut.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_lblMakeAppointmentMouseClicked

    private void lblMakeAppointmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMakeAppointmentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMakeAppointmentMouseReleased

    private void lblManageAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageAppointmentMouseClicked
        PnlUpdateSchedule m=new PnlUpdateSchedule();
        pnlLayOut.removeAll();
        pnlLayOut.add(m);
        pnlLayOut.repaint();;
        pnlLayOut.revalidate();
        pnlLayOut.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManageAppointmentMouseClicked

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
            java.util.logging.Logger.getLogger(ScheduleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAppointmentList;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMakeAppointment;
    private javax.swing.JLabel lblManageAppointment;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlLayOut;
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
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String DateFormat = df.format(d1);
        lblDate.setText(DateFormat);
    }
}


    
