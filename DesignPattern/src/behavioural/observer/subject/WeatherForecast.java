package behavioural.observer.subject;

import java.time.LocalDateTime;
import java.util.Random;

import behavioural.observer.IInformationSet;

public class WeatherForecast extends AbstractObservable {

    private static Random random = new Random();

    private static String[] weather = { "sunny", "rainy", "cloudy" };

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
            private String text = weather[random.nextInt(weather.length)];

            @Override
            public String getType() {
                return WeatherForecast.this.getClass().getSimpleName() + "(" + getName() + ")";
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
                return "Today it is mostly " + text;
            }
        };
    }
}
