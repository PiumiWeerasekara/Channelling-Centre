/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.Observer;

import java.rmi.Remote;

/**
 *
 * @author DEll
 */
public interface Subject extends Remote{
    public void registerObser(Observer observer)throws Exception;
    public void unregisterObserver(Observer observer)throws Exception;
    public void notifyAllObservers() throws Exception;
}
