package pattern.gof.structural.bridge.api;

import pattern.gof.structural.bridge.IDrawingAPI;

/**
 * Concrete implementor for Linux systems.
 */
public class LinuxDrawingAPI implements IDrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("LinuxDrawingAPI.circle at %f:%f radius %f\n", x, y, radius);
    }

    @Override
    public void drawRectangle(double x1, double y1, double x2, double y2) {
        System.out.printf("LinuxDrawingAPI.rectangle at %f:%f; %f:%f\n", x1, y1, x2, y2);
    }
}
