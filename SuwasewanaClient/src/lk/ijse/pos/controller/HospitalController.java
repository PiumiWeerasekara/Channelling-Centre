/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.HospitalDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.HospitalService;
import lk.ijse.pos.service.custom.SpecialityService;

/**
 *
 * @author DEll
 */
public class HospitalController {

    public static boolean addHospital(HospitalDTO hospitalDTO) throws Exception {
        HospitalService hospitalService = (HospitalService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        return hospitalService.addHospital(hospitalDTO);
    }

    public static List<HospitalDTO> getHospitals() throws Exception {
        HospitalService hospitalService = (HospitalService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        return hospitalService.getAllHospitals();
    }

    public static HospitalDTO search(String hospital) throws Exception {
        HospitalService hospitalService = (HospitalService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        return hospitalService.search(hospital);
    }

    public static void registerObserver(Observer observer) throws Exception {
        Subject hospitalService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        hospitalService.registerObser(observer);
    }

    public static void unRegisterObserver(Observer observer) throws Exception {
        Subject hospitalService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        hospitalService.unregisterObserver(observer);
    }

    public static boolean reserveHospital(String hospitalId) throws Exception {
        HospitalService hospitalService = (HospitalService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        return hospitalService.reserve(hospitalId);
    }

    public static boolean releaseHospital(String hospitalId) throws Exception {
        HospitalService hospitalService = (HospitalService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.HOSPITAL);
        return hospitalService.release(hospitalId);
    }
}
