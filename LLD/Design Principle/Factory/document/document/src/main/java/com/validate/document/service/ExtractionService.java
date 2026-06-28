package com.validate.document.service;

import org.springframework.stereotype.Service;

import com.validate.document.Dto.Doc;
import com.validate.document.factory.ExtrationFactory;
import com.validate.document.interfaces.ExtrationInterface;

@Service
public class ExtractionService {

    private ExtrationFactory extrationFactory;

    public ExtractionService(ExtrationFactory extrationFactory){
        this.extrationFactory = extrationFactory;
    }


    public boolean extractDoc(String type, Doc doc){
        ExtrationInterface extrationInterface = extrationFactory.getExtractionInterface(type);

        return extrationInterface.extractDoc(doc);
    }
}
