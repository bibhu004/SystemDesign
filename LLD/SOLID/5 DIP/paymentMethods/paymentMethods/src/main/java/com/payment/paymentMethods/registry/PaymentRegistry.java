package com.payment.paymentMethods.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.payment.paymentMethods.interfaces.Payable;

@Component
public class PaymentRegistry {


    private Map<String, Payable> paymentMethods = new HashMap<>();

    public PaymentRegistry(List<Payable> paymentMethods){
        for(Payable paymentMethod : paymentMethods){
            this.paymentMethods.put(paymentMethod.getClass().getSimpleName(), paymentMethod);
        }
    }

    public Payable getPaymetMethod(String type){
        return paymentMethods.get(type);
    }
}
