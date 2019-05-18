package behavioural.observer.subscriber;

import lombok.Getter;

@Getter
public class MountainGuide extends AbstractObserver {

    private String qualification;

    public MountainGuide(String firstName, String sureName, String eMail, String qualification) {
        super(firstName, sureName, eMail);
        this.qualification = qualification;
    }
}
