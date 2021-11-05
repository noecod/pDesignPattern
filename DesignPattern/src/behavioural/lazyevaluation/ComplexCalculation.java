package behavioural.lazyevaluation;

public class ComplexCalculation {

    private static final Lazy<Input, Integer> lazyCompute = Lazy.of(i -> {
        System.out.println("complex and long lasting calculation");
        return i.x + i.y; // not really complex and long lasting  ;-)
    });

    public static int calc(int x, int y) {
        return lazyCompute.apply(new Input(x, y));
    }

    // @formatter:off
    record Input(int x, int y) {}
}
