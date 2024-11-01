package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySolution;

class SumUpIntegerListStrategy extends AbstractStrategySolution<Integer> {

    private Integer result;

    @Override
    public boolean findSolutions(List<Integer> list, Integer __) {
        result = list.stream().reduce(0, (a,b) -> a + b);
        return true;
    }

    @Override
    public List<Integer> getSolutions() {
        return List.of(result);
    }
}
