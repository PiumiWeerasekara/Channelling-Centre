/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository.custom.impl;

import lk.ijse.pos.entity.Payment;
import lk.ijse.pos.repository.SuperRepositoryImpl;
import lk.ijse.pos.repository.customm.PaymentRepository;

/**
 *
 * @author DEll
 */ 
public class PaymentRepositoryImpl extends SuperRepositoryImpl<Payment, String> implements PaymentRepository{

    public PaymentRepositoryImpl() {
    }
    
    
}
