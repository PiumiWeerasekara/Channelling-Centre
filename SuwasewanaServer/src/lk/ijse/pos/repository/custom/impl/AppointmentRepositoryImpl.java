/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.dto.AppointmentDTO;
import lk.ijse.pos.entity.Appointment;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.AppointmentRepository;
import org.hibernate.SQLQuery;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class AppointmentRepositoryImpl extends SuperRepositoryImpl<Appointment, String> implements AppointmentRepository {

    public AppointmentRepositoryImpl() {
    }

    @Override
    public List<Appointment> searchAppointments(String doctorName, String date) throws Exception {
        String  query = "select * from appointment where appDate='"+date+"' && dName='"+doctorName+"'";
        SQLQuery sQLQuery=session.createSQLQuery(query);
        sQLQuery.addEntity(Appointment.class);
        List<Appointment> appointments = sQLQuery.list();
       
        List<Appointment>appointments1=new ArrayList<>();
        if (appointments1==null) {
            System.out.println("nulllll");
        }else{
        for (Appointment appointment : appointments) {
          
           appointments1.add(appointment); 
           }
        }
        return appointments1;
}

//    @Override
//    public ArrayList<Appointment> searchByPatientList(String name) throws Exception {
//        Query query = session.createQuery("from Appointment where pName='" + name + "'");
//        List<Appointment> appointments = query.list();
//        Appointment a = new Appointment();
//        for (Appointment appointment : appointments) {    
//            a = appointment;
//        }
//        return appointments;
//    }

    @Override
    public Appointment searchByPatientName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appointment searchById(int id) throws Exception {
         Query query = session.createQuery("from Appointment where appointmentID='" + id + "'");
        List<Appointment> appointments = query.list();
        Appointment a = new Appointment();
        for (Appointment appointment : appointments) {
            a = appointment;
    }
        return a;
    }
}
    
