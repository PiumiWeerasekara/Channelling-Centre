/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DEll
 */
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adID;
    private String name;
    private String password;

    public Admin() {
    }

    public Admin(int adID, String name, String password) {
        this.adID = adID;
        this.name = name;
        this.password = password;
    }

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * @return the adID
     */
    public int getAdID() {
        return adID;
    }

    /**
     * @param adID the adID to set
     */
    public void setAdID(int adID) {
        this.adID = adID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "adID=" + adID + ", name=" + name + ", password=" + password + '}';
    }

    /**
     * @return the adID
     */
    
}
