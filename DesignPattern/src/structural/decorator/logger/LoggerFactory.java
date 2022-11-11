package structural.decorator.logger;

public class LoggerFactory {

    public static final String TYPE_CONSOLE_LOGGER = "console";
    public static final String TYPE_FILE_LOGGER = "file";

    public ILogger getLogger(String type, String name) {
        return switch (type) {
            case TYPE_CONSOLE_LOGGER -> new ConsoleLogger();
            case TYPE_FILE_LOGGER -> new FileLogger(name);
            default -> {
                System.out.println("Error creating logger. Logger type unknown.");
                yield null;
            }
        };
    }
}
