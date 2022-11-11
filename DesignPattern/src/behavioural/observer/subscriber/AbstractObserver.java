package behavioural.observer.subscriber;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import behavioural.observer.IInformationSet;
import behavioural.observer.IObserver;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractObserver implements IObserver {

    private final String firstName;
    private final String sureName;
    private final String eMail;

    @Override
    public String getIdentifier() {
        return eMail;
    }

    @Override
    public void update(IInformationSet info) {
        final String indent = "  ";
        System.out.println(getClass().getSimpleName() + "(" + getFirstName() + " " + getSureName()
                + ", " + getIdentifier() + ")" + System.lineSeparator()
                + indent + "was updated with the " + info.getType() + System.lineSeparator()
                + indent
                + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(info.getPublicationDateTime())
                + " => " + info.getHeadlines());
    }
}
