package com.validate.document.controlller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validate.document.Dto.Doc;
import com.validate.document.service.ValidationService;

@RestController
@RequestMapping("/validation")
public class ValidationController {

    private ValidationService validationService;

    public ValidationController(ValidationService validationService){
        this.validationService = validationService;
    }

    @PostMapping("/{type}")
    public boolean validate(@PathVariable String type, @RequestBody Doc doc){
        return validationService.validateDocument(type, doc);
    }
}
