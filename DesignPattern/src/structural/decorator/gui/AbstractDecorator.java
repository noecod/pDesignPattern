package structural.decorator.gui;

// 2. Second level base class with "isa" relationship
abstract class AbstractDecorator implements IWidget {

    // 4. "has a" relationship
    private final IWidget widget;

    public AbstractDecorator(IWidget widget) {
        this.widget = widget;
    }

    // 5. Delegation
    @Override
    public void draw() {
        widget.draw();
    }
}