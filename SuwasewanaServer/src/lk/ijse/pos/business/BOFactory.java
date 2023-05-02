/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business;

import lk.ijse.pos.business.custom.impl.AdminBOImpl;
import lk.ijse.pos.business.custom.impl.AppointmentBOImpl;
import lk.ijse.pos.business.custom.impl.AttendanceBOImpl;
import lk.ijse.pos.business.custom.impl.DoctorBOImpl;
import lk.ijse.pos.business.custom.impl.HospitalBOImpl;
import lk.ijse.pos.business.custom.impl.PatientBOImpl;
import lk.ijse.pos.business.custom.impl.PaymentBOImpl;
import lk.ijse.pos.business.custom.impl.ReceptionBOImpl;
import lk.ijse.pos.business.custom.impl.ScheduleBOImpl;
import lk.ijse.pos.business.custom.impl.SpecialityBOImpl;

/**
 *
 * @author DEll
 */
public class BOFactory {

    public enum BOTypes {

        RECEPTION, PATIENT, DOCTOR, PAYMENT, APPOINTMENT, ATTENDANCE, SCHEDULE, HOSPITAL, SPECIALITY, ADMIN
    }
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BOTypes type) {
        switch (type) {
            case RECEPTION:
                return new ReceptionBOImpl();
            case ADMIN:
                return new AdminBOImpl();
            case DOCTOR:
                return new DoctorBOImpl();
            case SPECIALITY:
                return new SpecialityBOImpl();
            case HOSPITAL:
                return new HospitalBOImpl();
            case PATIENT:
                return new PatientBOImpl();
            case APPOINTMENT:
                return new AppointmentBOImpl();
            case SCHEDULE:
                return new ScheduleBOImpl();
            case ATTENDANCE:
                return new AttendanceBOImpl();
            case PAYMENT:
                return new PaymentBOImpl();
            default:
                return null;

        }
    }
}
