/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.pos.controller.DoctorController;
import lk.ijse.pos.controller.HospitalController;
import lk.ijse.pos.controller.SpecialityController;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.dto.SpecialityDTO;

/**
 *
 * @author DEll
 */
public class PnlAddDoctor extends javax.swing.JPanel {

    /**
     * Creates new form PnlAddDoctor
     */
    public PnlAddDoctor() {
        initComponents();
        loadHospitals();
        loadSpecialities();
        txtDName.requestFocus();
        txtDName.requestFocus();
        txtHospital.requestFocus();
        txtSpeciality.requestFocus();
        txtSpecialityID.setVisible(false);
        txtHospitalID.setVisible(false);
        pnlAddHospital.setVisible(false);
        pnlAddSpeciality.setVisible(false);
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
        txtSpecialityID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbHospitalName = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cmbSpeciality = new javax.swing.JComboBox();
        pnlAddSpeciality = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        btnCancelSpe = new javax.swing.JButton();
        btnAddSpe = new javax.swing.JButton();
        lblCloseS = new javax.swing.JLabel();
        pnlAddHospital = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        btnCancelHos = new javax.swing.JButton();
        btnAddHos = new javax.swing.JButton();
        lblCloseH = new javax.swing.JLabel();
        lblNewPatient = new javax.swing.JLabel();
        lblAddNewSpeciality = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtHospitalID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                         Add new Doctor");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1090, 60));

        txtSpecialityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityIDActionPerformed(evt);
            }
        });
        add(txtSpecialityID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 30, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));

        txtDName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNameActionPerformed(evt);
            }
        });
        add(txtDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 260, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Address");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 30));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 260, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Contact");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 30));

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("NIC");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 30));

        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 190, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Hospital");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, 30));

        txtGID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGIDActionPerformed(evt);
            }
        });
        add(txtGID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 190, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Government ID");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 30));

        cmbHospitalName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHospitalNameItemStateChanged(evt);
            }
        });
        cmbHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospitalNameActionPerformed(evt);
            }
        });
        add(cmbHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 160, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Speciality");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, 30));

        cmbSpeciality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSpecialityItemStateChanged(evt);
            }
        });
        cmbSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSpecialityActionPerformed(evt);
            }
        });
        add(cmbSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 160, 30));

        pnlAddSpeciality.setBackground(new java.awt.Color(153, 153, 255));
        pnlAddSpeciality.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Speciality");
        pnlAddSpeciality.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        txtSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityActionPerformed(evt);
            }
        });
        pnlAddSpeciality.add(txtSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, -1));

        btnCancelSpe.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelSpe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelSpe.setForeground(new java.awt.Color(255, 51, 51));
        btnCancelSpe.setText("Cancel");
        btnCancelSpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSpeActionPerformed(evt);
            }
        });
        pnlAddSpeciality.add(btnCancelSpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 30));

        btnAddSpe.setBackground(new java.awt.Color(204, 255, 204));
        btnAddSpe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddSpe.setForeground(new java.awt.Color(0, 204, 0));
        btnAddSpe.setText("Add");
        btnAddSpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSpeActionPerformed(evt);
            }
        });
        pnlAddSpeciality.add(btnAddSpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 30));

        lblCloseS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/Error-icon.png"))); // NOI18N
        lblCloseS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseSMouseClicked(evt);
            }
        });
        pnlAddSpeciality.add(lblCloseS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 30));

        add(pnlAddSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 280, 170));

        pnlAddHospital.setBackground(new java.awt.Color(153, 153, 255));
        pnlAddHospital.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Hospital Name");
        pnlAddHospital.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        txtHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalActionPerformed(evt);
            }
        });
        pnlAddHospital.add(txtHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, -1));

        btnCancelHos.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelHos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelHos.setForeground(new java.awt.Color(255, 51, 51));
        btnCancelHos.setText("Cancel");
        btnCancelHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelHosActionPerformed(evt);
            }
        });
        pnlAddHospital.add(btnCancelHos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 30));

        btnAddHos.setBackground(new java.awt.Color(204, 255, 204));
        btnAddHos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddHos.setForeground(new java.awt.Color(0, 204, 0));
        btnAddHos.setText("Add");
        btnAddHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHosActionPerformed(evt);
            }
        });
        pnlAddHospital.add(btnAddHos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 30));

        lblCloseH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/Error-icon.png"))); // NOI18N
        lblCloseH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseHMouseClicked(evt);
            }
        });
        pnlAddHospital.add(lblCloseH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 30));

        add(pnlAddHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 280, 170));

        lblNewPatient.setBackground(new java.awt.Color(153, 255, 255));
        lblNewPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-plus-40.png"))); // NOI18N
        lblNewPatient.setText("Add new Hospital");
        lblNewPatient.setOpaque(true);
        lblNewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewPatientMouseClicked(evt);
            }
        });
        add(lblNewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 180, 50));

        lblAddNewSpeciality.setBackground(new java.awt.Color(153, 255, 255));
        lblAddNewSpeciality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddNewSpeciality.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/resources/icons8-plus-40.png"))); // NOI18N
        lblAddNewSpeciality.setText("Add new Speciality");
        lblAddNewSpeciality.setOpaque(true);
        lblAddNewSpeciality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewSpecialityMouseClicked(evt);
            }
        });
        add(lblAddNewSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 180, 50));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 51));
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 100, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 54, 54));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 100, 40));

        txtHospitalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIDActionPerformed(evt);
            }
        });
        add(txtHospitalID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSpecialityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialityIDActionPerformed

    private void txtDNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNameActionPerformed
        txtAddress.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        txtContact.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        txtNIC.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        txtGID.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtGIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGIDActionPerformed

    private void cmbHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospitalNameActionPerformed

    private void cmbSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSpecialityActionPerformed

    private void txtHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalActionPerformed
        btnAddHos.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalActionPerformed

    private void btnCancelHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelHosActionPerformed
        txtHospital.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelHosActionPerformed

    private void lblNewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewPatientMouseClicked
        pnlAddHospital.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNewPatientMouseClicked

    private void btnAddHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHosActionPerformed
        try {
            HospitalDTO hospitalDTO = new HospitalDTO(txtHospital.getText());
            boolean result = HospitalController.addHospital(hospitalDTO);

            if (result) {
                JOptionPane.showMessageDialog(this, "Hospital added Succesfully");
            } else {
                JOptionPane.showMessageDialog(this, "Hospital not added Succesfully");
            }
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddHosActionPerformed

    private void lblAddNewSpecialityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewSpecialityMouseClicked
        pnlAddSpeciality.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAddNewSpecialityMouseClicked

    private void txtSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityActionPerformed
        btnAddSpe.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialityActionPerformed

    private void btnCancelSpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSpeActionPerformed
        txtSpeciality.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelSpeActionPerformed

    private void btnAddSpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSpeActionPerformed
        try {
            SpecialityDTO specialityDTO = new SpecialityDTO(txtSpeciality.getText());
            boolean result = SpecialityController.addSpeciality(specialityDTO);

            if (result) {
                JOptionPane.showMessageDialog(this, "Speciality added Succesfully");
            } else {
                JOptionPane.showMessageDialog(this, "Speciality not added Succesfully");
            }
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddSpeActionPerformed

    private void lblCloseHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseHMouseClicked
        pnlAddHospital.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseHMouseClicked

    private void lblCloseSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseSMouseClicked
        pnlAddSpeciality.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseSMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtDName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtGID.setText("");
        txtNIC.setText("");
        cmbSpeciality.removeAllItems();
        cmbHospitalName.removeAllItems();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbHospitalNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHospitalNameItemStateChanged
        try {
            String hospital=(String)cmbHospitalName.getSelectedItem();
         System.out.println(hospital);
         HospitalDTO hospitalDTO=HospitalController.search(hospital);
         System.out.println("abcH");
         txtHospitalID.setText(Integer.toString(hospitalDTO.gethID()));
         System.out.println("abcdH");
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cmbHospitalNameItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DoctorDTO doctorDTO = new DoctorDTO(txtDName.getText(),
                    Integer.parseInt(txtSpecialityID.getText()),
                    Integer.parseInt(txtHospitalID.getText()),
                    txtGID.getText(),
                    txtAddress.getText(),
                    txtNIC.getText(),
                    txtContact.getText(),
                    cmbHospitalName.getSelectedItem().toString(),
                    (String) cmbSpeciality.getSelectedItem());
            boolean result = DoctorController.addDoctor(doctorDTO);
            if (result) {
                JOptionPane.showMessageDialog(this, "Doctor has been saved successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save the Doctor");
            }

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbSpecialityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSpecialityItemStateChanged
        try {
            String speciality = (String) cmbSpeciality.getSelectedItem();
            System.out.println(speciality);
            SpecialityDTO specialityDTO = SpecialityController.searchSpeciality(speciality);
            System.out.println("abc");
            txtSpecialityID.setText(Integer.toString(specialityDTO.getSpecialityID()));
            System.out.println("abcd");

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSpecialityItemStateChanged

    private void txtHospitalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHos;
    private javax.swing.JButton btnAddSpe;
    private javax.swing.JButton btnCancelHos;
    private javax.swing.JButton btnCancelSpe;
    private javax.swing.JComboBox cmbHospitalName;
    private javax.swing.JComboBox cmbSpeciality;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddNewSpeciality;
    private javax.swing.JLabel lblCloseH;
    private javax.swing.JLabel lblCloseS;
    private javax.swing.JLabel lblNewPatient;
    private javax.swing.JPanel pnlAddHospital;
    private javax.swing.JPanel pnlAddSpeciality;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtGID;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtSpecialityID;
    // End of variables declaration//GEN-END:variables

    private void loadHospitals() {
        try {
            List<HospitalDTO> hospitals = HospitalController.getHospitals();
            cmbHospitalName.removeAllItems();
            if (hospitals == null) {
                return;
            }

            for (HospitalDTO hospital : hospitals) {
                cmbHospitalName.addItem(hospital.getHospital());
            }

        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadSpecialities() {

        try {
            List<SpecialityDTO> allSpecialitcialitys = SpecialityController.getSpecialitys();
            cmbSpeciality.removeAllItems();
            if (allSpecialitcialitys == null) {
                return;
            }

            for (SpecialityDTO specialitciality : allSpecialitcialitys) {
                cmbSpeciality.addItem(specialitciality.getSpeciality());
                System.out.println("12321214312412412");
            }

        } catch (Exception ex) {
            Logger.getLogger(PnlAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
