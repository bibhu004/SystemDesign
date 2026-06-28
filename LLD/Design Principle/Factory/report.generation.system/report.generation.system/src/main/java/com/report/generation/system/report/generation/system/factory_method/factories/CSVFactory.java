package com.report.generation.system.report.generation.system.factory_method.factories;

import com.report.generation.system.report.generation.system.ReportGenerationApplications.CSVGenerator;
import com.report.generation.system.report.generation.system.factory_method.facotyr_inteface.reportFactory;
import com.report.generation.system.report.generation.system.interfaces.ReportGenerator;

public class CSVFactory implements reportFactory{

    @Override
    public ReportGenerator createGenerator(){
        return new CSVGenerator();
    }

}
