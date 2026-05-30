package com.payment.paymentMethods.type;

import org.springframework.stereotype.Component;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.interfaces.Payable;


@Component
public class NetBanking  implements Payable {


    @Override
    public boolean makePayment(DetailsDTO detailsDTO){
        System.out.println("NETBANKING payment of amount - " + detailsDTO.getAmount() + " to " + detailsDTO.getRecieverAccNo());
        return true;
    }

}
