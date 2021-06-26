package structural.facade.writer;

import structural.facade.IReportWriter;
import structural.facade.report.Report;

public class ReportWriterText implements IReportWriter {

    public void write(Report report, String location) {
        System.out.println("\nText Report:");
        System.out.println(report.getHeader().mainTitle() + " from " + report.getHeader().author());
        System.out.println(report.getData().text());
        System.out.println(report.getFooter().date());
        System.out.println();
    }
}



