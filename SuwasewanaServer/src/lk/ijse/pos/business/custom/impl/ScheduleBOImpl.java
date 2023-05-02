/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.ScheduleBO;
import lk.ijse.pos.dto.ScheduleDTO;
import lk.ijse.pos.entity.Schedule;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.ScheduleRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class ScheduleBOImpl implements ScheduleBO {

    private ScheduleRepository scheduleRepository;

    public ScheduleBOImpl() {
        this.scheduleRepository = (ScheduleRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.SCHEDULE);
    }

    @Override
    public boolean addSchedule(ScheduleDTO scheduleDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            scheduleRepository.setSession(session);
            Schedule s = new Schedule(scheduleDTO.getdID(),
                    scheduleDTO.getdName(),
                    scheduleDTO.getDay(),
                    scheduleDTO.getTimePeriod(),
                    scheduleDTO.getPatientsPerDay());
            boolean result = scheduleRepository.save(s);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateSchedule(ScheduleDTO scheduleDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            scheduleRepository.setSession(session);
            session.beginTransaction();
            Schedule s = new Schedule(scheduleDTO.getSheduleID(),
                    scheduleDTO.getdID(),
                    scheduleDTO.getdName(),
                    scheduleDTO.getDay(),
                    scheduleDTO.getTimePeriod(),
                    scheduleDTO.getPatientsPerDay());
            scheduleRepository.update(s);
            System.out.println("bo");
            session.getTransaction().commit();
            System.out.println("bo2");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteSchedule(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ScheduleDTO> getAllSchedules() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            scheduleRepository.setSession(session);
            session.beginTransaction();
            List<Schedule> schedules = scheduleRepository.findAll();
            session.getTransaction().commit();
            if (schedules != null) {
                List<ScheduleDTO> alSchedules = new ArrayList<>();
                for (Schedule schedule : schedules) {
                    ScheduleDTO dto = new ScheduleDTO(schedule.getdID(),
                            schedule.getdName(),
                            schedule.getDay(),
                            schedule.getTimePeriod(),
                            schedule.getPatientsPerDay());
                    alSchedules.add(dto);
                    System.out.println("RBo");
                }
                return alSchedules;

            } else {
                return null;
            }
        }
    }

    @Override
    public ScheduleDTO findByDoctorName(String name) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            scheduleRepository.setSession(session);
            session.beginTransaction();
            Schedule s = scheduleRepository.findByDoctorName(name);
            session.getTransaction().commit();
            if (s != null) {
                ScheduleDTO scheduleDTO = new ScheduleDTO();
                scheduleDTO.setSheduleID(s.getSheduleID());
                scheduleDTO.setdID(s.getdID());
                scheduleDTO.setdName(s.getdName());
                scheduleDTO.setDay(s.getDay());
                scheduleDTO.setTimePeriod(s.getTimePeriod());
                scheduleDTO.setPatientsPerDay(s.getPatientsPerDay());
                return scheduleDTO;
            } else {
                return null;
            }
        }

    }
}
