package com.ISP.ISP.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ISP.ISP.interfaces.Printable;

@Component
public class PrinterRegistry {


    private Map<String, Printable> printers = new HashMap<>();

    public PrinterRegistry(List<Printable> printerList){
        for(Printable printer: printerList){
            printers.put(printer.getClass().getSimpleName(), printer);
            System.out.println("getSimpleName - " + printer.getClass().getSimpleName());
        }
    }

    public Printable getPrinter(String type){
        return printers.get(type);
    }
}
