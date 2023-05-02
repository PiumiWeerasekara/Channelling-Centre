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
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  hID;
    private String hospital;
    
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Doctor> doctorList;

    public Hospital() {
    }

    public Hospital(int hID, String hospital) {
        this.hID = hID;
        this.hospital = hospital;
    }
    public Hospital(String hospital) {
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
        return "Hospital{" + "hID=" + hID + ", hospital=" + hospital + '}';
    }

    
}

   