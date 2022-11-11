package behavioural.observer.subject;

import java.time.LocalDateTime;
import java.util.Random;

import behavioural.observer.IInformationSet;

public class WeatherForecast extends AbstractObservable {

    private static final Random RANDOM = new Random();

    private static final String[] WEATHER = { "sunny", "rainy", "cloudy" };

    public WeatherForecast(String name) {
        super(name);
    }

    @Override
    public IInformationSet getNewInformationSet() {
        return createForecast();
    }

    private IInformationSet createForecast() {
        return new IInformationSet() {

            // random weather forecast
            private final String text = WEATHER[RANDOM.nextInt(WEATHER.length)];

            @Override
            public LocalDateTime getPublicationDateTime() {
                return LocalDateTime.now();
            }

            @Override
            public String getType() {
                return WeatherForecast.this.getClass().getSimpleName() + "(" + getName() + ")";
            }

            @Override
            public String getHeadlines() {
                return text.toUpperCase();
            }
        };
    }
}
