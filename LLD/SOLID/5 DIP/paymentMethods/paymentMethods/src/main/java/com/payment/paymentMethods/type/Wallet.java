package com.payment.paymentMethods.type;

import org.springframework.stereotype.Component;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.interfaces.Payable;
import com.payment.paymentMethods.interfaces.Refundable;

@Component
public class Wallet implements Payable, Refundable{


    @Override
    public boolean makePayment(DetailsDTO detailsDTO){
        System.out.println("Wallet payment of amount - " + detailsDTO.getAmount() + " to " + detailsDTO.getRecieverAccNo());
        return true;
    }


    @Override
    public boolean getRefund(DetailsDTO detailsDTO){
        System.out.println("Wallet Refund initiated for amount - " + detailsDTO.getAmount() + " for " + detailsDTO.getSenderAccNo());
        return true;
    }

}
