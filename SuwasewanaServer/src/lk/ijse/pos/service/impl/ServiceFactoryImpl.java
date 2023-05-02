/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.SuperService;
import lk.ijse.pos.service.custom.impl.AdminServiceImpl;
import lk.ijse.pos.service.custom.impl.AppointmentServiceImpl;
import lk.ijse.pos.service.custom.impl.AttendanceServiceImpl;
import lk.ijse.pos.service.custom.impl.DoctorServiceImpl;
import lk.ijse.pos.service.custom.impl.HospitalServiceImpl;
import lk.ijse.pos.service.custom.impl.PatientServiceImpl;
import lk.ijse.pos.service.custom.impl.PaymentServiceImpl;
import lk.ijse.pos.service.custom.impl.ReceptionServiceImpl;
import lk.ijse.pos.service.custom.impl.ScheduleServiceImpl;
import lk.ijse.pos.service.custom.impl.SpecialityServiceImpl;

/**
 *
 * @author DEll
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    public static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws RemoteException {

    }

    public static ServiceFactory getInstance() throws RemoteException {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(serviceTypes type) throws Exception {
        switch (type) {
            case RECEPTION:
                return new ReceptionServiceImpl();
            case ADMIN:
                return new AdminServiceImpl();
            case DOCTOR:
                return new DoctorServiceImpl();
            case SPECIALITY:
                return new SpecialityServiceImpl();
            case HOSPITAL:
                return new HospitalServiceImpl();
            case PATIENT:
                return new PatientServiceImpl();
            case APPOINTMENT:
                return new AppointmentServiceImpl();
            case SCHEDULE:
                return new ScheduleServiceImpl();
            case ATTENDANCE:
                return new AttendanceServiceImpl();
            case PAYMENT:
                return new PaymentServiceImpl();
            default:
                return null;
        }
    }
}
