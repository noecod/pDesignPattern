package behavioural.observer.subject;

import java.time.LocalDateTime;
import java.util.Random;

import behavioural.observer.IInformationSet;

public class AvalancheBulletin extends AbstractObservable {

    private static Random random = new Random();

    private static String[] dangerScale = { "low", "moderate", "considerable", "high", "very high" };

    public AvalancheBulletin(String name) {
        super(name);
    }

    @Override
    public IInformationSet getNewInformationSet() {
        return createBulletin();
    }

    private IInformationSet createBulletin() {
        return new IInformationSet() {

            // random danger scale
            private String text = dangerScale[random.nextInt(dangerScale.length)];

            @Override
            public String getType() {
                return AvalancheBulletin.this.getClass().getSimpleName() + "(" + getName() + ")";
            }

            @Override
            public String getTopic() {
                return text.toUpperCase();
            }

            @Override
            public String getSummary() {
                return text;
            }

            @Override
            public LocalDateTime getPublicationDateTime() {
                return LocalDateTime.now();
            }

            @Override
            public String getDetails() {
                return "Danger is set to " + text;
            }
        };
    }
}
