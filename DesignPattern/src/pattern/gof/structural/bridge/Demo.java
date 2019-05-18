package pattern.gof.structural.bridge;

import java.util.ArrayList;
import java.util.List;

import pattern.gof.structural.bridge.api.LinuxDrawingAPI;
import pattern.gof.structural.bridge.api.WindowsDrawingAPI;
import pattern.gof.structural.bridge.shape.Circle;
import pattern.gof.structural.bridge.shape.Rectangle;

public class Demo {

    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<>();

        shapes.add(new Circle(1, 2, 3, new WindowsDrawingAPI()));
        shapes.add(new Circle(5, 7, 11, new LinuxDrawingAPI()));
        shapes.add(new Rectangle(1, 2, 7, 11, new WindowsDrawingAPI()));
        shapes.add(new Rectangle(5, 7, 10, 12, new LinuxDrawingAPI()));

        shapes.forEach(s -> s.draw());
    }
}
