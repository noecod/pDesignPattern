package behavioural.strategy.base;

import java.util.List;

import behavioural.strategy.IStrategy;

/**
 * Strategy template for searching a minimum.
 */
public abstract class AbstractStrategySearchMinimum<T> implements IStrategy<T> {

    // Template Method
    @Override
    public List<T> solve(List<T> list, T element) {
        if (searchMinimum(list, element)) {
            return getMinimum();
        }
        return null;
    }

    /**
     * Search somehow a minimum.
     * 
     * @param list with values
     * @return true, if a minimum is found, false otherwise
     */
    public abstract boolean searchMinimum(List<T> list, T element);

    /**
     * The found minimum value.
     * 
     * @return minimum value in a list
     */
    public abstract List<T> getMinimum();
}