/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import lk.ijse.pos.controller.DoctorController;
import lk.ijse.pos.controller.ScheduleController;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.dto.ScheduleDTO;

/**
 *
 * @author DEll
 */
public class PnlAddSchedule extends javax.swing.JPanel {

    /**
     * Creates new form AddSchedule
     */
    public PnlAddSchedule() {
        initComponents();
        loadDoctorNames();
        txtDoctorId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbDoctorName = new javax.swing.JComboBox();
        cmbDay = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtPatientPerDay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        txtTimePeriod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                         Add Schedule");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1090, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Patients Per Day  ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Day");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 30));

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 204, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 100, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 54, 54));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, 40));

        cmbDoctorName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDoctorNameItemStateChanged(evt);
            }
        });
        add(cmbDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cmbDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDayActionPerformed(evt);
            }
        });
        add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Doctor Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));
        add(txtPatientPerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Time Period");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 30));
        add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, 30));
        add(txtTimePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("08:15 AM - 10:30AM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 274, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbDoctorNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDoctorNameItemStateChanged
        try {
            String name = (String) cmbDoctorName.getSelectedItem();
            DoctorDTO doctorDTO = DoctorController.findByName(name);
            txtDoctorId.setText(Integer.toString(doctorDTO.getdID()));
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDoctorNameItemStateChanged

    private void cmbDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDayActionPerformed
        txtPatientPerDay.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDayActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            ScheduleDTO scheduleDTO=new ScheduleDTO(Integer.parseInt(txtDoctorId.getText()),
                    (String)cmbDoctorName.getSelectedItem(),
                    (String)cmbDay.getSelectedItem(),
                    txtTimePeriod.getText(),
                    txtPatientPerDay.getText());
            boolean result=ScheduleController.addSchedule(scheduleDTO);
            if (result) {
                JOptionPane.showMessageDialog(this, "Shedule has been added Successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Shedule hasn't been added Successfully");
            }
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbDoctorName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtPatientPerDay;
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
