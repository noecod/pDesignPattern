package pattern.gof.structural.adapter.after;

public class Rectangle implements IDrawable {

    private LegacyRectangle adaptee = new LegacyRectangle();

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        this.adaptee.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
    }
}