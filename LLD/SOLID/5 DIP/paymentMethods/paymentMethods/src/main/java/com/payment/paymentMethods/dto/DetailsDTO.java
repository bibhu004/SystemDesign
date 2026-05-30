package com.payment.paymentMethods.dto;

import lombok.Data;

@Data
public class DetailsDTO {
    
    private long senderAccNo;
    private long recieverAccNo;
    private double amount;
}
