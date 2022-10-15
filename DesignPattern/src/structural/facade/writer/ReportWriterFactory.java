package structural.facade.writer;

import structural.facade.IReportWriter;
import structural.facade.ReportType;

public class ReportWriterFactory {

    private ReportWriterFactory() {
        // hide
    }

    public static IReportWriter getReportWriter(ReportType type) {
        return switch (type) {
            case HTML -> new ReportWriterHTML();
            case TEXT -> new ReportWriterText();
        };
    }
}
