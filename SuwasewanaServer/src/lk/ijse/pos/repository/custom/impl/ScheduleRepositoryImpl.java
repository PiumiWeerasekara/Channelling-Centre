/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.List;
import lk.ijse.pos.entity.Schedule;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.ScheduleRepository;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class ScheduleRepositoryImpl extends SuperRepositoryImpl<Schedule, String> implements ScheduleRepository{

    public ScheduleRepositoryImpl() {
    }
    public Schedule findByDoctorName(String name) throws Exception {
        Query query = session.createQuery("from Schedule where dName='" + name + "' ");
        List<Schedule> schedules = query.list();
        Schedule s = new Schedule();
        for (Schedule schedule : schedules) {
            s = schedule;
        }
        return s;
    }
        
}
