package behavioural.observer.subscriber;

import behavioural.observer.IInformationSet;
import behavioural.observer.IObserver;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractObserver implements IObserver {

    private String firstName;
    private String sureName;
    private String eMail;

    @Override
    public String getIdentifier() {
        return eMail;
    }

    @Override
    public void update(IInformationSet information) {
        System.out.println(this.getClass().getSimpleName() + "(" + getFirstName() + " " + getSureName()
            + ") was updated with the " + information.getType() + "(" + information.getTopic() + ")");
    }
}
