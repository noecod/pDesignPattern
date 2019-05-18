package pattern.gof.structural.bridge.api;

import pattern.gof.structural.bridge.IDrawingAPI;

/**
 * Concrete implementor for Windows systems.
 */
public class WindowsDrawingAPI implements IDrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("WindowsDrawingAPI.circle at %f:%f radius %f\n", x, y, radius);
    }

    @Override
    public void drawRectangle(double x1, double y1, double x2, double y2) {
        System.out.printf("WindowsDrawingAPI.rectangle at %f:%f; %f:%f\n", x1, y1, x2, y2);
    }
}
