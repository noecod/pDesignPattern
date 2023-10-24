package structural.proxy.logger;

public class Logger implements ILogging {

    @Override
    public void logRequest(String logString) {
        System.out.println("logging to some expensive resource: " + logString + "\n");
    }

    @Override
    public void flush() {
    }
}