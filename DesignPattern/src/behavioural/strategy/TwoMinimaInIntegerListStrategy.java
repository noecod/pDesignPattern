package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySearchMinimum;

/**
 * Search a minimum value smaller than the reference element.
 */
class TwoMinimaInIntegerListStrategy extends AbstractStrategySearchMinimum<Integer> {

    private Integer minimum1;
    private Integer minimum2;

    @Override
    public boolean searchMinimum(List<Integer> list, Integer element) {
        minimum1 = Integer.MAX_VALUE;
        minimum2 = Integer.MAX_VALUE;
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
    public List<Integer> getMinimum() {
        return List.of(minimum1, minimum2);
    }
}
