package behavioural.lazyevaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Lazy evaluation implemented in Java.
 *
 * @param <I> input type
 * @param <R> result type
 */
public class Lazy<I, R> {

    private final Function<I, R> function;
    private Map<I, R> cache = new HashMap<>();

    private Lazy(Function<I, R> f) {
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

    public static <I, R> Lazy<I, R> of(Function<I, R> function) {
        return new Lazy<>(function);
    }
}
