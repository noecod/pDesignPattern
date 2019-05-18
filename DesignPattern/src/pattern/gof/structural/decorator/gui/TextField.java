package pattern.gof.structural.decorator.gui;

import lombok.AllArgsConstructor;

// 3. "Core" class with "is a" relationship
@AllArgsConstructor
public class TextField implements IWidget {

    private int width, height;

    @Override
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
