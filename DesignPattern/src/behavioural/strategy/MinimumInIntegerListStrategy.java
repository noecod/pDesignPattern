package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySearchMinima;

/**
 * Search a minimum value smaller than the reference element.
 */
class MinimumInIntegerListStrategy extends AbstractStrategySearchMinima<Integer> {

    private Integer result = Integer.MAX_VALUE;

    @Override
    public boolean searchMinima(List<Integer> list, Integer element) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        result = list.stream().mapToInt(v -> v).min().orElse(Integer.MAX_VALUE);
        return (result < element);
    }

    /**
     * Returns the found minimum value.
     */
    @Override
    public List<Integer> getMinima() {
        return List.of(result);
    }
}
