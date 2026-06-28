package com.report.generation.system.report.generation.system.simple_factory;

import org.springframework.stereotype.Component;

import com.report.generation.system.report.generation.system.ReportGenerationApplications.PDFGeneratior;
import com.report.generation.system.report.generation.system.interfaces.ReportGenerator;

@Component
public class ReportGenerationFactory {

    public ReportGenerator generate(String type){
        switch (type) {
            case "PDF":
                return new PDFGeneratior();

            case "Excell":
                return new PDFGeneratior();
  
            case "CSV":
                return new PDFGeneratior();
        
            default:
                 throw new RuntimeException("Unsupported report type: " + type);
        }
    }

}
