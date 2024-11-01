package behavioural.strategy;

import java.util.List;

/**
 * Interface for various strategy algorithms.
 */
public interface IStrategy<T> {

    /**
     * Solver strategy for a list and a reference element
     *
     * @param list    input list
     * @param element reference element
     * @return one or more solutions
     */
    List<T> solve(List<T> list, T element);
}
