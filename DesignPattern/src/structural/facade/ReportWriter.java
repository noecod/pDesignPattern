package structural.facade;

import structural.todo_facade.report.Report;

public class ReportWriter {
    public void writeHtmlReport(Report report, String location) {
        System.out.println("HTML Report written");
         
        //implementation
    }
     
    public void writePdfReport(Report report, String location) {
        System.out.println("Pdf Report written");
         
        //implementation
    }
}
