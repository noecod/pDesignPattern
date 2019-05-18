package behavioural.strategy.base;

import java.util.List;

import behavioural.strategy.IStrategy;

/**
 *
 */
public abstract class AbstractStrategySolution<T> implements IStrategy<T> {

    // Template Method.
    @Override
    public List<T> solve(List<T> list, T element) {
        if (findSolution(list, element)) {
            return getSolution();
        } else {
            return null;
        }
    }

    /**
     * * Find a solution for the given strategy.
     * 
     * @param list    with values of T.
     * @param element reference element
     * @return true, if a solution is found, false otherwise.
     */
    public abstract boolean findSolution(List<T> list, T element);

    /**
     * Solution values.
     * 
     * @return List with the solution values.
     */
    public abstract List<T> getSolution();
}
