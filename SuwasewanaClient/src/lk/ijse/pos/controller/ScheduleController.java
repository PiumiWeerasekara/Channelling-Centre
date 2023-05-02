/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.ScheduleDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.ScheduleService;

/**
 *
 * @author DEll
 */
public class ScheduleController {
    public static boolean addSchedule(ScheduleDTO scheduleDTO)throws Exception{
        ScheduleService scheduleService=(ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
            System.out.print("Controller");

        return scheduleService.addSchedule(scheduleDTO);
    }
    public static void registerObserver(Observer observer)throws Exception{
        Subject scheduleService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        scheduleService.registerObser(observer);
    }
    public static void unRegisterObserver(Observer observer)throws Exception{
        Subject scheduleService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        scheduleService.unregisterObserver(observer);
    }
    public static boolean reserveSchedule(String scheduleId)throws Exception{
        ScheduleService scheduleService=(ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        return scheduleService.reserve(scheduleId);
    }
    public static boolean releaseSchedule(String scheduleId)throws Exception{
       ScheduleService scheduleService=(ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
       return scheduleService.release(scheduleId);
    }
    public static boolean updateSchedule(ScheduleDTO scheduleDTO)throws Exception{
        ScheduleService scheduleService=(ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        return scheduleService.updateSchedule(scheduleDTO);
    }
    public static List<ScheduleDTO> getAllSchedules()throws Exception{
        System.out.println("Rcontroller");
        ScheduleService scheduleService=(ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        return scheduleService.getAllSchedules();
    }
    public static ScheduleDTO searchSchedule(String name)throws Exception{
    ScheduleService scheduleService= (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.SCHEDULE);
        return scheduleService.searchByDoctorName(name);
    }
    
}
