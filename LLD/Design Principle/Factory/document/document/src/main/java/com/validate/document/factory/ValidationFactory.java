package com.validate.document.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.validate.document.interfaces.ValidationInterface;

@Component
public class ValidationFactory {

    Map<String, ValidationInterface> validationInterfaces = new HashMap<>();  

    public ValidationFactory(List<ValidationInterface> validationInterfaces){
        for(ValidationInterface validationInterface: validationInterfaces){
            this.validationInterfaces.put(validationInterface.getClass().getSimpleName(), validationInterface);
        }
    }


    public ValidationInterface getValidationProcessor(String type){
        return validationInterfaces.get(type);
    }

}
