/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.ReceptionDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.ReceptionService;

/**
 *
 * @author DEll
 */
public class ReceptionController {
    public static boolean addReception(ReceptionDTO receptionDTO)throws Exception{
        ReceptionService receptionService=(ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
            System.out.print("Controller");

        return receptionService.addReception(receptionDTO);
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject receptionService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        receptionService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject receptionService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        receptionService.unregisterObserver(observer);
    }
    public static boolean reserveReception(String receptionId)throws Exception{
        ReceptionService receptionService=(ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return receptionService.reserve(receptionId);
    }
    public static boolean releaseReception(String receptionId)throws Exception{
       ReceptionService receptionService=(ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
       return receptionService.release(receptionId);
    }
    public static boolean updateReception(ReceptionDTO receptionDTO)throws Exception{
        ReceptionService receptionService=(ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return receptionService.updateReception(receptionDTO);
    }
    public static List<ReceptionDTO> getAllReceptions()throws Exception{
        System.out.println("Rcontroller");
        ReceptionService receptionService=(ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return receptionService.getAllReceptions();
    }
    public static ReceptionDTO searchReception(String Reception)throws Exception{
    ReceptionService receptionService= (ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return receptionService.searchByNaem(Reception);
    }
    public static ReceptionDTO receptionLogin(String username,String password)throws Exception{
    ReceptionService receptionService= (ReceptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return receptionService.receptionLogin(username, password);
    }
}
