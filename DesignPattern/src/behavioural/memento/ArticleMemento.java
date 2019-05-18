package behavioural.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The memento design pattern is also known as snapshot pattern. Immutable.
 */
@Getter
@AllArgsConstructor
public class ArticleMemento {

    private final long id;
    private final String title;
    private final String content;
}
