package structural.decorator.logger;

public class Demo {

    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        ILogger logger = factory.getLogger(LoggerFactory.TYPE_FILE_LOGGER, "system.log");
        HTMLLogger htmlLogger = new HTMLLogger(logger);
        htmlLogger.log("A message to log");
        EncryptLogger encryptLogger = new EncryptLogger(logger);
        encryptLogger.log("A message to log");
    }
}
