package com.payment.paymentMethods.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.service.PaymentService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    @PostMapping("/{type}")
    public boolean pay(@PathVariable String type, @RequestBody DetailsDTO detailsDTO) {
       return paymentService.makePayment(type, detailsDTO);
    }
    
}
