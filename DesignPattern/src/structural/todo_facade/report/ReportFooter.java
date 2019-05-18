package structural.todo_facade.report;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportFooter {

    private LocalDate Date;
    private String pageNumberLayout;
}
