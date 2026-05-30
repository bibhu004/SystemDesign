package com.payment.paymentMethods.service;

import org.springframework.stereotype.Service;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.interfaces.Payable;
import com.payment.paymentMethods.registry.PaymentRegistry;

@Service
public class PaymentService {

    private PaymentRegistry paymentRegistry;

    public PaymentService(PaymentRegistry paymentRegistry){
        this.paymentRegistry = paymentRegistry;
    }


    public boolean makePayment(String type, DetailsDTO detailsDTO){
        Payable pay = paymentRegistry.getPaymetMethod(type);
        return pay.makePayment(detailsDTO);
    }

}
