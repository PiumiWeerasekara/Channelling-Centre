/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.AdminDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface AdminService extends SuperService{
    public boolean addAdmin(AdminDTO adminDTO)throws Exception;
    public List<AdminDTO> getAllAdmins()throws Exception;
    public AdminDTO adminLogin(String userName,String password)throws Exception;
}