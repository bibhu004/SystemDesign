package com.ISP.ISP.service;

import org.springframework.stereotype.Service;

import com.ISP.ISP.entity.DOC;
import com.ISP.ISP.interfaces.Scannable;
import com.ISP.ISP.registry.ScannerRegistry;

@Service
public class ScannerService {


    public ScannerRegistry scannerRegistry;


    public ScannerService(ScannerRegistry scannerRegistry){
        this.scannerRegistry = scannerRegistry;
    }

    public DOC scanDocument(String scannerType, DOC doc){
        Scannable scanner = scannerRegistry.getScanner(scannerType);
        return scanner.scan(doc);
    }
}
