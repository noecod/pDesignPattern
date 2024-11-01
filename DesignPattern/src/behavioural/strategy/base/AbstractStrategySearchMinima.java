package behavioural.strategy.base;

import java.util.List;

import behavioural.strategy.IStrategy;

/**
 * Strategy template for searching one or more minima.
 */
public abstract class AbstractStrategySearchMinima<T> implements IStrategy<T> {

    // Template Method
    @Override
    public List<T> solve(List<T> list, T element) {
        if (searchMinima(list, element)) {
            return getMinima();
        }
        return null;
    }

    /**
     * Search somehow one or more minima.
     *
     * @param list    with values
     * @param element search one or more minima smaller than a given element
     * @return true, if a minimum was found, false otherwise
     */
    public abstract boolean searchMinima(List<T> list, T element);

    /**
     * The found minimum values.
     *
     * @return minimum values
     */
    public abstract List<T> getMinima();
}