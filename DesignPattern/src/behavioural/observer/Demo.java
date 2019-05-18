package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

import behavioural.observer.subject.AvalancheBulletin;
import behavioural.observer.subject.WeatherForecast;
import behavioural.observer.subscriber.Hiker;
import behavioural.observer.subscriber.MountainGuide;
import behavioural.observer.subscriber.OutdoorGuide;

public class Demo {

    private AvalancheBulletin bulletinCH = new AvalancheBulletin("Avalanche Bulletin for CH");
    private WeatherForecast weatherGotthard = new WeatherForecast("Weather Forecast for Gotthard region");
    private WeatherForecast weatherZermatt = new WeatherForecast("Weather Forecast for Zermatt region");
    private List<AbstractObservable> observables = new ArrayList<>();

    private Hiker tom = new Hiker("Tom", "Muller", "tom.muller@hiker.org");
    private MountainGuide ueli = new MountainGuide("Ueli", "Stock", "ueli.stock@berge.ch", "Alpiniste");
    private OutdoorGuide anna = new OutdoorGuide("Anna", "Bell", "anna.bell@action.fi");

    public Demo() {
        observables.add(bulletinCH);
        observables.add(weatherGotthard);
        observables.add(weatherZermatt);
    }

    public static void main(String[] args) {
        Demo runDemo = new Demo();
        runDemo.initObjects();
        runDemo.observables.forEach(o -> o.publishUpdatedInformationSet());
    }

    private void initObjects() {
        bulletinCH.subscribe(ueli);
        weatherZermatt.subscribe(ueli);
        weatherZermatt.subscribe(tom);
        weatherZermatt.subscribe(anna);
    }
}
