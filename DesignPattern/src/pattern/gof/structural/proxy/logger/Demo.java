package pattern.gof.structural.proxy.logger;

import java.time.Instant;

public class Demo {

    public static void main(String[] args) {
        ICachedLogging logger = new CachedLoggingProxy();
        for (int i = 1; i < 12; i++) {
            logger.logRequest("power is down " + Instant.now());
        }
    }
}
