package structural.decorator.gui;

import lombok.AllArgsConstructor;

// 2. Second level base class with "isa" relationship
@AllArgsConstructor
abstract class AbstractDecorator implements IWidget {

    // 4. "has a" relationship
    private final IWidget widget;

    // 5. Delegation
    @Override
    public void draw() {
        widget.draw();
    }
}