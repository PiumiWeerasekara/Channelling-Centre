/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import lk.ijse.pos.entity.Hospital;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface HospitalRepository extends SuperRepository<Hospital, String>{
    public Hospital finByHospital(String name)throws Exception;
    
}
