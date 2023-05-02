/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.sql.SQLSyntaxErrorException;
import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.SpecialityDTO;

/**
 *
 * @author DEll
 */
public interface SpecialityBO extends SuperBO{
    public boolean addSpeciality(SpecialityDTO specialityDTO)throws Exception;
    public List<SpecialityDTO> getAllSpeciality()throws Exception;
    public SpecialityDTO searchBySpeciality(String speciality)throws RemoteException, Exception,SQLSyntaxErrorException,UnmarshalException;
   // public SpecialityDTO search(String speciality)throws Exception;
//    public boolean getSpeciality(String speciality) throws Exception;
    //    public MovieDTO SearcById(String Id)throws Exception;

}
