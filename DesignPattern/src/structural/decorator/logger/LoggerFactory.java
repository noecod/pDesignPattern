package structural.decorator.logger;

public class LoggerFactory {

    public static final String TYPE_CONSOLE_LOGGER = "console";
    public static final String TYPE_FILE_LOGGER = "file";

    public ILogger getLogger(String type, String name) {
        if (TYPE_CONSOLE_LOGGER.equals(type)) {
            return new ConsoleLogger();
        } else if (TYPE_FILE_LOGGER.equals(type)) {
            return new FileLogger(name);
        } else {
            System.out.println("Error creating logger. Logger type unknown.");
            return null;
        }
    }
}
