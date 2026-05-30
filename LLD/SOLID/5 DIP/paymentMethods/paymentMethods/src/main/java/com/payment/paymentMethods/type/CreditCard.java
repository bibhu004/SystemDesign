package com.payment.paymentMethods.type;

import org.springframework.stereotype.Component;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.enums.PaymentMethodType;
import com.payment.paymentMethods.interfaces.Payable;
import com.payment.paymentMethods.interfaces.Refundable;

@Component
public class CreditCard implements Payable, Refundable{

    // private PaymentMethodType paymentMethodType;

    // public PaymentMethodType getMethodType(){
    //     return paymentMethodType.CC;
    // }


    @Override
    public boolean makePayment(DetailsDTO detailsDTO){
        System.out.println("CreditCard payment of amount - " + detailsDTO.getAmount() + " to " + detailsDTO.getRecieverAccNo());
        return true;
    }


    @Override
    public boolean getRefund(DetailsDTO detailsDTO){
        System.out.println("CreditCard Refund initiated for amount - " + detailsDTO.getAmount() + " for " + detailsDTO.getSenderAccNo());
        return true;
    }

}
