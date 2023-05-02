/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.PaymentDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface PaymentService extends SuperService{
    public boolean addPayment(PaymentDTO paymentDTO)throws Exception;
    public boolean updatePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean deletePayment(String patientID)throws Exception;
    public List<PaymentDTO> getAllPayments()throws Exception;
    
}
