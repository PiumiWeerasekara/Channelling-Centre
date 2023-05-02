/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.DoctorBO;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.entity.Doctor;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.DoctorRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class DoctorBOImpl implements DoctorBO {

    private DoctorRepository doctorRepository;

    public DoctorBOImpl() {
        this.doctorRepository = (DoctorRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.DOCTOR);
    }

    @Override
    public boolean addDoctor(DoctorDTO doctorDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            doctorRepository.setSession(session);
            Doctor d = new Doctor(doctorDTO.getdName(),
                    doctorDTO.getSpecialityID(),
                    doctorDTO.gethID(),
                    doctorDTO.getdRNo(),
                    doctorDTO.getdAddress(),
                    doctorDTO.getdNIC(),
                    doctorDTO.getdContact(),
                    doctorDTO.getHospital(),
                    doctorDTO.getSpetiality());
            boolean result = doctorRepository.save(d);
            session.getTransaction().commit();
            System.out.println("BO");
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updateDoctor(DoctorDTO doctorDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            doctorRepository.setSession(session);
            session.beginTransaction();
            Doctor d = new Doctor(doctorDTO.getdID(),
                    doctorDTO.getdName(),
                    doctorDTO.getSpecialityID(),
                    doctorDTO.gethID(),
                    doctorDTO.getdRNo(),
                    doctorDTO.getdAddress(),
                    doctorDTO.getdNIC(),
                    doctorDTO.getdContact(),
            doctorDTO.getHospital(),
            doctorDTO.getSpetiality());
            doctorRepository.update(d);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean deleteDoctor(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            doctorRepository.setSession(session);
            session.beginTransaction();
            Doctor doctor = doctorRepository.findByName(id);
            if (doctor != null) {
                doctorRepository.delete(doctor);
                session.getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public List<DoctorDTO> getAllDoctors() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            doctorRepository.setSession(session);
            session.beginTransaction();
            System.out.println("1dddd");
            List<Doctor> doctors = doctorRepository.findAll();
            System.out.println("aa");
            session.getTransaction().commit();
            if (doctors != null) {
                System.out.println("bb");
                List<DoctorDTO> alDoctors = new ArrayList<>();
                
                System.out.println("2ddddd");
                for (Doctor doctor : doctors) {
                    DoctorDTO dto = new DoctorDTO(doctor.getdID(),
                            doctor.getdName(),
                            doctor.getSpecialityID(),
                            doctor.gethID(),
                            doctor.getdRNo(),
                            doctor.getdAddress(),
                            doctor.getdNIC(),
                            doctor.getdContact(),
                            doctor.getHospital(),
                            doctor.getSpetiality());
                    System.out.println("3ddddd");
                    alDoctors.add(dto);
                }
                return alDoctors;
            } else {
                return null;
            }

        }

    }

    @Override
    public DoctorDTO findByName(String name) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()) {
            doctorRepository.setSession(session);
            session.beginTransaction();
            Doctor d=doctorRepository.findByName(name);
            session.getTransaction().commit();
            if (d!=null) {
                DoctorDTO doctorDTO=new DoctorDTO();
                doctorDTO.setdID(d.getdID());
                doctorDTO.setdName(d.getdName());
                doctorDTO.setSpecialityID(d.getSpecialityID());
                doctorDTO.sethID(d.gethID());
                doctorDTO.setdRNo(d.getdRNo());
                doctorDTO.setdAddress(d.getdAddress());
                doctorDTO.setdNIC(d.getdNIC());
                doctorDTO.setdContact(d.getdContact());
                doctorDTO.setHospital(d.getHospital());
                doctorDTO.setSpetiality(d.getSpetiality());
                return doctorDTO;
            }else{
                return null;
            }
        }
    }
}
