/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.ScheduleDTO;
import lk.ijse.pos.entity.Schedule;

/**
 *
 * @author DEll
 */
public interface ScheduleBO extends SuperBO{
    public boolean addSchedule(ScheduleDTO scheduleDTO)throws Exception;
    public boolean updateSchedule(ScheduleDTO scheduleDTO)throws Exception;
    public boolean deleteSchedule(String id)throws Exception;
    public List<ScheduleDTO> getAllSchedules()throws Exception;
    public ScheduleDTO findByDoctorName(String name) throws Exception ;
}

