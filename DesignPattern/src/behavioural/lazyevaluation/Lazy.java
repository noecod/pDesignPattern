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

    private Lazy(Function<I, R> funct) {
        function = funct;
    }

    public R apply(I inp) {
        R res;
        if (cache.containsKey(inp)) {
            res = cache.get(inp);
        } else {
            res = function.apply(inp);
            cache.put(inp, res);
        }
        return res;
    }

    public static <I, R> Lazy<I, R> of(Function<I, R> function) {
        return new Lazy<>(function);
    }
}
