package pattern.gof.structural.bridge.shape;

import pattern.gof.structural.bridge.IDrawingAPI;
import pattern.gof.structural.bridge.IShape;

public class Rectangle implements IShape {

    private double x1, y1, x2, y2;
    private IDrawingAPI drawingAPI;

    public Rectangle(double x1, double y1, double x2, double y2, IDrawingAPI drawingAPI) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.drawingAPI = drawingAPI;
    }

    // Implementation specific
    @Override
    public void draw() {
        drawingAPI.drawRectangle(x1, y1, x2, y2);
    }

    // Abstraction specific
    @Override
    public void resizeByPercentage(double pct) {
        // some calculations
    }
}
