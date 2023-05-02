/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.List;
import lk.ijse.pos.entity.Hospital;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.HospitalRepository;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class HospitalRepositoryImpl extends SuperRepositoryImpl<Hospital, String> implements HospitalRepository{

    public HospitalRepositoryImpl() {
    }

    @Override
    public Hospital finByHospital(String name) throws Exception {
        Query query=session.createQuery("from Hospital where hospital='"+name+"'");
        List<Hospital> hospitals=query.list();
        Hospital h=new Hospital();
        for (Hospital hospital : hospitals) {
            h=hospital;
        }
        return h;
    }
    
    
        
        
        
}
