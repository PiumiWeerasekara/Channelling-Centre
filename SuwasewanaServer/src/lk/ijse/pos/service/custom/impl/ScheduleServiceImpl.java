/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.ScheduleBO;
import lk.ijse.pos.dto.ScheduleDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.ScheduleService;

/**
 *
 * @author DEll
 */
public class ScheduleServiceImpl extends UnicastRemoteObject implements ScheduleService, Subject {

    private ScheduleBO scheduleBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ScheduleService> scheduleResBook = new ReservationImpl<>();

    public ScheduleServiceImpl() throws RemoteException {
        scheduleBO = (ScheduleBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SCHEDULE);
    }

    @Override
    public boolean addSchedule(ScheduleDTO scheduleDTO) throws Exception {
        boolean result = scheduleBO.addSchedule(scheduleDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updateSchedule(ScheduleDTO scheduleDTO) throws Exception {
        boolean result=false;
        if (scheduleResBook.reserve(scheduleDTO.getSheduleID(), this, true)) {
            result=scheduleBO.updateSchedule(scheduleDTO);
            notifyAllObservers();
            if (scheduleResBook.isReservedInternally(scheduleDTO.getSheduleID())) {
               scheduleResBook.release(scheduleDTO.getSheduleID());
            }
        }
        return result;
    }

    @Override
    public boolean deleteSchedule(String scheduleID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ScheduleDTO> getAllSchedules() throws Exception {
        return scheduleBO.getAllSchedules();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return scheduleResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return scheduleResBook.release(id);
    }

    @Override
    public void registerObser(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() throws Exception {
        new Thread(() -> {
            for (Observer Observer : alObservers) {
                try {
                    Observer.update();
                } catch (Exception e) {
                    Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, e);
                }

            }
        }).start();
    }

    @Override
    public ScheduleDTO searchByDoctorName(String name) throws Exception {
        return scheduleBO.findByDoctorName(name);
    }
}
