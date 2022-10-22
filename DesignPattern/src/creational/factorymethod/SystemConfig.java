package creational.factorymethod;

/**
 * just a wrapper
 */
public final class SystemConfig {

    private static final ISystemConfiguration activeConfig;

    static {
        activeConfig = SystemConfigurationFactory.getActiveConfiguration();
    }

    private SystemConfig() {
    }

    public static String getTitle() {
        return activeConfig.getTitle();
    }

    public static String getDescription() {
        return activeConfig.getDescription();
    }

    public static int getHeight() {
        return activeConfig.getHeight();
    }

    public static int getWidth() {
        return activeConfig.getWidth();
    }

    public static int getNumberOfElements() {
        return activeConfig.getNumberOfElements();
    }

}
