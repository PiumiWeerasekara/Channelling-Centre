/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.SuperService;
import lk.ijse.pos.service.custom.AdminService;
import lk.ijse.pos.service.custom.AppointmentService;
import lk.ijse.pos.service.custom.AttendanceService;
import lk.ijse.pos.service.custom.DoctorService;
import lk.ijse.pos.service.custom.HospitalService;
import lk.ijse.pos.service.custom.PatientService;
import lk.ijse.pos.service.custom.PaymentService;
import lk.ijse.pos.service.custom.ReceptionService;
import lk.ijse.pos.service.custom.ScheduleService;
import lk.ijse.pos.service.custom.SpecialityService;

/**
 *
 * @author DEll
 */
public class ProxyHandler implements ServiceFactory {

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private ReceptionService receptionService;
    private AdminService adminService;
    private DoctorService doctorService;
    private SpecialityService specialityService;
    private HospitalService hospitalService;
    private PatientService patientService;
    private AppointmentService appointmentService;
    private ScheduleService scheduleService;
    private AttendanceService attendanceService;
    private PaymentService paymentService;

    private ProxyHandler() {
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/pos");
            receptionService = (ReceptionService) serviceFactory.getService(serviceTypes.RECEPTION);
            adminService = (AdminService) serviceFactory.getService(serviceTypes.ADMIN);
            doctorService = (DoctorService) serviceFactory.getService(serviceTypes.DOCTOR);
            specialityService = (SpecialityService) serviceFactory.getService(serviceTypes.SPECIALITY);
            hospitalService = (HospitalService) serviceFactory.getService(serviceTypes.HOSPITAL);
            patientService = (PatientService) serviceFactory.getService(serviceTypes.PATIENT);
            appointmentService = (AppointmentService) serviceFactory.getService(serviceTypes.APPOINTMENT);
            scheduleService = (ScheduleService) serviceFactory.getService(serviceTypes.SCHEDULE);
            attendanceService = (AttendanceService) serviceFactory.getService(serviceTypes.ATTENDANCE);
            paymentService = (PaymentService) serviceFactory.getService(serviceTypes.PAYMENT);

        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ProxyHandler getInstance() {
        if (proxyHandler == null) {
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(serviceTypes type) throws Exception {
        switch (type) {
            case RECEPTION:
                return receptionService;
            case ADMIN:
                return adminService;
            case DOCTOR:
                return doctorService;
            case SPECIALITY:
                return specialityService;
            case HOSPITAL:
                return hospitalService;
            case PATIENT:
                return patientService;
            case APPOINTMENT:
                return appointmentService;
            case SCHEDULE:
                return scheduleService;
            case ATTENDANCE:
                return attendanceService;
            case PAYMENT:
                return paymentService;
            default:
                return null;
        }
    }
}
