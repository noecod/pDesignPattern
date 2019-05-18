package structural.todo_facade.report;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportHeader {

    private String mainTitle;
    private String subTitle;
    private String author;
}
