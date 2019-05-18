package structural.todo_facade;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataSource {
    private String mainTitle;
    private String subTitle;
    private String author;
    
    private String text;
}