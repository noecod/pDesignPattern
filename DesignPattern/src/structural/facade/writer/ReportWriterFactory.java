package structural.facade.writer;

import structural.facade.IReportWriter;
import structural.facade.ReportType;

public class ReportWriterFactory {

    private ReportWriterFactory() {
        // hide
    }

    public static IReportWriter getReportWriter(ReportType type) {
        switch (type) {
        case HTML:
            return new ReportWriterHTML();
        case TEXT:
            return new ReportWriterText();
        default:
            return null;
        }
    }
}
