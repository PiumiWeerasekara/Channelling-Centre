/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.entity.Patient;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.PatientRepository;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class PatientRepositoryImpl extends SuperRepositoryImpl<Patient, String> implements PatientRepository {

    public PatientRepositoryImpl() {
    }

    @Override
    public Patient findByPatient(String name) throws Exception {
        Query query = session.createQuery("from Patient where pName='" + name + "' ");
        List<Patient> patients = query.list();
        Patient p = new Patient();
        for (Patient patient : patients) {
            p = patient;
        }
        return p;

    }

    @Override
    public List<Patient> searPatientName(String name) throws Exception {
        Query query = session.createQuery("pID from Patient where pName='" + name + "' ");
        List<Patient> patients = query.list();
        return patients;
        
    }

}
