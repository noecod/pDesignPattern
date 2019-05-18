package behavioural.observer;

public interface IObserver {

    String getIdentifier();

    void update(IInformationSet information);
}
