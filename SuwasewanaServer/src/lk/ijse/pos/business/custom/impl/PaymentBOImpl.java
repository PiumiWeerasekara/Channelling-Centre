/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.custom.PaymentBO;
import lk.ijse.pos.dto.PaymentDTO;
import lk.ijse.pos.entity.Payment;
import lk.ijse.pos.repository.RepositoryFactory;
import lk.ijse.pos.repository.customm.PaymentRepository;
import lk.ijse.pos.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public class PaymentBOImpl implements PaymentBO{
    
    private PaymentRepository paymentRepository;

    public PaymentBOImpl() {
        this.paymentRepository=(PaymentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.PAYMENT);
        
    }

    @Override
    public boolean addPayment(PaymentDTO paymentDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            paymentRepository.setSession(session);
                Payment p = new Payment(paymentDTO.getAappointmentID(),
                    paymentDTO.getAmount());
            boolean result = paymentRepository.save(p);
            session.getTransaction().commit();
            System.out.println("BO");

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePayment(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> getAllPayment() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            paymentRepository.setSession(session);
            session.beginTransaction();
            List<Payment> payments = paymentRepository.findAll();
            session.getTransaction().commit();
            if (payments != null) {
                List<PaymentDTO> alPayments = new ArrayList<>();
                for (Payment payment : payments) {
                    PaymentDTO dto = new PaymentDTO(payment.getAppointmentID(),
                            payment.getAmount());
                    alPayments.add(dto);
                    System.out.println("RBo");
                }
                return alPayments;
                
            } else {
                return null;
            }
        }
    }
    
    
}
