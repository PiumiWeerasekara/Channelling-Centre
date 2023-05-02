/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.AdminBO;
import lk.ijse.pos.dto.AdminDTO;
import lk.ijse.pos.entity.Admin;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.AdminRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class AdminBOImpl implements AdminBO {

    private AdminRepository adminRepository;

    public AdminBOImpl(){
        this.adminRepository = (AdminRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ADMIN);
    }

    @Override
    public List<AdminDTO> getAllAdmins() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            adminRepository.setSession(session);
            session.beginTransaction();
            List<Admin> admins = adminRepository.findAll();
            session.getTransaction().commit();
            if (admins != null) {
                List<AdminDTO> alAdmins = new ArrayList<>();
                for (Admin admin : admins) {
                    AdminDTO dto = new AdminDTO(admin.getName(),
                            admin.getPassword());
                    alAdmins.add(dto);
                }
                return alAdmins;

            } else {
                return null;
            }

        }

    }

    @Override
    public boolean addAdmin(AdminDTO adminDTO) throws Exception {
        
        System.out.println("|||||||||||||||||||||");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            adminRepository.setSession(session);
            Admin d = new Admin(adminDTO.getName(),
                    adminDTO.getPassword());
            boolean result = adminRepository.save(d);
            session.getTransaction().commit();
            System.out.println("BO");
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public AdminDTO adminLogin(String usernme, String password) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            adminRepository.setSession(session);
            session.beginTransaction();
            Admin a = adminRepository.getLoginDetails(usernme,password);
            session.getTransaction().commit();
            if (a != null) {
                AdminDTO adminDTO = new AdminDTO();
                adminDTO.setAdID(a.getAdID());
                adminDTO.setName(a.getName());
                adminDTO.setPassword(a.getPassword());
                return adminDTO;
            } else {
                return null;
            }
        }   
    }
}
