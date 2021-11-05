package behavioural.lazyevaluation;

import java.util.function.Supplier;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sum implements Supplier<Long> {

    private long arg1;
    private long arg2;

    @Override
    public Long get() {
        System.out.println("very expensive calculation");
        return arg1 + arg2;
    }
}
