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
import lk.ijse.pos.business.custom.HospitalBO;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.HospitalService;

/**
 *
 * @author DEll
 */
public class HospitalServiceImpl extends UnicastRemoteObject implements HospitalService,Subject{

    private HospitalBO hospitalBO;
    private static ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<HospitalService> hospitalResBook=new ReservationImpl<>();
    
    public  HospitalServiceImpl()throws RemoteException{
        hospitalBO=(HospitalBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.HOSPITAL);
    }
    @Override
    public boolean addHospital(HospitalDTO hospitalDTO) throws Exception {
        boolean result=hospitalBO.addHospital(hospitalDTO);
        return result;
    }

    @Override
    public boolean updateHospital(HospitalDTO hospitalDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteHospital(String hospitalID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HospitalDTO> getAllHospitals() throws Exception {
        return hospitalBO.getAllHospitals();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return hospitalResBook.reserve(id, this, false);
 }

    @Override
    public boolean release(Object id) throws Exception {
        return hospitalResBook.release(id);
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
    public HospitalDTO search(String hospital) throws Exception {
        return hospitalBO.search(hospital);
    }
    
}
