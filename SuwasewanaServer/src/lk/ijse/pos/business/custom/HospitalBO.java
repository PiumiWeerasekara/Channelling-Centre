/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.HospitalDTO;

/**
 *
 * @author DEll
 */
public interface HospitalBO extends SuperBO{
    public boolean addHospital(HospitalDTO hospitalDTO)throws Exception;
    public List<HospitalDTO> getAllHospitals()throws Exception;
    public HospitalDTO search(String hospital)throws Exception;
    
}
