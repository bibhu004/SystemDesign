package com.ISP.ISP.devices;

import org.springframework.stereotype.Component;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.interfaces.Printable;

@Component
public class BasicPrinter implements Printable{


    @Override
    public DOC print(DOC doc){
        System.out.println(
            "Printing using Basic Printer");
        doc.setData("Printing using Basic Printer");
        return doc;
    }
}
