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
public class DoctorDTO extends SuperDTO {

    private int dID;
    private String dName;
    private int specialityID;
    private int hID;
    private String dRNo;
    private String dAddress;
    private String dNIC;
    private String dContact;
    private String hospital;
    private String spetiality;
    private String patientsPerDay;

    public DoctorDTO() {
    }

    public DoctorDTO(int dID, String dName, int specialityID, int hID, String dRNo, String dAddress, String dNIC, String dContact, String hospital, String spetiality, String patientsPerDay) {
        this.dID = dID;
        this.dName = dName;
        this.specialityID = specialityID;
        this.hID = hID;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
        this.hospital = hospital;
        this.spetiality = spetiality;
        this.patientsPerDay = patientsPerDay;
    }

    public DoctorDTO(String dName, int specialityID, int hID, String dRNo, String dAddress, String dNIC, String dContact, String hospital, String spetiality, String patientsPerDay) {
        this.dName = dName;
        this.specialityID = specialityID;
        this.hID = hID;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
        this.hospital = hospital;
        this.spetiality = spetiality;
        this.patientsPerDay = patientsPerDay;
    }
    public DoctorDTO(int dID, String dName, int specialityID, int hID, String dRNo, String dAddress, String dNIC, String dContact, String hospital, String spetiality) {
        this.dID = dID;
        this.dName = dName;
        this.specialityID = specialityID;
        this.hID = hID;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
        this.hospital = hospital;
        this.spetiality = spetiality;
    }
    public DoctorDTO(String dName, int specialityID, int hID, String dRNo, String dAddress, String dNIC, String dContact, String hospital, String spetiality) {
        this.dName = dName;
        this.specialityID = specialityID;
        this.hID = hID;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
        this.hospital = hospital;
        this.spetiality = spetiality;
        
    }

    public DoctorDTO(String dName, int specialityID, int hID, String dRNo, String dAddress, String dNIC, String dContact) {
        this.dName = dName;
        this.specialityID = specialityID;
        this.hID = hID;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
    }

    public DoctorDTO(int dID, String dName, String dRNo, String dAddress, String dNIC, String dContact, String hospital, String spetiality) {
        this.dID = dID;
        this.dName = dName;
        this.dRNo = dRNo;
        this.dAddress = dAddress;
        this.dNIC = dNIC;
        this.dContact = dContact;
        this.hospital = hospital;
        this.spetiality = spetiality;
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
     * @return the specialityID
     */
    public int getSpecialityID() {
        return specialityID;
    }

    /**
     * @param specialityID the specialityID to set
     */
    public void setSpecialityID(int specialityID) {
        this.specialityID = specialityID;
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
     * @return the dRNo
     */
    public String getdRNo() {
        return dRNo;
    }

    /**
     * @param dRNo the dRNo to set
     */
    public void setdRNo(String dRNo) {
        this.dRNo = dRNo;
    }

    /**
     * @return the dAddress
     */
    public String getdAddress() {
        return dAddress;
    }

    /**
     * @param dAddress the dAddress to set
     */
    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    /**
     * @return the dNIC
     */
    public String getdNIC() {
        return dNIC;
    }

    /**
     * @param dNIC the dNIC to set
     */
    public void setdNIC(String dNIC) {
        this.dNIC = dNIC;
    }

    /**
     * @return the dContact
     */
    public String getdContact() {
        return dContact;
    }

    /**
     * @param dContact the dContact to set
     */
    public void setdContact(String dContact) {
        this.dContact = dContact;
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

    /**
     * @return the spetiality
     */
    public String getSpetiality() {
        return spetiality;
    }

    /**
     * @param spetiality the spetiality to set
     */
    public void setSpetiality(String spetiality) {
        this.spetiality = spetiality;
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

    @Override
    public String toString() {
        return "DoctorDTO{" + "dID=" + dID + ", dName=" + dName + ", specialityID=" + specialityID + ", hID=" + hID + ", dRNo=" + dRNo + ", dAddress=" + dAddress + ", dNIC=" + dNIC + ", dContact=" + dContact + ", hospital=" + hospital + ", spetiality=" + spetiality + ", patientsPerDay=" + patientsPerDay + '}';
    }

    
}
