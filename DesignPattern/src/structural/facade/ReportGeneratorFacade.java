package structural.facade;

import java.time.LocalDate;

import structural.facade.report.Report;
import structural.facade.report.ReportData;
import structural.facade.report.ReportFooter;
import structural.facade.report.ReportHeader;
import structural.facade.writer.ReportWriterFactory;

public class ReportGeneratorFacade {

    public static void generateReport(ReportType type, DataSource dataSource, String location) {
        if (type == null || dataSource == null) {
            // throw some exception
            System.out.println("Exception: invalid input");
            return;
        }

        // Create report
        Report report = new Report();

        // Get data from dataSource and set to ReportData object
        report.setHeader(new ReportHeader(dataSource.mainTitle(), dataSource.subTitle(), dataSource.author()));
        report.setFooter(new ReportFooter(LocalDate.now(), "#No#Total"));
        report.setData(new ReportData(dataSource.text()));

        // Write report
        ReportWriterFactory.getReportWriter(type).write(report, location);
    }
}
