package com.validate.document.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.validate.document.interfaces.ExtrationInterface;

@Component
public class ExtrationFactory {


    Map<String, ExtrationInterface> extrationInterfaces = new HashMap<>();

    public ExtrationFactory(List<ExtrationInterface> extrationInterfaces){
        for(ExtrationInterface extrationInterface : extrationInterfaces){
            this.extrationInterfaces.put(extrationInterface.getClass().getSimpleName(), extrationInterface);
        }
    }

    public ExtrationInterface getExtractionInterface(String type){
        return extrationInterfaces.get(type);
    }
}
