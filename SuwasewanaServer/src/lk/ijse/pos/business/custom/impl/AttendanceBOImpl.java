/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.AttendanceBO;
import lk.ijse.pos.dto.AttendanceDTO;
import lk.ijse.pos.entity.Attendance;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.AttendanceRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class AttendanceBOImpl implements AttendanceBO {

    private AttendanceRepository attendanceRepository;

    public AttendanceBOImpl() {
        this.attendanceRepository = (AttendanceRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ATTENDANCE);
    }

    @Override
    public boolean addAttendance(AttendanceDTO attendanceDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            attendanceRepository.setSession(session);
            Attendance a = new Attendance(attendanceDTO.getAppointmentID(),
                    attendanceDTO.getDoctorName(),
                    attendanceDTO.getPatientName(),
                    attendanceDTO.getAppointmentNo(),
                    attendanceDTO.getAtDate(),
                    attendanceDTO.getAtTime(),
                    attendanceDTO.getAttendance());
            boolean result = attendanceRepository.save(a);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateAttendance(AttendanceDTO attendanceDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAttendance(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AttendanceDTO> getAllAttendance() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            attendanceRepository.setSession(session);
            session.beginTransaction();
            List<Attendance> attendances = attendanceRepository.findAll();
            session.getTransaction().commit();
            if (attendances != null) {
                List<AttendanceDTO> alAttendances = new ArrayList<>();
                for (Attendance attendance : attendances) {
                    AttendanceDTO dto = new AttendanceDTO(attendance.getAppointmentID(),
                            attendance.getDoctorName(),
                            attendance.getPatientName(),
                            attendance.getAppointmentNo(),
                            attendance.getAtDate(),
                    attendance.getAtTime(),
                    attendance.getAttendance());
                    alAttendances.add(dto);
                    System.out.println("RBo");
                }
                return alAttendances;
                
            } else {
                return null;
            }
        }
    }

}
