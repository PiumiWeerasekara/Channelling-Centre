/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.startUp;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pos.service.impl.ServiceFactoryImpl;


/**
 *
 * @author DEll
 */
public class ServerStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry registry=LocateRegistry.createRegistry(5050);
            registry.rebind("pos", ServiceFactoryImpl.getInstance());
            System.out.println("Sever has been started successfully");
            
            // TODO code application logic here
        } catch (RemoteException ex) {
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
