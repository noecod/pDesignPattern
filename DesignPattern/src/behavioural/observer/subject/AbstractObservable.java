package behavioural.observer.subject;

import java.util.HashMap;
import java.util.Map;

import behavioural.observer.IInformationSet;
import behavioural.observer.IObserver;
import lombok.Getter;

public abstract class AbstractObservable {

    @Getter
    private final String name;
    private Map<String, IObserver> observers = new HashMap<>();

    public AbstractObservable(String name) {
        this.name = name;
    }

    public void subscribe(IObserver observer) {
        if (!observers.containsKey(observer.getIdentifier())) {
            observers.put(observer.getIdentifier(), observer);
        }
    }

    public void unsubscribe(IObserver observer) {
        observers.remove(observer.getIdentifier());
    }

    public abstract IInformationSet getNewInformationSet();

    public void publishUpdatedInformationSet() {
        // notify all subscribers
        observers.values().forEach(o -> o.update(getNewInformationSet()));
    }
}