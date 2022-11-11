package behavioural.observer;

import java.time.LocalDateTime;

public interface IInformationSet {

    LocalDateTime getPublicationDateTime();

    String getType();

    String getHeadlines();

}
