/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.AttendanceDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.AttendanceService;

/**
 *
 * @author DEll
 */
public class AttendanceController {
    public static boolean addAttendance(AttendanceDTO attendanceDTO)throws Exception{
        AttendanceService attendanceService=(AttendanceService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
            System.out.print("Controller");

        return attendanceService.addAttendance(attendanceDTO);
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject attendanceService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        attendanceService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject attendanceService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        attendanceService.unregisterObserver(observer);
    }
    public static boolean reserveAttendance(String attendanceId)throws Exception{
        AttendanceService attendanceService=(AttendanceService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return attendanceService.reserve(attendanceId);
    }
    public static boolean releaseAttendance(String attendanceId)throws Exception{
       AttendanceService attendanceService=(AttendanceService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
       return attendanceService.release(attendanceId);
    }
   public static List<AttendanceDTO> getAllAttendances()throws Exception{
        System.out.println("Rcontroller");
        AttendanceService attendanceService=(AttendanceService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.RECEPTION);
        return attendanceService.getAllAttendance();
    }
    
}
