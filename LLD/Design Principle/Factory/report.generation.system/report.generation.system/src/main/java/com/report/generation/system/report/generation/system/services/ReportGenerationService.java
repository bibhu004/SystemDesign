package com.report.generation.system.report.generation.system.services;

import org.springframework.stereotype.Service;

import com.report.generation.system.report.generation.system.interfaces.ReportGenerator;
import com.report.generation.system.report.generation.system.simple_factory.ReportGenerationFactory;

@Service
public class ReportGenerationService {

    private ReportGenerationFactory reportGenerationFactory;

    public ReportGenerationService(ReportGenerationFactory reportGenerationFactory){
        this.reportGenerationFactory = reportGenerationFactory;
    }


    public void generateReport(String type){
        ReportGenerator reportGenerator = reportGenerationFactory.generate(type);
        reportGenerator.generateReport();
    }
}
