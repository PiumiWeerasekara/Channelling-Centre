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
import lk.ijse.pos.business.custom.AttendanceBO;
import lk.ijse.pos.dto.AttendanceDTO;
import lk.ijse.pos.reservation.impl.ReservationImpl;
import lk.ijse.pos.service.custom.AttendanceService;

/**
 *
 * @author DEll
 */
public class AttendanceServiceImpl extends UnicastRemoteObject implements AttendanceService, Subject {

    private AttendanceBO attendanceBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<AttendanceService> attendanceResBook = new ReservationImpl<>();

    public AttendanceServiceImpl() throws RemoteException {
        attendanceBO = (AttendanceBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ATTENDANCE);
    }

    @Override
    public boolean addAttendance(AttendanceDTO attendanceDTO) throws Exception {
        boolean result = attendanceBO.addAttendance(attendanceDTO);
        notifyAllObservers();
        return result;
    }

    @Override
    public boolean updateAttendance(AttendanceDTO attendanceDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAttendance(String attendanceID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AttendanceDTO> getAllAttendance() throws Exception {
        return attendanceBO.getAllAttendance();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return attendanceResBook.reserve(id, this, false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return attendanceResBook.release(id);
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
}
