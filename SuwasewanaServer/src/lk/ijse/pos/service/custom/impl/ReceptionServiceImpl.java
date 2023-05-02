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
import lk.ijse.pos.business.custom.ReceptionBO;
import lk.ijse.pos.dto.ReceptionDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.ReceptionService;

/**
 *
 * @author DEll
 */
public class ReceptionServiceImpl extends UnicastRemoteObject implements ReceptionService,Subject{
    
    private ReceptionBO receptionBO;
    private static ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<ReceptionService> reseptionResBook=new ReservationImpl<>();
    
    public ReceptionServiceImpl()throws RemoteException{
        receptionBO=(ReceptionBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.RECEPTION);
    }

    @Override
    public boolean addReception(ReceptionDTO receptionDTO) throws Exception {
                System.out.println("RService");

        boolean result=receptionBO.addReception(receptionDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updateReception(ReceptionDTO receptionDTO) throws Exception {
        boolean result=false;
        if (reseptionResBook.reserve(receptionDTO.getrID(), this, true)) {
            result=receptionBO.updateReception(receptionDTO);
            notifyAllObservers();
            if (reseptionResBook.isReservedInternally(receptionDTO.getrID())) {
               reseptionResBook.release(receptionDTO.getrID());
            }
        }
        return result;
    }

    @Override
    public boolean deleteReception(String receptionID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReceptionDTO> getAllReceptions() throws Exception {
        return receptionBO.getAllReceptions();
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
                return reseptionResBook.reserve(id, this, false);

    }

    @Override
    public boolean release(Object id) throws Exception {
        return reseptionResBook.release(id);
    }

    @Override
    public ReceptionDTO searchByNaem(String name) throws Exception {
        return receptionBO.searchByName(name);
    }

    @Override
    public ReceptionDTO receptionLogin(String username, String password) throws Exception {
       return receptionBO.receptionLogin(username, password);
    }
    
}
