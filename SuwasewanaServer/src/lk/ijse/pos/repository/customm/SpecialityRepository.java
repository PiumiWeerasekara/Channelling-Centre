/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.customm;

import java.sql.SQLSyntaxErrorException;
import lk.ijse.pos.entity.Speciality;
import lk.ijse.pos.repository.SuperRepository;

/**
 *
 * @author DEll
 */
public interface SpecialityRepository extends SuperRepository<Speciality, String>{
    //public Speciality search(String name) throws Exception;
//    public Speciality findById(String speciality);
    //public Speciality findBySpeciality(String speciality)throws Exception;
    public Speciality findByName(String name)throws Exception,SQLSyntaxErrorException;
}
