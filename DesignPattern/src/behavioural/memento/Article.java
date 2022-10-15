package behavioural.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {

    private final long id; // not changeable
    private String title;
    private String content;

    public Article(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public ArticleMemento createMemento() {
        return new ArticleMemento(id, title, content);
    }

    public void restore(ArticleMemento memento) {
        if (getId() == memento.id()) {
            title = memento.title();
            content = memento.content();
        } else {
            // throw an exception
            System.out.println("can't restore over article with different id. This id: " +
                    getId() +
                    ", Memento: " +
                    memento.id());
        }
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
    }
}
