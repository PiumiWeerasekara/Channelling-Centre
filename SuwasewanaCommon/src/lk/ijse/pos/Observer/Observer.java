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
public interface Observer extends Remote{
    public void update()throws Exception;
}
