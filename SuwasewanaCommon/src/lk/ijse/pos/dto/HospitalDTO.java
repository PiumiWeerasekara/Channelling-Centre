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
public class HospitalDTO extends SuperDTO{
    private int hID;
    private String hospital;

    public HospitalDTO() {
    }

    public HospitalDTO(int hID, String hospital) {
        this.hID = hID;
        this.hospital = hospital;
    }
    public HospitalDTO(String hospital) {
        this.hospital = hospital;
    }

    /**
     * @return the hID
     */
    public int gethID() {
        return hID;
    }

    /**
     * @param hID the hID to set
     */
    public void sethID(int hID) {
        this.hID = hID;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" + "hID=" + hID + ", hospital=" + hospital + '}';
    }
    
    
}
