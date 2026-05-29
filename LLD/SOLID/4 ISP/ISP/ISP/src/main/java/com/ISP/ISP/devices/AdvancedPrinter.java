package com.ISP.ISP.devices;

import org.springframework.stereotype.Component;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.interfaces.Printable;
import com.ISP.ISP.interfaces.Scannable;

@Component
public class AdvancedPrinter implements Printable, Scannable{

    @Override
    public DOC print(DOC doc){
        System.out.println(
            "Printing using Adv Printer");
            doc.setData("Printing using ADV Printer");
        return doc;
    }

    @Override
    public DOC scan(DOC doc){
        System.out.println(
            "Scaning using ADV Printer");
        return doc;
    }

}
