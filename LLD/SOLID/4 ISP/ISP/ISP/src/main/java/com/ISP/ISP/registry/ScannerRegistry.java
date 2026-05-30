package com.ISP.ISP.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ISP.ISP.interfaces.Scannable;

@Component
public class ScannerRegistry {


    Map<String, Scannable> scanners = new HashMap<>();

    public ScannerRegistry(List<Scannable> scanners){
        for(Scannable scanner : scanners){
            this.scanners.put(scanner.getClass().getSimpleName(), scanner);
        }
    }

    public Scannable getScanner(String type){
        return scanners.get(type);
    }
}
