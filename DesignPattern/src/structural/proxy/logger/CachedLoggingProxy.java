package structural.proxy.logger;

import java.util.ArrayList;
import java.util.List;

public class CachedLoggingProxy implements ILogging {

    private static final int CACHE_SIZE = 4;

    List<String> cachedLogEntries = new ArrayList<>();
    Logger logger = new Logger();

    @Override
    public void logRequest(String logString) {
        addLogRequest(logString);
    }

    @Override
    public void flush() {
        logger.flush();
        performLogging();
    }

    private void addLogRequest(String logString) {
        cachedLogEntries.add(logString);
        if (cachedLogEntries.size() >= CACHE_SIZE) {
            performLogging();
        }
    }

    private void performLogging() {
        StringBuilder accumulatedLogString = new StringBuilder();

        cachedLogEntries.forEach(s -> {
            accumulatedLogString.append("\n").append(s);
            System.out.println(getAddMsg(s));
        });
        cachedLogEntries.clear();
        System.out.println("CachedLoggingProxy: cachedLogEntries cleared.");

        System.out.println("CachedLoggingProxy: sends accumulated logstring to CachedLogger.");
        logger.logRequest(accumulatedLogString.toString());
    }

    private String getAddMsg(String logString) {
        return "CachedLoggingProxy: adding logString \"" + logString + "\" to cached log entries.";
    }
}
