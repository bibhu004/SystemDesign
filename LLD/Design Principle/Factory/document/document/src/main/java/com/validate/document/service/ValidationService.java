package com.validate.document.service;

import org.springframework.stereotype.Service;

import com.validate.document.Dto.Doc;
import com.validate.document.factory.ValidationFactory;
import com.validate.document.interfaces.ValidationInterface;

@Service
public class ValidationService {


    private ValidationFactory validationFactory;


    public ValidationService(ValidationFactory validationFactory){
        this.validationFactory = validationFactory;
    }


    public boolean validateDocument(String type, Doc doc){
        ValidationInterface validationInterface = validationFactory.getValidationProcessor(type);

        return validationInterface.validate(doc);
    }
}
