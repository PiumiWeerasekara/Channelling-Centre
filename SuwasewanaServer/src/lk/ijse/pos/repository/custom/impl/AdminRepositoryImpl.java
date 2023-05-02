/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.List;
import lk.ijse.pos.entity.Admin;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.AdminRepository;

/**
 *
 * @author DEll
 */
public class AdminRepositoryImpl extends SuperRepositoryImpl<Admin, String> implements AdminRepository{

    public AdminRepositoryImpl() {
    }

    @Override
    public Admin getLoginDetails(String username, String password) throws Exception {
        List<Admin> admins = session.createQuery("from Admin where name='" + username + "'  and password='" + password + "' ").list();
        Admin a = null;
        for (Admin admin : admins) {
            a = admin;
        }
        return a;

    }
    
    
    
}

