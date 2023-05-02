/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLSyntaxErrorException;
import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.SpecialityDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.SpecialityService;

/**
 *
 * @author DEll
 */
public class SpecialityController{
 
    
    public static boolean addSpeciality(SpecialityDTO specialityDTO) throws Exception {
        SpecialityService specialityService = (SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        return specialityService.addSpeciality(specialityDTO);
    }

    public static List<SpecialityDTO> getSpecialitys() throws Exception {
        System.out.println("SController");
        SpecialityService specialityService = (SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        return specialityService.getAllSpciality();
    }

    public static void registerObserver(Observer observer) throws Exception {
        Subject specialityService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        specialityService.registerObser(observer);
    }

    public static void unRegisterObserver(Observer observer) throws Exception {
        Subject specialityService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        specialityService.unregisterObserver(observer);
    }

    public static boolean reserveSpeciality(String specialityId) throws Exception {
        SpecialityService specialityService = (SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        return specialityService.reserve(specialityId);
    }

    public static boolean releaseSpeciality(String specialityId) throws Exception {
        SpecialityService specialityService = (SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        return specialityService.release(specialityId);
    }
    /*
    public static MovieDTO SerchById(String id)throws Exception{
        MovieService movieService=(MovieService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE);
        return movieService.SearchById(id);
    }
    */
    public static SpecialityDTO searchSpeciality(String speciality)throws Exception{
        SpecialityService specialityService=(SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
        System.out.println("specialityController");
        return specialityService.searchBySpeciality(speciality);
    }

//    public static boolean getSpeciality(String speciality) throws Exception{
//        SpecialityService specialityService=(SpecialityService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SPECIALITY);
//        return  specialityService.getSpeciality(speciality);
//    }

}
