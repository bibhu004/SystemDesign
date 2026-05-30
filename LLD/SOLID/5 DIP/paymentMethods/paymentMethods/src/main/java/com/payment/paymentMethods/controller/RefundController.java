package com.payment.paymentMethods.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payment.paymentMethods.dto.DetailsDTO;
import com.payment.paymentMethods.service.RefundService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/refund")
public class RefundController {

    private RefundService refundService;

    public RefundController(RefundService refundService){
        this.refundService = refundService;
    }


    @PostMapping("/{type}")
    public boolean refund(@PathVariable String type, @RequestBody DetailsDTO detailsDTO) {
        
        
        return refundService.getRefund(type, detailsDTO);
    }
    
}
