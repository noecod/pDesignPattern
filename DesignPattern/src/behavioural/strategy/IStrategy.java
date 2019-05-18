package behavioural.strategy;

import java.util.List;

/**
 * Interface for various strategy algorithms.
 */
public interface IStrategy<T> {

    List<T> solve(List<T> list, T element);
}
