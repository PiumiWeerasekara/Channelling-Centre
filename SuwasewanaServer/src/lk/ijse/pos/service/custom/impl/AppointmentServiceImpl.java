/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom.impl;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.AppointmentBO;
import lk.ijse.pos.dto.AppointmentDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.SuperService;
import lk.ijse.pos.service.custom.AppointmentService;

/**
 *
 * @author DEll
 */
public class AppointmentServiceImpl extends UnicastRemoteObject implements AppointmentService, Subject {

    private AppointmentBO appointmentBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<AppointmentService> appointmentResBook = new ReservationImpl<>();

    public AppointmentServiceImpl() throws Exception {
        appointmentBO = (AppointmentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.APPOINTMENT);
    }

    @Override
    public boolean addAppointment(AppointmentDTO appointmentDTO) throws Exception {
        boolean result=appointmentBO.addAppointment(appointmentDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updateAppointment(AppointmentDTO appointmentDTO) throws Exception {
        boolean result=false;
        if (appointmentResBook.reserve(appointmentDTO.getrID(), this, true)) {
            result=appointmentBO.updateAppointment(appointmentDTO);
            notifyAllObservers();
            if (appointmentResBook.isReservedInternally(appointmentDTO.getAppointmentID())) {
               appointmentResBook.release(appointmentDTO.getAppointmentID());
            }
        }
        return result;
    }

    @Override
    public boolean deleteAppointment(String appointmentID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AppointmentDTO> getAllAppointments() throws Exception {
        return appointmentBO.getAllAppointments();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
                return appointmentResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return appointmentResBook.release(id);
    }

    @Override
    public void registerObser(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() throws Exception {
        new Thread(()->{
            for (Observer Observer : alObservers) {
                try {
                    Observer.update();
                } catch (Exception e) {
                    Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE,null,e);
                }
                
            }
        }).start();
    }

    @Override
    public List<AppointmentDTO> searchAppointments(String doctorName, String date) throws Exception {
        return appointmentBO.searchAppointments(doctorName, date);
    }

    @Override
    public AppointmentDTO searchAppointmentsByPatientName(String PatientName) throws Exception {
        return appointmentBO.searchAppointmentsByPatientName(PatientName);
    }

    @Override
    public AppointmentDTO searchAppointmentsById(int id) throws Exception {
        return appointmentBO.searchAppointmentsById(id);
    }

}
