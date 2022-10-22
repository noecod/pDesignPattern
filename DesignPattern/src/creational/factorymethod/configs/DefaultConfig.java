package creational.factorymethod.configs;

import creational.factorymethod.IDefaultSystemConfiguration;
import lombok.Getter;

@Getter
public class DefaultConfig implements IDefaultSystemConfiguration {

    private final int numberOfElements = 100;
}
