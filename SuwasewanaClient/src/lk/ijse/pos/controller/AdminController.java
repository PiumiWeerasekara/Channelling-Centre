/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.dto.AdminDTO;
import lk.ijse.pos.proxy.ProxyHandler;
import lk.ijse.pos.service.ServiceFactory;
import lk.ijse.pos.service.custom.AdminService;

/**
 *
 * @author DEll
 */
public class AdminController {
    public static List<AdminDTO> getAllAdmins()throws Exception{
        AdminService adminService=(AdminService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.ADMIN);
        return adminService.getAllAdmins();
    }
    public static boolean addAdmin(AdminDTO adminDTO)throws Exception{
        AdminService adminService=(AdminService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.ADMIN);
        return adminService.addAdmin(adminDTO);
    }
    public static AdminDTO adminLogin(String username,String password)throws Exception{
    AdminService adminService=  (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.serviceTypes.ADMIN);
        return adminService.adminLogin(username, password);
    }
    
}
