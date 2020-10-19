package reportHtml;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    public static void main(String[]args){
        String path="C:\\Users\\Cintia Melendrez\\Desktop\\PROYECTO\\build\\reports\\cucumber\\";

        File reportOutPut = new File(path+"finalReport");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration = new Configuration(reportOutPut, "YouTube Test");
        configuration.setBuildNumber("v0010.0");
        configuration.addClassifications("SO", "Windows 10");
        configuration.addClassifications("Owner", "Cintia Melendrez Alaro");
        configuration.addClassifications("Branch", "Cucumber");
        configuration.addClassifications("Type Report", "Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
