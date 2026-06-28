package com.report.generation.system.report.generation.system.ReportGenerationApplications;

import com.report.generation.system.report.generation.system.interfaces.ReportGenerator;

public class ExcellGenerator implements ReportGenerator{

    @Override
    public void generateReport(){
        System.out.println("Generating PDF Report");
    }

}
