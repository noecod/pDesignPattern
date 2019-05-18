package structural.decorator.gui;

public class Demo {

    public static void main(String[] args) {
        // 8. Client has the responsibility to compose desired configurations
        IWidget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget.draw();
    }
}
