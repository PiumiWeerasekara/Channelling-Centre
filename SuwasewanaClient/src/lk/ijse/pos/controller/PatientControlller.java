/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.PatientDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.PatientService;

/**
 *
 * @author DEll
 */
public class PatientControlller {
    public static boolean addPatient(PatientDTO patientDTO)throws Exception{
        PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
            System.out.print("Controller");

        return patientService.addPatient(patientDTO);
    }
    public static boolean updatePatient(PatientDTO patientDTO)throws Exception{
        PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        return patientService.updatePatient(patientDTO);
    }
    public static List<PatientDTO> getAllPatients()throws Exception{
        PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        return patientService.getAllPatients();
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject patientService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        patientService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject patientService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        patientService.unregisterObserver(observer);
    }
    public static boolean reservePatient(String patientId)throws Exception{
        PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        return patientService.reserve(patientId);
    }
    public static boolean releasePatient(String patientId)throws Exception{
       PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
       return patientService.release(patientId);
    }
    public static PatientDTO searchByName(String name)throws Exception{
        PatientService patientService=(PatientService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.PATIENT);
        return patientService.searchByName(name);
    }
}
