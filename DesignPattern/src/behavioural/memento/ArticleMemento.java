package behavioural.memento;

/**
 * The memento design pattern is also known as snapshot pattern. Immutable.
 */
public record ArticleMemento(long id, String title, String content) {
}
