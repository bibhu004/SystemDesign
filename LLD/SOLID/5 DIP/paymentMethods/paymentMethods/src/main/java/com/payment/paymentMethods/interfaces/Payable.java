package com.payment.paymentMethods.interfaces;

import com.payment.paymentMethods.dto.DetailsDTO;

public interface Payable {

    public boolean makePayment(DetailsDTO detailsDTO);

}
