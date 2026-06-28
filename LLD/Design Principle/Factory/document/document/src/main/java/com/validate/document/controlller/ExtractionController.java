package com.validate.document.controlller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validate.document.Dto.Doc;
import com.validate.document.service.ExtractionService;

@RestController
@RequestMapping("/extract")
public class ExtractionController {

    private ExtractionService extractionService;

    public ExtractionController(ExtractionService extractionService){
        this.extractionService = extractionService;
    }

    @PostMapping("/{type}")
    public boolean extract(@PathVariable String type, @RequestBody Doc doc){
        return extractionService.extractDoc(type, doc);
    }
}
