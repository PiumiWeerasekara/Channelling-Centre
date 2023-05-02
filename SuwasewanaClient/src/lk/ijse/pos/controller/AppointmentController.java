/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.dto.AppointmentDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.AppointmentService;

/**
 *
 * @author DEll
 */
public class AppointmentController {

    public static boolean addAppointment(AppointmentDTO appointmentDTO) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        System.out.print("Controller");

        return appointmentService.addAppointment(appointmentDTO);
    }

    public static void registerObserver(Observer observer) throws Exception {
        Subject appointmentService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        appointmentService.registerObser(observer);
    }

    public static void unRegisterObserver(Observer observer) throws Exception {
        Subject appointmentService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        appointmentService.unregisterObserver(observer);
    }

    public static boolean reserveAppointment(String appointmentId) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.reserve(appointmentId);
    }

    public static boolean releaseAppointment(String appointmentId) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.release(appointmentId);
    }

    public static boolean updateAppointment(AppointmentDTO appointmentDTO) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.updateAppointment(appointmentDTO);
    }

    public static List<AppointmentDTO> getAllAppointments() throws Exception {
        System.out.println("Rcontroller");
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.getAllAppointments();
    }

    public static List<AppointmentDTO>  searchAppointments(String doctorName, String date) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.searchAppointments(doctorName, date);
    }
    public static AppointmentDTO searchAppointmentsByPatient(String patientName) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.searchAppointmentsByPatientName(patientName);
    }
    public static AppointmentDTO searchAppointmentsByPId(int id) throws Exception {
        AppointmentService appointmentService = (AppointmentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.APPOINTMENT);
        return appointmentService.searchAppointmentsById(id);
    }
   
}
