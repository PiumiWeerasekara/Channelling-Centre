/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.HospitalBO;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.entity.Hospital;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.HospitalRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class HospitalBOImpl implements HospitalBO {

    private HospitalRepository hospitalRepository;

    public HospitalBOImpl() {
        this.hospitalRepository = (HospitalRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.HOSPITAL);
    }

    @Override
    public boolean addHospital(HospitalDTO hospitalDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            hospitalRepository.setSession(session);
            Hospital s = new Hospital(hospitalDTO.getHospital());
            boolean result = hospitalRepository.save(s);
            session.getTransaction().commit();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<HospitalDTO> getAllHospitals() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            hospitalRepository.setSession(session);
            session.beginTransaction();
            List<Hospital> hospitals = hospitalRepository.findAll();
            session.getTransaction().commit();
            if (hospitals != null) {
                List<HospitalDTO> alHospitals = new ArrayList<>();
                for (Hospital hospital : hospitals) {
                    HospitalDTO dto = new HospitalDTO(hospital.getHospital());
                    alHospitals.add(dto);
                }
                return alHospitals;
            } else {
                return null;
            }
        }
    }

    @Override
    public HospitalDTO search(String hospital) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            hospitalRepository.setSession(session);
            session.beginTransaction();
            Hospital h = hospitalRepository.finByHospital(hospital);
            session.getTransaction().commit();
            if (h != null) {
                HospitalDTO hospitalDTO = new HospitalDTO();
                hospitalDTO.sethID(h.gethID());
                hospitalDTO.setHospital(h.getHospital());
                System.out.println("hospital BO");
                return hospitalDTO;
            }else{
                return null;
            }
        }
/*
        
        */
    }
}
