/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dto;

/**
 *
 * @author DEll
 */
public class AppointmentDTO extends SuperDTO{
    private int appointmentID;
    private int pID;
    private int rID;
    private int dID;
    private String appDate;
    private String appTime;
    private String appNO;
    private String pName;
    private String dName;


    public AppointmentDTO() {
    }

    public AppointmentDTO(int appointmentID, int pID, int rID, int dID, String appDate, String appTime, String appNO, String pName, String dName) {
        this.appointmentID = appointmentID;
        this.pID = pID;
        this.rID = rID;
        this.dID = dID;
        this.appDate = appDate;
        this.appTime = appTime;
        this.appNO = appNO;
        this.pName = pName;
        this.dName = dName;
    }
    public AppointmentDTO(int pID, int rID, int dID, String appDate, String appTime, String appNO, String pName, String dName) {
        this.pID = pID;
        this.rID = rID;
        this.dID = dID;
        this.appDate = appDate;
        this.appTime = appTime;
        this.appNO = appNO;
        this.pName = pName;
        this.dName = dName;
    }
    public AppointmentDTO(int appointmentID, String appDate, String appTime, String appNO) {
        this.appointmentID = appointmentID;
        this.appDate = appDate;
        this.appTime = appTime;
        this.appNO = appNO;
    }
    public AppointmentDTO(int appointmentID,String appDate,String dName) {
        this.appointmentID = appointmentID;
        this.appDate = appDate;
        this.dName = dName;
    }
    public AppointmentDTO( String appDate, String appTime, String appNO) {
        this.appDate = appDate;
        this.appTime = appTime;
        this.appNO = appNO;
    }
    public AppointmentDTO(int appointmentID, int pID, int rID, int dID, String appDate, String appTime, String appNO) {
        this.appointmentID = appointmentID;
        this.pID = pID;
        this.rID = rID;
        this.dID = dID;
        this.appDate = appDate;
        this.appTime = appTime;
        this.appNO = appNO;
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
     * @return the pID
     */
    public int getpID() {
        return pID;
    }

    /**
     * @param pID the pID to set
     */
    public void setpID(int pID) {
        this.pID = pID;
    }

    /**
     * @return the rID
     */
    public int getrID() {
        return rID;
    }

    /**
     * @param rID the rID to set
     */
    public void setrID(int rID) {
        this.rID = rID;
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
     * @return the appDate
     */
    public String getAppDate() {
        return appDate;
    }

    /**
     * @param appDate the appDate to set
     */
    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    /**
     * @return the appTime
     */
    public String getAppTime() {
        return appTime;
    }

    /**
     * @param appTime the appTime to set
     */
    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    /**
     * @return the appNO
     */
    public String getAppNO() {
        return appNO;
    }

    /**
     * @param appNO the appNO to set
     */
    public void setAppNO(String appNO) {
        this.appNO = appNO;
    }

    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
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

    @Override
    public String toString() {
        return "AppointmentDTO{" + "appointmentID=" + appointmentID + ", pID=" + pID + ", rID=" + rID + ", dID=" + dID + ", appDate=" + appDate + ", appTime=" + appTime + ", appNO=" + appNO + ", pName=" + pName + ", dName=" + dName + '}';
    }

    
}
