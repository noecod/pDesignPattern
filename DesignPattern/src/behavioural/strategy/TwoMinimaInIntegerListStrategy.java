package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySearchMinima;

/**
 * Search two minimum values smaller than the reference element.
 */
class TwoMinimaInIntegerListStrategy extends AbstractStrategySearchMinima<Integer> {

    private Integer minimum1 = Integer.MAX_VALUE;
    private Integer minimum2 = Integer.MAX_VALUE;

    @Override
    public boolean searchMinima(List<Integer> list, Integer element) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (Integer value : list) {
            if (value < minimum1) {
                minimum1 = value;
            } else if (value < minimum2) {
                minimum2 = value;
            }
        }
        return (minimum1 < element) && (minimum2 < element);
    }

    /**
     * Returns the minimum found values.
     */
    @Override
    public List<Integer> getMinima() {
        return List.of(minimum1, minimum2);
    }
}
