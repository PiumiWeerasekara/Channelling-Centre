/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service;

import java.rmi.Remote;

/**
 *
 * @author DEll
 */
public interface ServiceFactory extends Remote{
    public enum serviceTypes{
        RECEPTION,PATIENT,DOCTOR,PAYMENT,APPOINTMENT,ATTENDANCE,SCHEDULE,HOSPITAL,SPECIALITY,ADMIN
        
    }
    public SuperService getService(serviceTypes type)throws Exception;
    
}
