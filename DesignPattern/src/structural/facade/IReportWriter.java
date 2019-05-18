package structural.facade;

import structural.facade.report.Report;

public interface IReportWriter {

    void write(Report report, String location);
}
