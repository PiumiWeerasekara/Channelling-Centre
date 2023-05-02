/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.entity.Appointment;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface AppointmentRepository extends SuperRepository<Appointment, String>{
    
    public List<Appointment> searchAppointments(String doctorName,String date)throws Exception;
    public Appointment searchByPatientName(String name)throws Exception;
    public Appointment searchById(int id)throws Exception;
    //public ArrayList<Appointment> searchByPatientList(String name)throws Exception;
}
