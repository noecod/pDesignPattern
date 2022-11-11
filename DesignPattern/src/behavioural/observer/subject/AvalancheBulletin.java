package behavioural.observer.subject;

import java.time.LocalDateTime;
import java.util.Random;

import behavioural.observer.IInformationSet;

public class AvalancheBulletin extends AbstractObservable {

    private static final Random RANDOM = new Random();

    private static final String[] DANGER_SCALE = { "low", "moderate", "considerable", "high", "very high" };

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
            private final String text = DANGER_SCALE[RANDOM.nextInt(DANGER_SCALE.length)];

            @Override
            public LocalDateTime getPublicationDateTime() {
                return LocalDateTime.now();
            }

            @Override
            public String getType() {
                return AvalancheBulletin.this.getClass().getSimpleName() + "(" + getName() + ")";
            }

            @Override
            public String getHeadlines() {
                return text.toUpperCase();
            }
        };
    }
}
