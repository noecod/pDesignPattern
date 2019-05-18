package pattern.gof.structural.bridge.shape;

import structural.bridge.IDrawingAPI;
import structural.bridge.IShape;

public class Circle implements IShape {

    private double x, y, radius;
    private IDrawingAPI drawingAPI;

    public Circle(double x, double y, double radius, IDrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    // Implementation specific
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // Abstraction specific
    @Override
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }
}
