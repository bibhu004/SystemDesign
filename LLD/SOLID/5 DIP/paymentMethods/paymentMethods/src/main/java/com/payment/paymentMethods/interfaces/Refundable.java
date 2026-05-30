package com.payment.paymentMethods.interfaces;

import com.payment.paymentMethods.dto.DetailsDTO;

public interface Refundable {

    public boolean getRefund(DetailsDTO detailsDTO);

}
