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
import lk.ijse.pos.business.custom.SpecialityBO;
import lk.ijse.pos.dto.SpecialityDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.SpecialityService;

/**
 *
 * @author DEll
 */
public class SpecialityServiceImpl extends UnicastRemoteObject implements SpecialityService,Subject{

    private SpecialityBO specialityBO;
    private static ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<SpecialityService> specialityResBook=new ReservationImpl<>();
    
    public SpecialityServiceImpl()throws RemoteException{
        specialityBO=(SpecialityBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SPECIALITY);
    }
    @Override
    public boolean addSpeciality(SpecialityDTO specialityDTO) throws Exception {
        boolean result=specialityBO.addSpeciality(specialityDTO);
        return result;
    }

    @Override
    public boolean updateSpeciality(SpecialityDTO specialityDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteSpeciality(String specialityID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SpecialityDTO> getAllSpciality() throws Exception {
        System.out.println("SServiceI");
        return specialityBO.getAllSpeciality();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return specialityResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return specialityResBook.release(id);
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

//    @Override
//    public boolean getSpeciality(String speciality) throws Exception {
//        boolean result = specialityBO.getSpeciality(speciality);
//        return result;
//    }

    @Override
    public SpecialityDTO searchBySpeciality(String speciality)throws Exception{
        System.out.println("Speciality service");
        return specialityBO.searchBySpeciality(speciality);
    }
    
}
