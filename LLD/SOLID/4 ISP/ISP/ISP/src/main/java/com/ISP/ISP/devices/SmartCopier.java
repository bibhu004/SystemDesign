package com.ISP.ISP.devices;

import org.springframework.stereotype.Component;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.interfaces.Faxable;
import com.ISP.ISP.interfaces.Printable;
import com.ISP.ISP.interfaces.Scannable;

@Component
public class SmartCopier implements Printable, Scannable, Faxable{

    @Override
    public DOC print(DOC doc){
        System.out.println(
            "Printing using Smart Printer");
            doc.setData("Printing using Smart Printer");
        return doc;
    }

    @Override
    public DOC scan(DOC doc){
        System.out.println(
            "Scaning using Smart Printer");
        return doc;
    }

    @Override
    public boolean fax(DOC doc){
        System.out.println(
            "Faxing using Smart Printer");
        //logic for faxing
        return true;
    }

}
