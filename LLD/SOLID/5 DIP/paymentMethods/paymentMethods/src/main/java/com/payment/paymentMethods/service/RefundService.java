package com.payment.paymentMethods.service;

import org.springframework.stereotype.Service;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.interfaces.Refundable;
import com.payment.paymentMethods.registry.RefundRegistry;

@Service
public class RefundService {

    private RefundRegistry refundRegistry;

    public RefundService(RefundRegistry refundRegistry){
        this.refundRegistry = refundRegistry;
    }


    public boolean getRefund(String type, DetailsDTO detailsDTO){
        Refundable refund = refundRegistry.getRefundMethod(type);
        return refund.getRefund(detailsDTO);
    }

}
