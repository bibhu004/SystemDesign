package com.ISP.ISP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.service.PrintService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class PrinterController {


    private final PrintService printService;

    public PrinterController(PrintService printService){
        this.printService = printService;
    }


    @PostMapping("/print/{type}")
    public DOC postMethodName(@PathVariable String type, @RequestBody DOC doc) {
       
        
        return printService.printDocument(type, doc);
    }
    
}
