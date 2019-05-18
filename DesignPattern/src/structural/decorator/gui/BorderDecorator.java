package structural.decorator.gui;

// 6. Optional embellishment
public class BorderDecorator extends AbstractDecorator {

    public BorderDecorator(IWidget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        // 7. Delegate to base class and add extra stuff
        super.draw();
        System.out.println("  BorderDecorator");
    }
}
