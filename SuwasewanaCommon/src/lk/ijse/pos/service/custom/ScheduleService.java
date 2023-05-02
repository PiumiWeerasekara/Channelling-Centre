/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.ScheduleDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface ScheduleService extends SuperService{
    public boolean addSchedule(ScheduleDTO scheduleDTO)throws Exception;
    public boolean updateSchedule(ScheduleDTO scheduleDTO)throws Exception;
    public boolean deleteSchedule(String scheduleID)throws Exception;
    public List<ScheduleDTO> getAllSchedules()throws Exception;
    public ScheduleDTO searchByDoctorName(String name)throws Exception;
    
}
