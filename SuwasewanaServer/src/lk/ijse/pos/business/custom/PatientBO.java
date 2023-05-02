/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.entity.Patient;

/**
 *
 * @author DEll
 */
public interface PatientBO extends SuperBO{
    public boolean addPatient(PatientDTO patientDTO)throws Exception;
        public boolean updatePatient(PatientDTO patientDTO)throws Exception;
        public boolean deletePatient(String id)throws Exception;
        public List<PatientDTO> getAllPatients()throws Exception;
        public PatientDTO findByName(String name)throws Exception;
        public List<PatientDTO> searPatientName(String name) throws Exception;
}
