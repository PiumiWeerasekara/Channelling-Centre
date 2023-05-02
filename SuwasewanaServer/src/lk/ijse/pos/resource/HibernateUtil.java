/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.resource;

import java.io.File;
import lk.ijse.pos.entity.Admin;
import lk.ijse.pos.entity.Appointment;
import lk.ijse.pos.entity.Attendance;
import lk.ijse.pos.entity.Doctor;
import lk.ijse.pos.entity.Hospital;
import lk.ijse.pos.entity.Patient;
import lk.ijse.pos.entity.Payment;
import lk.ijse.pos.entity.Reception;
import lk.ijse.pos.entity.Schedule;
import lk.ijse.pos.entity.Speciality;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author DEll
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static StandardServiceRegistry registry;
    
    static {
        try {
            registry = new StandardServiceRegistryBuilder().loadProperties(new File("settings/hibernate.properties")).build();
            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Admin.class)
                    .addAnnotatedClass(Appointment.class)
                    .addAnnotatedClass(Doctor.class)
                    .addAnnotatedClass(Attendance.class)
                    .addAnnotatedClass(Hospital.class)
                    .addAnnotatedClass(Patient.class)
                    .addAnnotatedClass(Payment.class)
                    .addAnnotatedClass(Reception.class)
                    .addAnnotatedClass(Schedule.class)
                    .addAnnotatedClass(Speciality.class)
                    .buildMetadata().buildSessionFactory();
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            StandardServiceRegistryBuilder.destroy(registry);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
