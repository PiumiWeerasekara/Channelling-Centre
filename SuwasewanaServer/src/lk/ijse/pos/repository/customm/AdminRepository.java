/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import lk.ijse.pos.entity.Admin;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface AdminRepository extends SuperRepository<Admin, String>{
    public Admin getLoginDetails(String username, String password) throws Exception;
}
