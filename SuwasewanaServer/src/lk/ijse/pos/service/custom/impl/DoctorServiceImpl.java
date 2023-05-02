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
import lk.ijse.pos.business.custom.DoctorBO;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.DoctorService;

/**
 *
 * @author DEll
 */
public class DoctorServiceImpl extends UnicastRemoteObject implements DoctorService,Subject{
    
    private DoctorBO doctorBO;
    private static ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<DoctorService> doctorResBook=new ReservationImpl<>();
    
    public DoctorServiceImpl()throws RemoteException{
        doctorBO=(DoctorBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.DOCTOR);
        
    }

    @Override
    public boolean addDoctor(DoctorDTO doctorDTO) throws Exception {
        boolean result=doctorBO.addDoctor(doctorDTO);
        return result;
    }

    @Override
    public boolean updateDoctor(DoctorDTO doctorDTO) throws Exception {
        boolean result=false;
        if (doctorResBook.reserve(doctorDTO.getdID(), this, true)) {
            result=doctorBO.updateDoctor(doctorDTO);
            notifyAllObservers();
            if (doctorResBook.isReservedInternally(doctorDTO.getdID())) {
                doctorResBook.release(doctorDTO.getdID());
            }
         }
        return result;
    }

    @Override
    public boolean deleteDoctor(String doctorID) throws Exception {
        boolean result=false;
        if (doctorResBook.reserve(doctorID, this, true)) {
            result=doctorBO.deleteDoctor(doctorID);
            notifyAllObservers();
            if (doctorResBook.isReservedInternally(doctorID)) {
                doctorResBook.release(doctorID);
            }
        }
        return result;
    }

    @Override
    public List<DoctorDTO> getAllDoctors() throws Exception {
        return doctorBO.getAllDoctors();
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
    public boolean reserve(Object id) throws Exception {
        return doctorResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return doctorResBook.release(id);
    }

    @Override
    public DoctorDTO findByName(String name) throws Exception {
        return doctorBO.findByName(name);
    }
}
