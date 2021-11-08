package structural.memoizedevaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Memoization evaluation implemented in Java.
 *
 * @param <I> input type
 * @param <R> result type
 */
public class Memoizer<I, R> {

    private final Function<I, R> function;
    private Map<I, R> cache = new HashMap<>();

    private Memoizer(Function<I, R> f) {
        function = f;
    }

    public R apply(I input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        } else {
            R result = function.apply(input);
            cache.put(input, result);
            return result;
        }
    }

    public static <I, R> Memoizer<I, R> of(Function<I, R> function) {
        return new Memoizer<>(function);
    }
}
