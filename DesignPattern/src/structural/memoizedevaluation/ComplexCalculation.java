package structural.memoizedevaluation;

/**
 * Represents a complex and time-consuming calculation.
 */
public class ComplexCalculation {

    private static final Memoizer<Input, Long> memoizedFunction = Memoizer.of(i -> {
        System.out.println("calculating ...");
        return i.x + i.y;
    });

    public static long calc(long x, long y) {
        return memoizedFunction.apply(new Input(x, y));
    }

    // @formatter:off
    record Input(long x, long y) {}
}
