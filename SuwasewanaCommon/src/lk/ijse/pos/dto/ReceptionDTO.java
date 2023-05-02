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
public class ReceptionDTO extends SuperDTO{
    private int rID;
    private String rName;
    private String address;
    private String contact;
    private String rPassword;

    public ReceptionDTO() {
    }

    public ReceptionDTO(int rID, String rName, String address, String contact, String rPassword) {
        this.rID = rID;
        this.rName = rName;
        this.address = address;
        this.contact = contact;
        this.rPassword = rPassword;
    }
    public ReceptionDTO(String rName, String address, String contact, String rPassword) {
        this.rName = rName;
        this.address = address;
        this.contact = contact;
        this.rPassword = rPassword;
    }
    public ReceptionDTO(String rName,String rPassword) {
        this.rName = rName;
        this.rPassword = rPassword;
    }
    public ReceptionDTO(int rID,String address, String contact, String rPassword) {
        this.rID = rID;
        this.address = address;
        this.contact = contact;
        this.rPassword = rPassword;
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
     * @return the rName
     */
    public String getrName() {
        return rName;
    }

    /**
     * @param rName the rName to set
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the rPassword
     */
    public String getrPassword() {
        return rPassword;
    }

    /**
     * @param rPassword the rPassword to set
     */
    public void setrPassword(String rPassword) {
        this.rPassword = rPassword;
    }

    @Override
    public String toString() {
        return "ReceptionDTO{" + "rID=" + rID + ", rName=" + rName + ", address=" + address + ", contact=" + contact + ", rPassword=" + rPassword + '}';
    }

    
}
