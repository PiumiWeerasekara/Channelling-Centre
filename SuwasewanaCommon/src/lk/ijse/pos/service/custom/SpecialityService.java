/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.sql.SQLSyntaxErrorException;
import java.util.List;
import lk.ijse.pos.dto.SpecialityDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface SpecialityService extends SuperService{
    public boolean addSpeciality(SpecialityDTO specialityDTO)throws Exception;
    public boolean updateSpeciality(SpecialityDTO specialityDTO)throws Exception;
    public boolean deleteSpeciality(String specialityID)throws Exception;
    public List<SpecialityDTO> getAllSpciality()throws Exception;
    public SpecialityDTO searchBySpeciality(String speciality)throws Exception;
    //ublic boolean getSpeciality(String speciality) throws Exception;
    

    
}
