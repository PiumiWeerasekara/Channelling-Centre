/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface HospitalService extends SuperService{
    public boolean addHospital(HospitalDTO hospitalDTO)throws Exception;
    public boolean updateHospital(HospitalDTO hospitalDTO)throws Exception;
    public boolean deleteHospital(String hospitalID)throws Exception;
    public List<HospitalDTO> getAllHospitals()throws Exception;
    public HospitalDTO search(String hospital)throws Exception;
}
