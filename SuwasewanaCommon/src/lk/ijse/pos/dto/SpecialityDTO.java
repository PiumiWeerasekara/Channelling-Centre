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
public class SpecialityDTO extends SuperDTO {

    private int SpecialityID;
    private String Speciality;

    public SpecialityDTO() {
    }

    public SpecialityDTO(int SpecialityID, String Speciality) {
        this.SpecialityID = SpecialityID;
        this.Speciality = Speciality;
    }
    public SpecialityDTO(String Speciality) {
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
        return "SpecialityDTO{" + "SpecialityID=" + SpecialityID + ", Speciality=" + Speciality + '}';
    }

   
}
