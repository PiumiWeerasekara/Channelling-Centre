/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.PatientBO;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.entity.Patient;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.PatientRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class PatientBOImpl implements PatientBO {

    private PatientRepository patientRepository;

    public PatientBOImpl() {
        this.patientRepository = (PatientRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.PATIENT);
    }

    @Override
    public boolean addPatient(PatientDTO patientDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            patientRepository.setSession(session);
            Patient p = new Patient(patientDTO.getpName(),
                    patientDTO.getpAddress(),
                    patientDTO.getpContact(),
                    patientDTO.getAge(),
                    patientDTO.getGender());
            boolean result = patientRepository.save(p);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePatient(PatientDTO patientDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            patientRepository.setSession(session);
            session.beginTransaction();
            Patient P = new Patient(patientDTO.getpID(),
                    patientDTO.getpName(),
                    patientDTO.getpAddress(),
                    patientDTO.getpContact(),
                    patientDTO.getAge(),
                    patientDTO.getGender());
            patientRepository.update(P);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePatient(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PatientDTO> getAllPatients() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            patientRepository.setSession(session);
            session.beginTransaction();
            List<Patient> patients = patientRepository.findAll();
            session.getTransaction().commit();
            if (patients != null) {
                List<PatientDTO> alPatients = new ArrayList<>();

                for (Patient patient : patients) {
                    PatientDTO dto = new PatientDTO(patient.getpID(),
                            patient.getpName(),
                            patient.getpAddress(),
                            patient.getpContact(),
                            patient.getAge(),
                            patient.getGender());
                    alPatients.add(dto);
                }
                return alPatients;
            } else {
                return null;
            }

        }

    }

    @Override
    public PatientDTO findByName(String name) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            patientRepository.setSession(session);
            session.beginTransaction();
            Patient p = patientRepository.findByPatient(name);
            session.getTransaction().commit();
            if (p != null) {
                PatientDTO patientDTO = new PatientDTO();
                patientDTO.setpID(p.getpID());
                patientDTO.setpName(p.getpName());
                patientDTO.setpAddress(p.getpAddress());
                patientDTO.setpContact(p.getpContact());
                patientDTO.setAge(p.getAge());
                patientDTO.setGender(p.getGender());
                return patientDTO;
            } else {
                return null;
            }
        }
    }

    @Override
    public List<PatientDTO> searPatientName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//    @Override
//    public String searPatientUseName(String name) throws Exception {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            patientRepository.setSession(session);
//            session.beginTransaction();
//            String p = patientRepository.searPatientUseName(name);
//            session.getTransaction().commit();
//            if (p != null) {
//                PatientDTO patientDTO = new PatientDTO();
//                patientDTO.setpID(p.getpID());
//
//            } else {
//                return null;
//            }
//        }
//        return null;
//    }