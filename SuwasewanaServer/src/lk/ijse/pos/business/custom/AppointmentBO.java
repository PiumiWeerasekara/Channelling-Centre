/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.AppointmentDTO;
import lk.ijse.pos.entity.Appointment;

/**
 *
 * @author DEll
 */
public interface AppointmentBO extends SuperBO{
    public boolean addAppointment(AppointmentDTO appointmentDTO)throws Exception;
    public boolean updateAppointment(AppointmentDTO appointmentDTO)throws Exception;
    public boolean deleteAppointment(String id)throws Exception;
    public List<AppointmentDTO> getAllAppointments()throws Exception;
    public List<AppointmentDTO> searchAppointments(String doctorName, String date) throws Exception;
    public AppointmentDTO searchAppointmentsByPatientName(String patientName) throws Exception;
    public AppointmentDTO searchAppointmentsById(int id) throws Exception;
}
