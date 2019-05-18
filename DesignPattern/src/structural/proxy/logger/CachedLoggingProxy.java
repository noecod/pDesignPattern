package structural.proxy.logger;

import java.util.ArrayList;
import java.util.List;

public class CachedLoggingProxy implements ICachedLogging {

    private static final int CACHE_SIZE = 4;

    List<String> cachedLogEntries = new ArrayList<>();
    CachedLogger cachedLogger = new CachedLogger();

    @Override
    public void logRequest(String logString) {
        addLogRequest(logString);
    }

    private void addLogRequest(String logString) {
        cachedLogEntries.add(logString);
        if (cachedLogEntries.size() >= CACHE_SIZE) {
            performLogging();
        }
    }

    private void performLogging() {
        StringBuffer accumulatedLogString = new StringBuffer();

        cachedLogEntries.forEach(s -> {
            accumulatedLogString.append("\n" + s);
            System.out.println(getAddMsg(s));
        });

        System.out.println("CachedLoggingProxy: sends accumulated logstring to CachedLogger.");
        cachedLogger.logRequest(accumulatedLogString.toString());
        cachedLogEntries.clear();
        System.out.println("CachedLoggingProxy: cachedLogEntries cleared.");
    }

    private String getAddMsg(String logString) {
        return "CachedLoggingProxy: adding logString \"" + logString + "\" to cached log entries.";
    }
}
