package com.ISP.ISP.service;

import org.springframework.stereotype.Service;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.interfaces.Printable;
import com.ISP.ISP.registry.PrinterRegistry;

@Service
public class PrintService {

    private final PrinterRegistry registry;

    public PrintService(PrinterRegistry registry){
        this.registry = registry;
    }


    public DOC printDocument(String printerType, DOC doc){
        Printable printer = registry.getPrinter(printerType);
        return printer.print(doc);
    }
}
