/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface DoctorService extends SuperService{
    public boolean addDoctor(DoctorDTO doctorDTO)throws Exception;
    public boolean updateDoctor(DoctorDTO doctorDTO)throws Exception;
    public boolean deleteDoctor(String doctorID)throws Exception;
    public List<DoctorDTO> getAllDoctors()throws Exception;
    public DoctorDTO findByName(String name)throws Exception;
    
}
