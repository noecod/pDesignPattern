package creational.factorymethod;

public class Demo {

    public static void main(String[] args) {
        System.out.println("active system configuration");
        System.out.println("  title: " + SystemConfig.getTitle());
        System.out.println("  description: " + SystemConfig.getDescription());
        System.out.println("  height: " + SystemConfig.getHeight());
        System.out.println("  width: " + SystemConfig.getWidth());
        System.out.println("  number of elements: " + SystemConfig.getNumberOfElements());
    }
}
