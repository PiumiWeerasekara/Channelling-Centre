/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.AppointmentBO;
import lk.ijse.pos.dto.AppointmentDTO;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.dto.ReceptionDTO;
import lk.ijse.pos.dto.SpecialityDTO;
import lk.ijse.pos.entity.Appointment;
import lk.ijse.pos.entity.Patient;
import lk.ijse.pos.entity.Reception;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.AppointmentRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class AppointmentBOImpl implements AppointmentBO {

    private AppointmentRepository appointmentRepository;

    public AppointmentBOImpl() {
        this.appointmentRepository = (AppointmentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.APPOINTMENT);
    }

    @Override
    public boolean addAppointment(AppointmentDTO appointmentDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            appointmentRepository.setSession(session);
            Appointment a = new Appointment(appointmentDTO.getpID(),
                    appointmentDTO.getrID(),
                    appointmentDTO.getdID(),
                    appointmentDTO.getAppDate(),
                    appointmentDTO.getAppTime(),
                    appointmentDTO.getAppNO(),
                    appointmentDTO.getpName(),
                    appointmentDTO.getdName());
            boolean result = appointmentRepository.save(a);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateAppointment(AppointmentDTO appointmentDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            appointmentRepository.setSession(session);
            session.beginTransaction();
            Appointment a = new Appointment(
                    appointmentDTO.getAppointmentID(),
                    appointmentDTO.getpID(),
                    appointmentDTO.getrID(),
                    appointmentDTO.getdID(),
                    appointmentDTO.getAppDate(),
                    appointmentDTO.getAppTime(),
                    appointmentDTO.getAppNO(),
                    appointmentDTO.getpName(),
                    appointmentDTO.getdName());
            appointmentRepository.update(a);
            System.out.println("bo");
            session.getTransaction().commit();
            System.out.println("bo2");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean deleteAppointment(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AppointmentDTO> getAllAppointments() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            appointmentRepository.setSession(session);
            session.beginTransaction();
            List<Appointment> appointments = appointmentRepository.findAll();
            session.getTransaction().commit();
            if (appointments != null) {
                List<AppointmentDTO> alAppointments = new ArrayList<>();
                for (Appointment appointment : appointments) {
                    AppointmentDTO appointmentDTO = new AppointmentDTO(appointment.getAppointmentID(),
                            appointment.getpID(),
                            appointment.getrID(),
                            appointment.getdID(),
                            appointment.getAppDate(),
                            appointment.getAppTime(),
                            appointment.getAppNO(),
                            appointment.getpName(),
                            appointment.getdName());
                    alAppointments.add(appointmentDTO);
                    System.out.println("RBo");
                }
                return alAppointments;
            } else {
                return null;
            }
        }

    }

    @Override
    public List<AppointmentDTO> searchAppointments(String doctorName, String date) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            appointmentRepository.setSession(session);
            session.beginTransaction();
            List<Appointment> appointments = appointmentRepository.searchAppointments(doctorName, date);
            session.getTransaction().commit();
            List<AppointmentDTO> b=new ArrayList<>();
            if (appointments != null) {
                for (Appointment appointment : appointments) {
                    
                    PatientDTO p=new PatientDTO(
                        appointment.getPatient().getpID(),
                            appointment.getPatient().getpName(),
                            appointment.getPatient().getpAddress(),
                            appointment.getPatient().getpContact(),
                            appointment.getPatient().getAge(),
                            appointment.getPatient().getGender());
                    ReceptionDTO r=new ReceptionDTO(
                    appointment.getReception().getrID(),
                    appointment.getReception().getrName(),
                    appointment.getReception().getAddress(),
                    appointment.getReception().getContact(),
                    appointment.getReception().getrPassword());
                    HospitalDTO h=new HospitalDTO(
                    appointment.getDoctor().gethID(),
                    appointment.getDoctor().getHospital());
                    SpecialityDTO s=new SpecialityDTO(
                    appointment.getDoctor().getSpecialityID(),
                    appointment.getDoctor().getSpetiality());
                    
                    DoctorDTO d=new DoctorDTO(
                            appointment.getDoctor().getdID(),
                            appointment.getDoctor().getdName(),
                            appointment.getDoctor().getSpecialityID(),
                            appointment.getDoctor().gethID(),
                            appointment.getDoctor().getdRNo(),
                            appointment.getDoctor().getdAddress(),
                            appointment.getDoctor().getdNIC()
                            ,appointment.getDoctor().getdContact(),
                            appointment.getDoctor().getHospital(),
                            appointment.getDoctor().getSpetiality());
                    AppointmentDTO appointmentDTO = new AppointmentDTO(
                            appointment.getAppointmentID(),
                            appointment.getpID(),
                            appointment.getrID(),
                            appointment.getdID(),
                            appointment.getAppDate(),
                            appointment.getAppTime(),appointment.getAppNO());
                
                    b.add(appointmentDTO); 
                }
                
                return  b;
                
            } else {
                return null;
            }
        }
    }

    @Override
    public AppointmentDTO searchAppointmentsByPatientName(String patientName) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            appointmentRepository.setSession(session);
            session.beginTransaction();
            Appointment a = appointmentRepository.searchByPatientName(patientName);
            session.getTransaction().commit();
            if (a != null) {
                AppointmentDTO appointmentDTO = new AppointmentDTO();
                appointmentDTO.setAppointmentID(a.getAppointmentID());
                appointmentDTO.setAppDate(a.getAppDate());
                appointmentDTO.setpName(a.getpName());
                appointmentDTO.setdName(a.getdName());
                return appointmentDTO;
            } else {
                return null;
            }
        }
    }

    @Override
    public AppointmentDTO searchAppointmentsById(int id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            appointmentRepository.setSession(session);
            session.beginTransaction();
            Appointment a = appointmentRepository.searchById(id);
            session.getTransaction().commit();
            if (a != null) {
                AppointmentDTO appointmentDTO = new AppointmentDTO();
                appointmentDTO.setAppointmentID(a.getAppointmentID());
                appointmentDTO.setpID(a.getpID());
                appointmentDTO.setrID(a.getrID());
                appointmentDTO.setdID(a.getdID());
                appointmentDTO.setAppDate(a.getAppDate());
                appointmentDTO.setAppTime(a.getAppTime());
                appointmentDTO.setAppNO(a.getAppNO());
                appointmentDTO.setpName(a.getpName());
                appointmentDTO.setdName(a.getdName());
                return appointmentDTO;
            } else {
                return null;
            }
        }
    }
}
