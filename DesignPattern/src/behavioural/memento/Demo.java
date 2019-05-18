package behavioural.memento;

public class Demo {

    public static void main(String[] args) {
        Article article1 = new Article(1, "Article No 1");
        Article article2 = new Article(2, "Article No 2");

        article1.setContent("ABC"); // original content
        System.out.println(article1);

        ArticleMemento memento = article1.createMemento(); // created immutable memento

        article1.setContent("123"); // changed content
        System.out.println(article1);

        article1.restore(memento); // undo change
        System.out.println(article1); // original content

        article2.restore(memento);
    }
}
