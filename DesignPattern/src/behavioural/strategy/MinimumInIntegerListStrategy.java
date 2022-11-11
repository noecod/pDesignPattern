package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySearchMinimum;

/**
 * Search a minimum value smaller than the reference element.
 */
class MinimumInIntegerListStrategy extends AbstractStrategySearchMinimum<Integer> {

    private Integer result;

    @Override
    public boolean searchMinimum(List<Integer> list, Integer element) {
        result = Integer.MAX_VALUE;
        if (list == null || list.isEmpty()) {
            return false;
        }
        result = list.stream().mapToInt(v -> v).min().orElse(Integer.MAX_VALUE);
        return (result < element);
    }

    /**
     * Returns the minimum found value.
     */
    @Override
    public List<Integer> getMinimum() {
        return List.of(result);
    }
}
