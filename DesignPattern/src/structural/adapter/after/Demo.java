package structural.adapter.after;

public class Demo {

    public static void main(String[] args) {
        IDrawable[] shapes = { new Line(), new Rectangle() };

        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (IDrawable shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}