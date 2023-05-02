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
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paID;
    private int appointmentID;
    private String pDate;
    private String pTime;
    private double amount;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(
            @JoinColumn(name = "appointmentID", referencedColumnName = "appointmentID", insertable = false, updatable = false))
    private Appointment appointment;

    public Payment() {
    }

    public Payment(int paID, int appointmentID, String pDate, String pTime, double amount, Appointment appointment) {
        this.paID = paID;
        this.appointmentID = appointmentID;
        this.pDate = pDate;
        this.pTime = pTime;
        this.amount = amount;
        this.appointment = appointment;
    }
    public Payment(int appointmentID, String pDate, String pTime, double amount, Appointment appointment) {
        this.appointmentID = appointmentID;
        this.pDate = pDate;
        this.pTime = pTime;
        this.amount = amount;
        this.appointment = appointment;
    }
    public Payment(int appointmentID, double amount) {
        this.appointmentID = appointmentID;
        this.amount = amount;
    }

    /**
     * @return the paID
     */
    public int getPaID() {
        return paID;
    }

    /**
     * @param paID the paID to set
     */
    public void setPaID(int paID) {
        this.paID = paID;
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
     * @return the pDate
     */
    public String getpDate() {
        return pDate;
    }

    /**
     * @param pDate the pDate to set
     */
    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    /**
     * @return the pTime
     */
    public String getpTime() {
        return pTime;
    }

    /**
     * @param pTime the pTime to set
     */
    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
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
        return "Payment{" + "paID=" + paID + ", appointmentID=" + appointmentID + ", pDate=" + pDate + ", pTime=" + pTime + ", amount=" + amount + ", appointment=" + appointment + '}';
    }

    
}
