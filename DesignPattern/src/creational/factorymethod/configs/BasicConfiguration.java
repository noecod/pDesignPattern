package creational.factorymethod.configs;

import creational.factorymethod.IDefaultSystemConfiguration;
import lombok.Getter;

@Getter
public class BasicConfiguration implements IDefaultSystemConfiguration {

    private final int numberOfElements = 50;
}
