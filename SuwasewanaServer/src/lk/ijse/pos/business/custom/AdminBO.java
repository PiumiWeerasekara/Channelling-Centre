/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.AdminDTO;

/**
 *
 * @author DEll
 */
public interface AdminBO extends SuperBO{
    public boolean addAdmin(AdminDTO adminDTO)throws Exception;
    public List<AdminDTO> getAllAdmins() throws Exception;
    public AdminDTO adminLogin(String usernme, String password)throws Exception;
}     

