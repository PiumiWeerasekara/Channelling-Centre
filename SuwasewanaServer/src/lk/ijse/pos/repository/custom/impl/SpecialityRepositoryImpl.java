/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.util.List;
import lk.ijse.pos.entity.Speciality;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.SpecialityRepository;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class SpecialityRepositoryImpl extends SuperRepositoryImpl<Speciality, String> implements SpecialityRepository {

    public SpecialityRepositoryImpl() {
    }

    public Speciality search(String name) throws Exception {
        System.out.println("criteria start");
        Criteria add = session.createCriteria(Speciality.class).add(Restrictions.eq("speciality", name));
        List<Speciality> specialities = add.list();
        System.out.println("criteria start12");
        Speciality s = null;
        for (Speciality speciality : specialities) {
            s = new Speciality();
            s.setSpecialityID(speciality.getSpecialityID());
            s.setSpeciality(speciality.getSpeciality());
        }
        return s;
    }
    /*
    
    
    
    
    System.out.println("criteria start");
        Criteria add = session.createCriteria(Speciality.class).add(Restrictions.eq("speciality", name));
        List<Speciality> specialities = add.list();
        System.out.println("criteria start12");
        Speciality s = null;
        for (Speciality speciality : specialities) {
            s = new Speciality();
            s.setSpecialityID(speciality.getSpecialityID());
            s.setSpeciality(speciality.getSpeciality());
        }
        return s;
    
    
    
    
    
     public Speciality search(String name) throws Exception {
     Criteria add = session.createCriteria(Speciality.class).add(Restrictions.eq("speciality", name));
     List<Speciality> specialities = add.list();
     Speciality s = new Speciality();
     for (Speciality speciality : specialities) {

     s.setSpecialityID(speciality.getSpecialityID());
     s.setSpeciality(speciality.getSpeciality());
     }
     return s;
     }
     */
    /*
     public static Movie Search(String id) throws Exception {

     Criteria add = session.createCriteria(Movie.class).add(Restrictions.eq("custId", id));
     List<Movie> movies = add.list();
     Movie m = null;
     for (Movie movy : movies) {
     m = new Movie();
     m.setMid(movy.getMid());
     m.setMovieName(movy.getMovieName());
     m.setProducer(movy.getProducer());
     m.setReleaseDate(movy.getReleaseDate());
     m.setStartTime(movy.getStartTime());

     }

     return m;
     }
     */

//    @Override
//    public boolean getSpeciality(String speciality) throws Exception {
//        Query q = session.createQuery("select * from Speciality where speciality='" +speciality+ "'");
//        List<String> list=q.list();
//        System.out.println(list.get(0));
//        return true;
//    }

    @Override
    public Speciality findByName(String name) {
        Query query = session.createQuery("from Speciality where speciality='"+name+"' ");
        List<Speciality> specialitys=query.list();
        Speciality sp=new Speciality();
        for(Speciality speciality : specialitys) {
            sp=speciality;
        }
        return sp;
    }
}
