/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author DEll
 */
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pID;
    private String pName;
    private String pAddress;
    private String pContact;
    private String age;
    private String gender;
    
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Appointment> appointmentList;

    public Patient() {
    }

    public Patient(int pID, String pName, String pAddress, String pContact, String age, String gender) {
        this.pID = pID;
        this.pName = pName;
        this.pAddress = pAddress;
        this.pContact = pContact;
        this.age = age;
        this.gender = gender;
    }
    public Patient(String pName, String pAddress, String pContact, String age, String gender) {
        this.pName = pName;
        this.pAddress = pAddress;
        this.pContact = pContact;
        this.age = age;
        this.gender = gender;
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
     * @return the pAddress
     */
    public String getpAddress() {
        return pAddress;
    }

    /**
     * @param pAddress the pAddress to set
     */
    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    /**
     * @return the pContact
     */
    public String getpContact() {
        return pContact;
    }

    /**
     * @param pContact the pContact to set
     */
    public void setpContact(String pContact) {
        this.pContact = pContact;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{" + "pID=" + pID + ", pName=" + pName + ", pAddress=" + pAddress + ", pContact=" + pContact + ", age=" + age + ", gender=" + gender + '}';
    }

    
   
}
    
    
    
    
    
    
    