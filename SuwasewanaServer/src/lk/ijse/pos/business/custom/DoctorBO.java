/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.DoctorDTO;

/**
 *
 * @author DEll
 */
public interface DoctorBO extends SuperBO{
    public boolean addDoctor(DoctorDTO doctorDTO)throws Exception;
    public boolean updateDoctor(DoctorDTO doctorDTO)throws Exception;
    public boolean deleteDoctor(String id)throws Exception;
    public List<DoctorDTO> getAllDoctors()throws Exception;
    public DoctorDTO findByName(String name)throws Exception;
}
