package structural.adapter.after;

public class Line implements IDrawable {

    private static final LegacyLine ADAPTEE = new LegacyLine();

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        ADAPTEE.draw(x1, y1, x2, y2);
    }
}