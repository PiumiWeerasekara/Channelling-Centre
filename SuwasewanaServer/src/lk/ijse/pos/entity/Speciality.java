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
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SpecialityID;
    private String Speciality;
    
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Doctor> doctorList;

    public Speciality() {
    }

    public Speciality(int SpecialityID, String Speciality) {
        this.SpecialityID = SpecialityID;
        this.Speciality = Speciality;
    }
    
    public Speciality(String Speciality) {
        this.Speciality = Speciality;
    }

    /**
     * @return the SpecialityID
     */
    public int getSpecialityID() {
        return SpecialityID;
    }

    /**
     * @param SpecialityID the SpecialityID to set
     */
    public void setSpecialityID(int SpecialityID) {
        this.SpecialityID = SpecialityID;
    }

    /**
     * @return the Speciality
     */
    public String getSpeciality() {
        return Speciality;
    }

    /**
     * @param Speciality the Speciality to set
     */
    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    @Override
    public String toString() {
        return "Speciality{" + "SpecialityID=" + SpecialityID + ", Speciality=" + Speciality + '}';
    }

    
}