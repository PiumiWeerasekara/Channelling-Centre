/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import lk.ijse.pos.entity.Reception;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface ReceptionRepository extends SuperRepository<Reception, String> {

    public Reception findByName(String name) throws Exception;

    public Reception getLoginDetails(String usernamde, String password)throws Exception;

}
