/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.SpecialityBO;
import lk.ijse.pos.dto.SpecialityDTO;
import lk.ijse.pos.entity.Speciality;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.SpecialityRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class SpecialityBOImpl implements SpecialityBO {

    private SpecialityRepository specialityRepository;

    public SpecialityBOImpl() {
        this.specialityRepository = (SpecialityRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.SPECIALITY);
    }

    @Override
    public boolean addSpeciality(SpecialityDTO specialityDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            specialityRepository.setSession(session);
            Speciality s = new Speciality(specialityDTO.getSpeciality());
            boolean result = specialityRepository.save(s);
            session.getTransaction().commit();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<SpecialityDTO> getAllSpeciality() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            specialityRepository.setSession(session);
            session.beginTransaction();
            List<Speciality> specialitys = specialityRepository.findAll();
            session.getTransaction().commit();
            if (specialitys != null) {
                List<SpecialityDTO> alSpecialitys = new ArrayList<>();
                for (Speciality speciality : specialitys) {
                    SpecialityDTO dto = new SpecialityDTO(speciality.getSpecialityID(),
                            speciality.getSpeciality());
                    alSpecialitys.add(dto);
                    System.out.print("SBO");
                }
                return alSpecialitys;
            } else {
                return null;
            }
        }
    }

//    @Override
//    public boolean getSpeciality(String speciality) throws Exception {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            
//            specialityRepository.setSession(session);
//            session.beginTransaction();
//            
//            Speciality s = new  Speciality(speciality);
//            
//            boolean result = specialityRepository.getSpeciality(speciality);
//            
//            session.getTransaction().commit();
//            
//            return result;
//            
//        }
//    }
    @Override
    public SpecialityDTO searchBySpeciality(String speciality)throws Exception{
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            specialityRepository.setSession(session);
            session.beginTransaction();
            Speciality s = specialityRepository.findByName(speciality);
            session.getTransaction().commit();
            if (s != null) {
                SpecialityDTO specialityDTO = new SpecialityDTO();
                specialityDTO.setSpecialityID(s.getSpecialityID());
                specialityDTO.setSpeciality(s.getSpeciality());
                return specialityDTO;

            } else {
                return null;
            }
        }

    }
}
