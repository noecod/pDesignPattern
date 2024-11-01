package structural.proxy.logger;

public class Demo {

    public static void main(String[] args) {
        ILogging logger = new CachedLoggingProxy();
        for (int i = 1; i < 12; i++) {
            logger.logRequest("Log request no " + i + ": power is down" );
        }
        logger.flush();
    }
}
