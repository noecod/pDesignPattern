package behavioural.chainofresponsibility.event;

public interface IEvent<T> {

    T getPayLoad();
}