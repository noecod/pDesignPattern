package structural.todo_facade.report;

public class Demo {

    public static void main(String[] args) throws Exception {
        // TODO fill data source
        ReportGeneratorFacade.generateReport(ReportType.HTML, null, null);
        ReportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}
