/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.AttendanceDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface AttendanceService extends SuperService{
    public boolean addAttendance(AttendanceDTO attendanceDTO)throws Exception;
    public boolean updateAttendance(AttendanceDTO attendanceDTO)throws Exception;
    public boolean deleteAttendance(String attendanceID)throws Exception;
    public List<AttendanceDTO> getAllAttendance()throws Exception;
    
}
