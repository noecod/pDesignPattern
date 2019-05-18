package structural.facade.writer;

import structural.facade.IReportWriter;
import structural.facade.report.Report;

public class ReportWriterText implements IReportWriter {
    public void write(Report report, String location) {
        System.out.println("\nText Report:");
        System.out.println(report.getHeader().getMainTitle() + " from " + report.getHeader().getAuthor());
        System.out.println(report.getData().getText());
        System.out.println(report.getFooter().getDate());
        System.out.println();
    }
}



