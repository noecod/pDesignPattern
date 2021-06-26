package structural.decorator.gui;

// 3. "Core" class with "is a" relationship
public record TextField(int width, int height) implements IWidget {

    @Override
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
