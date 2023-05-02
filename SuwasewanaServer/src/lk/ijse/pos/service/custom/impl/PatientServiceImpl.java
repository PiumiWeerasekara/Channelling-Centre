/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.PatientBO;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.reservation.Reservation;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.PatientService;

/**
 *
 * @author DEll
 */
public class PatientServiceImpl extends UnicastRemoteObject implements PatientService,Subject{
    
    private PatientBO patientBO;
    private ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<PatientService> patientResBook=new ReservationImpl<>();
    
    public PatientServiceImpl()throws RemoteException{
        patientBO=(PatientBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PATIENT);
    }

    @Override
    public boolean addPatient(PatientDTO patientDTO) throws Exception {
        boolean result=patientBO.addPatient(patientDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updatePatient(PatientDTO patientDTO) throws Exception {
        boolean result=false;
        if (patientResBook.reserve(patientDTO.getpID(), this, true)) {
            result=patientBO.updatePatient(patientDTO);
            notifyAllObservers();
            if (patientResBook.isReservedInternally(patientDTO.getpID())) {
                patientResBook.release(patientDTO.getpID());
            }
         }
        return result;
    }

    @Override
    public boolean deletePatient(String patientID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PatientDTO> getAllPatients() throws Exception {
        return patientBO.getAllPatients();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return patientResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return patientResBook.release(id);
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
    public PatientDTO searchByName(String name) throws Exception {
        return patientBO.findByName(name);
    }
}
