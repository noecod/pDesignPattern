package structural.facade;

import java.time.LocalDate;

import structural.todo_facade.report.Report;
import structural.todo_facade.report.ReportData;
import structural.todo_facade.report.ReportFooter;
import structural.todo_facade.report.ReportHeader;

public class ReportGeneratorFacade {

    public static void generateReport(ReportType type, DataSource dataSource, String location) {
        if (type == null || dataSource == null) {
            // throw some exception
            System.out.println("Exception: invalid input");
        }
        
        // Create report
        Report report = new Report();

        // Get data from dataSource and set to ReportData object
        report.setHeader(new ReportHeader(dataSource.getMainTitle(), dataSource.getSubTitle(), dataSource.getAuthor()));
        report.setFooter(new ReportFooter(LocalDate.now(), "#No#Total"));
        report.setData(new ReportData(dataSource.getText()));

        // Write report
        ReportWriter writer = new ReportWriter();
        switch (type) {
        case HTML:
            writer.writeHtmlReport(report, location);
            break;

        case PDF:
            writer.writePdfReport(report, location);
            break;
        }
    }
}
