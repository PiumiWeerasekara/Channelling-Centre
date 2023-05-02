/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import java.io.Serializable;
import java.util.List;
import lk.ijse.pos.entity.Reception;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.ReceptionRepository;
import org.hibernate.query.Query;

/**
 *
 * @author DEll
 */
public class ReceptionRepositoryImpl extends SuperRepositoryImpl<Reception, String> implements ReceptionRepository {

    public ReceptionRepositoryImpl() {
        System.out.println("RECEPTION REPOSITORY");

    }

    @Override
    public Reception findByName(String name) throws Exception {
        Query query = session.createQuery("from Reception where rName='" + name + "' ");
        List<Reception> receptions = query.list();
        Reception r = new Reception();
        for (Reception reception : receptions) {
            r = reception;
        }
        return r;
    }

    @Override
    public Reception getLoginDetails(String username, String password) throws Exception {
        List<Reception> receptions = session.createQuery("from Reception where rName='" + username + "'  and rPassword='" + password + "' ").list();
        Reception rec = null;
        for (Reception reception : receptions) {
            rec = reception;
        }
        return rec;

    }
}
