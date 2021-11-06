package creational.singleton;

public class Demo {

    public static void main(String[] args) {
        Singleton s0 = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        show(s0);
        show(s1);

        FileLogger l0 = FileLogger.getFileLogger();
        FileLogger l1 = FileLogger.getFileLogger();

        show(l0);
        show(l1);
    }

    public static void show(Object o) {
        System.out.print("singleton (class " + o.getClass().getSimpleName() + "): ");
        System.out.println(o);
    }

}
