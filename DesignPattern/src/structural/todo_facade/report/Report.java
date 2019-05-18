package structural.todo_facade.report;

import lombok.Getter;

@Getter
public class Report {
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;
     
    public void setHeader(ReportHeader header) {
        System.out.println("Setting report header");
        this.header = header;
    }
    
    public void setData(ReportData data) {
        System.out.println("Setting report data");
        this.data = data;
    }
    
    public void setFooter(ReportFooter footer) {
        System.out.println("Setting report footer");
        this.footer = footer;
    }
}
