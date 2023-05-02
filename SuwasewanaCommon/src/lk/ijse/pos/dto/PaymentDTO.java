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
public class PaymentDTO extends SuperDTO{
    private int paID;
    private int aappointmentID;
    private String date;
    private String time;
    private double amount;

    public PaymentDTO() {
    }

    public PaymentDTO(int paID, int aappointmentID, String date, String time, double amount) {
        this.paID = paID;
        this.aappointmentID = aappointmentID;
        this.date = date;
        this.time = time;
        this.amount = amount;
    }
    public PaymentDTO(int aappointmentID, String date, String time, double amount) {
        this.aappointmentID = aappointmentID;
        this.date = date;
        this.time = time;
        this.amount = amount;
    }
    public PaymentDTO(int aappointmentID, double amount) {
        this.aappointmentID = aappointmentID;
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
     * @return the aappointmentID
     */
    public int getAappointmentID() {
        return aappointmentID;
    }

    /**
     * @param aappointmentID the aappointmentID to set
     */
    public void setAappointmentID(int aappointmentID) {
        this.aappointmentID = aappointmentID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
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

    @Override
    public String toString() {
        return "PaymentDTO{" + "paID=" + paID + ", aappointmentID=" + aappointmentID + ", date=" + date + ", time=" + time + ", amount=" + amount + '}';
    }
    

   
  
}
