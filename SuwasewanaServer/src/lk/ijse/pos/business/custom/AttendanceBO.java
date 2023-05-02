/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.AttendanceDTO;

/**
 *
 * @author DEll
 */
public interface AttendanceBO extends SuperBO{
    public boolean addAttendance(AttendanceDTO attendanceDTO)throws Exception;
    public boolean updateAttendance(AttendanceDTO attendanceDTO)throws Exception;
    public boolean deleteAttendance(String id)throws Exception;
    public List<AttendanceDTO> getAllAttendance()throws Exception;
}
