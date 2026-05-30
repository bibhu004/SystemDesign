package com.payment.paymentMethods.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.payment.paymentMethods.interfaces.Refundable;

@Component
public class RefundRegistry {

    
    private Map<String, Refundable> refundMethods = new HashMap<>();

    public RefundRegistry(List<Refundable> refundMethods){
        for(Refundable refundMethod : refundMethods){
            this.refundMethods.put(refundMethod.getClass().getSimpleName(), refundMethod);
        }
    }

    public Refundable getRefundMethod(String type){
        return refundMethods.get(type);
    }

}
