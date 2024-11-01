package behavioural.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {

    private long id;
    private String description;
    private float price;
}
