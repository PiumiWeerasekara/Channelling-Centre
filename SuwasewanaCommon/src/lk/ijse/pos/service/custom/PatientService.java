/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface PatientService extends SuperService{
    public boolean addPatient(PatientDTO patientDTO)throws Exception;
    public boolean updatePatient(PatientDTO patientDTO)throws Exception;
    public boolean deletePatient(String patientID)throws Exception;
    public List<PatientDTO> getAllPatients()throws Exception;
    public PatientDTO searchByName(String name)throws Exception;
    
}
