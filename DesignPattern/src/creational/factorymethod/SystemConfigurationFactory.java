package creational.factorymethod;

public final class SystemConfigurationFactory {

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
            default -> new DefaultConfig();
        };
    }
}
