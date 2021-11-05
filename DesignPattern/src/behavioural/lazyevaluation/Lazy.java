package behavioural.lazyevaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import lombok.Setter;

public class Lazy<T, R> {

    private final Supplier<R> supplier;
    private Map<T, R> cache = new HashMap<>();

    @Setter
    private T input;

    public Lazy(Supplier<R> suppl) {
        supplier = suppl;
    }

    public R get() {
        R result;
        if (cache.containsKey(input)) {
            result = cache.get(input);
        } else {
            result = supplier.get();
            cache.put(input, result);
        }
        return result;
    }
}
