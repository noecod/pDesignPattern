package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySolution;

class SumUpIntegerListStrategy extends AbstractStrategySolution<Integer> {

    private Integer result;

    @Override
    public boolean findSolution(List<Integer> list, Integer element) {
        result = list.stream().reduce(0, (a,b) -> a + b);
        return true;
    }

    @Override
    public List<Integer> getSolution() {
        return List.of(result);
    }
}
