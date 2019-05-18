package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySolution;

class SumUpIntegerListStrategie extends AbstractStrategySolution<Integer> {

    private Integer result;

    @Override
    public boolean findSolution(List<Integer> list, Integer element) {
        result = 0;
        for (Integer value : list) {
            result += value;
        }
        return true;
    }

    @Override
    public List<Integer> getSolution() {
        return List.of(result);
    }
}
