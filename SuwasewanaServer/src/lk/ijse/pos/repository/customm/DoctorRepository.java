/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import lk.ijse.pos.entity.Doctor;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface DoctorRepository extends SuperRepository<Doctor, String>{
    public Doctor findByName(String name)throws Exception;
    
}
