package structural.facade.writer;

import structural.facade.IReportWriter;
import structural.facade.report.Report;

public class ReportWriterHTML implements IReportWriter {

    public void write(Report report, String location) {
        System.out.println("\nHTML Report:");
        System.out.printf("\n<h1>%s</h1>", report.getHeader().mainTitle());
        System.out.printf("\n<p>%s</p>", report.getData().text());
        System.out.println();
        System.out.println();
    }
}

