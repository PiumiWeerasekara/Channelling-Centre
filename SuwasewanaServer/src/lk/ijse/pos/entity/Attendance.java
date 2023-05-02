/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author DEll
 */
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int atID;
    private int appointmentID;
    
    private String doctorName;
    private String patientName;
    private String appointmentNo;
    private String atDate;
    private String atTime;
    private String attendance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(
            @JoinColumn(name = "appointmentID", referencedColumnName = "appointmentID", insertable = false, updatable = false))
    private Appointment appointment;

    public Attendance() {
    }

    public Attendance(int atID, int appointmentID, String doctorName, String patientName, String appointmentNo, String atDate, String atTime, String attendance, Appointment appointment) {
        this.atID = atID;
        this.appointmentID = appointmentID;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.appointmentNo = appointmentNo;
        this.atDate = atDate;
        this.atTime = atTime;
        this.attendance = attendance;
        this.appointment = appointment;
    }
    public Attendance(int appointmentID, String doctorName, String patientName, String appointmentNo, String atDate, String atTime, String attendance, Appointment appointment) {
        this.appointmentID = appointmentID;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.appointmentNo = appointmentNo;
        this.atDate = atDate;
        this.atTime = atTime;
        this.attendance = attendance;
        this.appointment = appointment;
    }
    public Attendance(int appointmentID, String doctorName, String patientName, String appointmentNo, String atDate, String atTime, String attendance) {
        this.appointmentID = appointmentID;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.appointmentNo = appointmentNo;
        this.atDate = atDate;
        this.atTime = atTime;
        this.attendance = attendance;
    }

    /**
     * @return the atID
     */
    public int getAtID() {
        return atID;
    }

    /**
     * @param atID the atID to set
     */
    public void setAtID(int atID) {
        this.atID = atID;
    }

    /**
     * @return the appointmentID
     */
    public int getAppointmentID() {
        return appointmentID;
    }

    /**
     * @param appointmentID the appointmentID to set
     */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**
     * @return the doctorName
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName the doctorName to set
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the appointmentNo
     */
    public String getAppointmentNo() {
        return appointmentNo;
    }

    /**
     * @param appointmentNo the appointmentNo to set
     */
    public void setAppointmentNo(String appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    /**
     * @return the atDate
     */
    public String getAtDate() {
        return atDate;
    }

    /**
     * @param atDate the atDate to set
     */
    public void setAtDate(String atDate) {
        this.atDate = atDate;
    }

    /**
     * @return the atTime
     */
    public String getAtTime() {
        return atTime;
    }

    /**
     * @param atTime the atTime to set
     */
    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * @return the attendance
     */
    public String getAttendance() {
        return attendance;
    }

    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    /**
     * @return the appointment
     */
    public Appointment getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Attendance{" + "atID=" + atID + ", appointmentID=" + appointmentID + ", doctorName=" + doctorName + ", patientName=" + patientName + ", appointmentNo=" + appointmentNo + ", atDate=" + atDate + ", atTime=" + atTime + ", attendance=" + attendance + ", appointment=" + appointment + '}';
    }

    
}
