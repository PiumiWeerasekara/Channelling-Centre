/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository;

import lk.ijse.pos.repository.custom.impl.AdminRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.AppointmentRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.AttendanceRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.DoctorRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.HospitalRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.PatientRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.PaymentRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.ReceptionRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.ScheduleRepositoryImpl;
import lk.ijse.pos.repository.custom.impl.SpecialityRepositoryImpl;

/**
 *
 * @author DEll
 */
public class RepositoryFactory {

    public enum RepositoryTypes {

        RECEPTION, PATIENT, DOCTOR, PAYMENT, APPOINTMENT, ATTENDANCE, SCHEDULE, HOSPITAL, SPECIALITY, ADMIN

    }
    public static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
    }

    public static RepositoryFactory getInstance() {
        if (repositoryFactory == null) {
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryTypes type) {
        switch (type) {
            case RECEPTION:
                return new ReceptionRepositoryImpl();
            case ADMIN:
                return new AdminRepositoryImpl();
            case DOCTOR:
                return new DoctorRepositoryImpl();
            case SPECIALITY:
                return new SpecialityRepositoryImpl();
            case HOSPITAL:
                return new HospitalRepositoryImpl();
            case PATIENT:
                return new PatientRepositoryImpl();
            case APPOINTMENT:
                return new AppointmentRepositoryImpl();
            case SCHEDULE:
                return new ScheduleRepositoryImpl();
            case ATTENDANCE:
                return new AttendanceRepositoryImpl();
            case PAYMENT:
                return new PaymentRepositoryImpl();
            default:
                return null;
        }
    }
}
