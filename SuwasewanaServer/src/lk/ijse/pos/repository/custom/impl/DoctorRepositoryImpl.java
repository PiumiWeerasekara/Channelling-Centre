/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.List;
import lk.ijse.pos.entity.Doctor;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.DoctorRepository;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class DoctorRepositoryImpl extends SuperRepositoryImpl<Doctor, String> implements DoctorRepository{

    public DoctorRepositoryImpl() {
    }

    @Override
    public Doctor findByName(String name) throws Exception {
        Query query=session.createQuery("from Doctor where dName='"+name+"'");
        List<Doctor> doctors=query.list();
        Doctor d=new Doctor();
        for (Doctor doctor : doctors) {
            d=doctor;
        }
        return d;
    }
    
   
    
}
