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

/**
 *
 * @author DEll
 */
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sheduleID;
    private int dID;
    private String dName;
    private String day;
    private String timePeriod;
    private String patientsPerDay;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "dID", referencedColumnName = "dID", insertable = false,updatable = false))
    private Doctor doctor;

    public Schedule() {
    }

    public Schedule(int sheduleID, int dID, String dName, String day, String timePeriod, String patientsPerDay, Doctor doctor) {
        this.sheduleID = sheduleID;
        this.dID = dID;
        this.dName = dName;
        this.day = day;
        this.timePeriod = timePeriod;
        this.patientsPerDay = patientsPerDay;
        this.doctor = doctor;
    }
    public Schedule(int dID, String dName, String day, String timePeriod, String patientsPerDay, Doctor doctor) {
        this.dID = dID;
        this.dName = dName;
        this.day = day;
        this.timePeriod = timePeriod;
        this.patientsPerDay = patientsPerDay;
        this.doctor = doctor;
    }
    public Schedule(int dID, String dName, String day, String timePeriod, String patientsPerDay) {
        this.dID = dID;
        this.dName = dName;
        this.day = day;
        this.timePeriod = timePeriod;
        this.patientsPerDay = patientsPerDay;
    }
    public Schedule(int sheduleID, int dID, String dName, String day, String timePeriod, String patientsPerDay) {
        this.sheduleID = sheduleID;
        this.dID = dID;
        this.dName = dName;
        this.day = day;
        this.timePeriod = timePeriod;
        this.patientsPerDay = patientsPerDay;
    }

    /**
     * @return the sheduleID
     */
    public int getSheduleID() {
        return sheduleID;
    }

    /**
     * @param sheduleID the sheduleID to set
     */
    public void setSheduleID(int sheduleID) {
        this.sheduleID = sheduleID;
    }

    /**
     * @return the dID
     */
    public int getdID() {
        return dID;
    }

    /**
     * @param dID the dID to set
     */
    public void setdID(int dID) {
        this.dID = dID;
    }

    /**
     * @return the dName
     */
    public String getdName() {
        return dName;
    }

    /**
     * @param dName the dName to set
     */
    public void setdName(String dName) {
        this.dName = dName;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the timePeriod
     */
    public String getTimePeriod() {
        return timePeriod;
    }

    /**
     * @param timePeriod the timePeriod to set
     */
    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return the patientsPerDay
     */
    public String getPatientsPerDay() {
        return patientsPerDay;
    }

    /**
     * @param patientsPerDay the patientsPerDay to set
     */
    public void setPatientsPerDay(String patientsPerDay) {
        this.patientsPerDay = patientsPerDay;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Schedule{" + "sheduleID=" + sheduleID + ", dID=" + dID + ", dName=" + dName + ", day=" + day + ", timePeriod=" + timePeriod + ", patientsPerDay=" + patientsPerDay + ", doctor=" + doctor + '}';
    }
    

    
}

    