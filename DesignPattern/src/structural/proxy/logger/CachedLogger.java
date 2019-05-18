package structural.proxy.logger;

public class CachedLogger implements ICachedLogging {

    @Override
    public void logRequest(String logString) {
        System.out.println("CachedLogger logging to some expensive resource: " + logString + "\n");
    }
}