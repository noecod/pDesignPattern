package behavioural.chainofresponsibility.event;

/**
 * Generic event with payload
 *
 * @param <T>
 */
public interface IEvent<T> {

    T getPayLoad();
}