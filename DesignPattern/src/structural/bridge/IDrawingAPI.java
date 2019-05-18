package structural.bridge;

/**
 * Implementor.
 */
public interface IDrawingAPI {

    void drawCircle(double x, double y, double radius);

    void drawRectangle(double x1, double y1, double x2, double y2);
}
