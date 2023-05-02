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
import lk.ijse.pos.business.custom.PaymentBO;
import lk.ijse.pos.dto.PaymentDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.PaymentService;

/**
 *
 * @author DEll
 */
public class PaymentServiceImpl extends UnicastRemoteObject implements PaymentService,Subject{
    
    private PaymentBO paymentBO;
    private static ArrayList<Observer> alObservers=new ArrayList<>();
    private static ReservationImpl<PaymentService> paymentResBook=new ReservationImpl<>();
    
    public PaymentServiceImpl()throws RemoteException{
        paymentBO=(PaymentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAYMENT);
    }

    @Override
    public boolean addPayment(PaymentDTO paymentDTO) throws Exception {
        boolean result=paymentBO.addPayment(paymentDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception {
        boolean result=false;
        if (paymentResBook.reserve(paymentDTO.getPaID(), this, true)) {
            result=paymentBO.updatePayment(paymentDTO);
            notifyAllObservers();
            if (paymentResBook.isReservedInternally(paymentDTO.getPaID())) {
               paymentResBook.release(paymentDTO.getPaID());
            }
        }
        return result;
    }

    @Override
    public boolean deletePayment(String patientID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> getAllPayments() throws Exception {
        return paymentBO.getAllPayment();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
                return paymentResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return paymentResBook.release(id);
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
    }

