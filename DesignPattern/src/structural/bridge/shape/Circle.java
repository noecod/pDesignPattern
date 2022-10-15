package structural.bridge.shape;

import lombok.AllArgsConstructor;
import structural.bridge.IDrawingAPI;
import structural.bridge.IShape;

@AllArgsConstructor
public class Circle implements IShape {

    private final double x;
    private final double y;
    private double radius;
    private final IDrawingAPI drawingAPI;

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
