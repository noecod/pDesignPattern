package structural.bridge.shape;

import lombok.AllArgsConstructor;
import structural.bridge.IDrawingAPI;
import structural.bridge.IShape;

@AllArgsConstructor
public class Rectangle implements IShape {

    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final IDrawingAPI drawingAPI;

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
