    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.ReceptionBO;
import lk.ijse.pos.dto.ReceptionDTO;
import lk.ijse.pos.entity.Reception;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.ReceptionRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class ReceptionBOImpl implements ReceptionBO {

    private ReceptionRepository receptionRepository;

    public ReceptionBOImpl() {
        this.receptionRepository = (ReceptionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.RECEPTION);
    }

    @Override
    public boolean addReception(ReceptionDTO receptionDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            receptionRepository.setSession(session);
            Reception r = new Reception(receptionDTO.getrName(),
                    receptionDTO.getAddress(),
                    receptionDTO.getContact(),
                    receptionDTO.getrPassword());
            boolean result = receptionRepository.save(r);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateReception(ReceptionDTO receptionDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            receptionRepository.setSession(session);
            session.beginTransaction();
            Reception r = new Reception(
                    receptionDTO.getrID(),
                    receptionDTO.getrName(),
                    receptionDTO.getAddress(),
                    receptionDTO.getContact(),
                    receptionDTO.getrPassword());
            receptionRepository.update(r);
            System.out.println("bo");
            session.getTransaction().commit();
            System.out.println("bo2");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteReception(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReceptionDTO> getAllReceptions() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            receptionRepository.setSession(session);
            session.beginTransaction();
            List<Reception> receptions = receptionRepository.findAll();
            session.getTransaction().commit();
            if (receptions != null) {
                List<ReceptionDTO> alReceptions = new ArrayList<>();
                for (Reception reception : receptions) {
                    ReceptionDTO dto = new ReceptionDTO(reception.getrName(),
                            reception.getAddress(),
                            reception.getContact(),
                            reception.getrPassword());
                    alReceptions.add(dto);
                    System.out.println("RBo");
                }
                return alReceptions;
                
            } else {
                return null;
            }
        }
    }
    
    

    @Override
    public ReceptionDTO searchByName(String Reception) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            receptionRepository.setSession(session);
            session.beginTransaction();
            Reception r = receptionRepository.findByName(Reception);
            session.getTransaction().commit();
            if (r != null) {
                ReceptionDTO receptionDTO = new ReceptionDTO();
                receptionDTO.setrID(r.getrID());
                receptionDTO.setrName(r.getrName());
                receptionDTO.setAddress(r.getAddress());
                receptionDTO.setContact(r.getContact());
                receptionDTO.setrPassword(r.getrPassword());
                return receptionDTO;
            } else {
                return null;
            }
        }
    }

    @Override
    public ReceptionDTO receptionLogin(String usernamde, String password) throws Exception {
     try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            receptionRepository.setSession(session);
            session.beginTransaction();
            Reception r = receptionRepository.getLoginDetails(usernamde,password);
            session.getTransaction().commit();
            if (r != null) {
                ReceptionDTO receptionDTO = new ReceptionDTO();
                receptionDTO.setrID(r.getrID());
                receptionDTO.setrName(r.getrName());
                receptionDTO.setAddress(r.getAddress());
                receptionDTO.setContact(r.getContact());
                receptionDTO.setrPassword(r.getrPassword());
                return receptionDTO;
            } else {
                return null;
            }
        }   
    }
}
