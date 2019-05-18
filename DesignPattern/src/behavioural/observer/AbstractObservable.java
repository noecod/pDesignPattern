package behavioural.observer;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public abstract class AbstractObservable {

    private @Getter String name;
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
        if (observers.containsKey(observer.getIdentifier())) {
            observers.remove(observer.getIdentifier());
        }
    }

    protected abstract IInformationSet getNewInformationSet();

    protected void publishUpdatedInformationSet() {
        // notify all subscribers
        observers.values().forEach(o -> o.update(getNewInformationSet()));
    }
}