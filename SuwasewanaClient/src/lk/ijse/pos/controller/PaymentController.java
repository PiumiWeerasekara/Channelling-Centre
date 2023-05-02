/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.PaymentDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.PaymentService;

/**
 *
 * @author DEll
 */
public class PaymentController {
    public static boolean addPayment(PaymentDTO paymentDTO)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
            System.out.print("Controller");

        return paymentService.addPayment(paymentDTO);
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject receptionService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
        receptionService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject paymentService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
        paymentService.unregisterObserver(observer);
    }
    public static boolean reservePayment(String paymentId)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
        return paymentService.reserve(paymentId);
    }
    public static boolean releasePayment(String paymentId)throws Exception{
       PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
       return paymentService.release(paymentId);
    }
    public static List<PaymentDTO> getAllPayments()throws Exception{
        System.out.println("Rcontroller");
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PAYMENT);
        return paymentService.getAllPayments();
    }
    
}
