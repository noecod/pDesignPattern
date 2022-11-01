package creational.factorymethod;

import creational.factorymethod.configs.BasicConfiguration;
import creational.factorymethod.configs.BigScreenConfiguration;
import creational.factorymethod.configs.DefaultConfig;

final class SystemConfigurationFactory {

    private final static int ACTIVE_CONFIGURATION = 2;

    private SystemConfigurationFactory() {
    }

    /**
     * factory method
     *
     * @return the active system configuration
     */
    public static ISystemConfiguration getActiveConfiguration() {
        return switch (ACTIVE_CONFIGURATION) {
            case 1 -> new BasicConfiguration();
            case 2 -> new BigScreenConfiguration();
            case 3 -> new IDefaultSystemConfiguration() {
                @Override
                public int getNumberOfElements() {
                    return 500;
                }
            };
            default -> new DefaultConfig();
        };
    }
}
