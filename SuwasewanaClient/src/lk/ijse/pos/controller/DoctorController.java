/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.DoctorDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.DoctorService;

/**
 *
 * @author DEll
 */
public class DoctorController {
    
    public static boolean addDoctor(DoctorDTO doctorDTO)throws Exception{
        DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        return doctorService.addDoctor(doctorDTO);
    }
    public static boolean updateDoctor(DoctorDTO doctorDTO)throws Exception{
        DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        return doctorService.updateDoctor(doctorDTO);
    }
    public static boolean DeleteDoctor(String doctor)throws Exception{
        DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        return doctorService.deleteDoctor(doctor);
    }
    public static List<DoctorDTO> getAllDoctors()throws Exception{
        DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        return doctorService.getAllDoctors();
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject doctorService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        doctorService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject doctorService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        doctorService.unregisterObserver(observer);
    }
    public static boolean reserveDoctor(String doctorId)throws Exception{
        DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
        return doctorService.reserve(doctorId);
    }
    public static boolean releaseDoctor(String doctorId)throws Exception{
       DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
       return doctorService.release(doctorId);
    }
    public static DoctorDTO findByName(String name)throws Exception{
    DoctorService doctorService=(DoctorService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.DOCTOR);
    return doctorService.findByName(name);
    }
}
