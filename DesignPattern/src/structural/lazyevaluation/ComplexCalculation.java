package structural.lazyevaluation;

/**
 * Represents a complex and time-consuming calculation.
 */
public class ComplexCalculation {

    private static final Lazy<Input, Long> lazyCompute = Lazy.of(i -> {
        System.out.println("calculating ...");
        return i.x + i.y;
    });

    public static long calc(long x, long y) {
        return lazyCompute.apply(new Input(x, y));
    }

    // @formatter:off
    record Input(long x, long y) {}
}
