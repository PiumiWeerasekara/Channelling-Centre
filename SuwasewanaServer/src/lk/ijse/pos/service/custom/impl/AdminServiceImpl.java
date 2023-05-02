/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import lk.ijse.pos.Observer.Observer;
import lk.ijse.pos.Observer.Subject;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.AdminBO;
import lk.ijse.pos.dto.AdminDTO;
import lk.ijse.pos.service.custom.AdminService;

/**
 *
 * @author DEll
 */
public class AdminServiceImpl extends UnicastRemoteObject implements AdminService,Subject{
    
    private AdminBO adminBO;
    public AdminServiceImpl()throws RemoteException{
        adminBO=(AdminBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ADMIN);
               
    }
            
    @Override
    public List<AdminDTO> getAllAdmins() throws Exception {
        return adminBO.getAllAdmins();
    }

    @Override
    public void registerObser(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyAllObservers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean release(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAdmin(AdminDTO adminDTO) throws Exception {
        boolean result=adminBO.addAdmin(adminDTO);
        return result;
    }

    @Override
    public AdminDTO adminLogin(String userName, String password) throws Exception {
        return adminBO.adminLogin(userName, password);
    }
    
}
