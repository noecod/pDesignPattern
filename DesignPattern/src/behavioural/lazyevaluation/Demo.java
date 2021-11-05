package behavioural.lazyevaluation;

public class Demo {

    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
    }

    public static void example1() {
        Lazy<Integer, Boolean> lazyEven = Lazy.of(i -> {
            System.out.println("calculating ...");
            return i % 2 == 0;
        });

        show1(4, lazyEven.apply(4));
        show1(5, lazyEven.apply(5));
        show1(19, lazyEven.apply(19));
        show1(5, lazyEven.apply(5));
        show1(19, lazyEven.apply(19));
    }

    public static void show1(int num, boolean result) {
        System.out.println("result for " + num + ": " + result);
    }

    public static void example2() {
        show2(34, 55);
        show2(2, 3);
        show2(7, 3);
        show2(2, 3);
        show2(34, 55);
        show2(7, 3);
        show2(1, 3);
        show2(2, 3);
    }

    public static void show2(int x, int y) {
        System.out.println("result for (" + x + ", " + y + "): " + ComplexCalculation.calc(x, y));
    }
}

