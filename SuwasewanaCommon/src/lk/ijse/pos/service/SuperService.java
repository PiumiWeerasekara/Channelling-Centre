/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service;

import java.rmi.Remote;
import lk.ijse.pos.reservation.Reservation;

/**
 *
 * @author DEll
 */
public interface SuperService extends Remote, Reservation{
    
}
