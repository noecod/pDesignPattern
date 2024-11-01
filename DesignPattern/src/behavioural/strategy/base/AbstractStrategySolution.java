package behavioural.strategy.base;

import java.util.List;

import behavioural.strategy.IStrategy;

public abstract class AbstractStrategySolution<T> implements IStrategy<T> {

    // Template Method.
    @Override
    public List<T> solve(List<T> list, T element) {
        if (findSolutions(list, element)) {
            return getSolutions();
        } else {
            return null;
        }
    }

    /**
     * Find solutions for the given strategy.
     *
     * @param list    with values of T.
     * @param element reference element
     * @return true, if a solution is found, false otherwise.
     */
    public abstract boolean findSolutions(List<T> list, T element);

    /**
     * Solution values.
     *
     * @return List with the solution values.
     */
    public abstract List<T> getSolutions();
}
