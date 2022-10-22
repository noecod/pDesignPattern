package creational.factorymethod;

import lombok.Getter;

@Getter
public class BigScreenConfiguration implements ISystemConfiguration {

    private final String title = "Wall";
    private final String description = "Big screen";
    private final int height = 1920;
    private final int width = 1080;
    public final int numberOfElements = 120;
}
