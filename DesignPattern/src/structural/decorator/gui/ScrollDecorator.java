package structural.decorator.gui;

// 6. Optional embellishment
public class ScrollDecorator extends AbstractDecorator {

    public ScrollDecorator(IWidget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println("  ScrollDecorator");
    }
}