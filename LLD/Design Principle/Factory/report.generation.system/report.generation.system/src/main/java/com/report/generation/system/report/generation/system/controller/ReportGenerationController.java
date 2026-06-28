package com.report.generation.system.report.generation.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.generation.system.report.generation.system.services.ReportGenerationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/report")
public class ReportGenerationController {

    private ReportGenerationService reportGenerationService;

    public ReportGenerationController(ReportGenerationService reportGenerationService){
        this.reportGenerationService = reportGenerationService;
    }


    @GetMapping("/generate/{type}")
    public String getMethodName(@PathVariable String type) {
        reportGenerationService.generateReport(type);
        return "Report Generated";
    }
    
}
