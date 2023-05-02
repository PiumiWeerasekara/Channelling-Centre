/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.pos.controller.DoctorController;
import lk.ijse.pos.controller.ScheduleController;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.dto.ScheduleDTO;

/**
 *
 * @author DEll
 */
public class PnlUpdateSchedule extends javax.swing.JPanel {

    /**
     * Creates new form PnlUpdateSchedule
     */
    public PnlUpdateSchedule() {
        initComponents();
        loadDoctorNames();
        txtScheduleId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientsPerDay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTimePeriod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDId = new javax.swing.JTextField();
        cmbDoctorName = new javax.swing.JComboBox();
        cmbDay = new javax.swing.JComboBox();
        txtScheduleId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Doctor Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Day");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Patients Per Day  ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 30));
        add(txtPatientsPerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 40, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Time Period");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 30));

        txtTimePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimePeriodActionPerformed(evt);
            }
        });
        add(txtTimePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 30));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                         Update Schedule");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1090, 60));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 54, 54));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 100, 40));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("08:15 AM - 10:30AM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 150, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Doctor Id");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        txtDId.setEditable(false);
        add(txtDId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, 30));

        cmbDoctorName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDoctorNameItemStateChanged(evt);
            }
        });
        add(cmbDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 210, 30));

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cmbDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDayActionPerformed(evt);
            }
        });
        add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 150, 30));
        add(txtScheduleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbDoctorNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDoctorNameItemStateChanged
        try {
            String name = (String) cmbDoctorName.getSelectedItem();
            ScheduleDTO scheduleDTO=ScheduleController.searchSchedule(name); 
            txtScheduleId.setText(Integer.toString(scheduleDTO.getSheduleID()));
            txtDId.setText(Integer.toString(scheduleDTO.getdID()));
            txtPatientsPerDay.setText(scheduleDTO.getPatientsPerDay());
            txtTimePeriod.setText(scheduleDTO.getTimePeriod());
            cmbDay.setSelectedItem(scheduleDTO.getDay());
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlUpdateSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDoctorNameItemStateChanged

    private void cmbDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDayActionPerformed
        txtPatientsPerDay.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ScheduleDTO scheduleDTO=new ScheduleDTO(Integer.parseInt(txtScheduleId.getText()),
                    Integer.parseInt(txtDId.getText()),
                    (String) cmbDoctorName.getSelectedItem(),
                    (String)cmbDay.getSelectedItem(),
                    txtTimePeriod.getText(),
                    txtPatientsPerDay.getText());
            boolean result=ScheduleController.updateSchedule(scheduleDTO);
            if (result) {
                JOptionPane.showMessageDialog(this, "Schedule has been updated successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Schedule hasn't been updated successfully");
            }
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlUpdateSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTimePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimePeriodActionPerformed
        jButton3.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimePeriodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbDoctorName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDId;
    private javax.swing.JTextField txtPatientsPerDay;
    private javax.swing.JTextField txtScheduleId;
    private javax.swing.JTextField txtTimePeriod;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorNames() {
        try {
            List<DoctorDTO> doctors = DoctorController.getAllDoctors();
            if (doctors != null) {
                cmbDoctorName.removeAllItems();

            }
            for (DoctorDTO doctor : doctors) {
                cmbDoctorName.addItem(doctor.getdName());
            }
        } catch (Exception ex) {
            Logger.getLogger(pnlAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

