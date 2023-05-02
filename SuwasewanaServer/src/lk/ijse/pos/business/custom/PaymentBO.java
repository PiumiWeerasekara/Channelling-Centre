/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.PaymentDTO;

/**
 *
 * @author DEll
 */
public interface PaymentBO extends SuperBO{
    public boolean addPayment(PaymentDTO paymentDTO)throws Exception;
    public boolean updatePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean deletePayment(String id)throws Exception;
    public List<PaymentDTO> getAllPayment()throws Exception;
}
