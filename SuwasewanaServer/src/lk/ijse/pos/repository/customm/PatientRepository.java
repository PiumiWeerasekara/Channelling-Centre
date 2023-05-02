/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.entity.Patient;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface PatientRepository extends SuperRepository<Patient, String> {

    public Patient findByPatient(String name) throws Exception;

    public List<Patient> searPatientName(String name) throws Exception;

    }
