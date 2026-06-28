package com.validate.document.docProcessors;

import org.springframework.stereotype.Component;

import com.validate.document.Dto.Doc;
import com.validate.document.interfaces.ExtrationInterface;
import com.validate.document.interfaces.ValidationInterface;

@Component
public class Excel  implements ValidationInterface, ExtrationInterface{

    @Override
    public boolean validate(Doc doc){
        System.out.println("Validating the Excel doc");
        return true;
    }


    @Override
    public boolean extractDoc(Doc doc){
        System.out.println("Extracting the Excel doc");
        return true;
    }

}
