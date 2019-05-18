package behavioural.observer;

import java.time.LocalDateTime;

public interface IInformationSet {

    String getType();

    LocalDateTime getPublicationDateTime();

    String getTopic();

    String getSummary();

    String getDetails();
}
