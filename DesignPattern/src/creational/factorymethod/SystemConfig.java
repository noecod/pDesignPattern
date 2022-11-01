package creational.factorymethod;

/**
 * just a wrapper
 */
public final class SystemConfig {

    private static final ISystemConfiguration ACTIVE_CONFIG;

    static {
        ACTIVE_CONFIG = SystemConfigurationFactory.getActiveConfiguration();
    }

    private SystemConfig() {
    }

    public static String getTitle() {
        return ACTIVE_CONFIG.getTitle();
    }

    public static String getDescription() {
        return ACTIVE_CONFIG.getDescription();
    }

    public static int getHeight() {
        return ACTIVE_CONFIG.getHeight();
    }

    public static int getWidth() {
        return ACTIVE_CONFIG.getWidth();
    }

    public static int getNumberOfElements() {
        return ACTIVE_CONFIG.getNumberOfElements();
    }

}
