package creational.singleton;

public class FileLogger {

    private static FileLogger logger;

    // Prevent clients from using the constructor
    private FileLogger() {
        // hide
    }

    // Control the accessible (allowed) instances
    public static FileLogger getFileLogger() {
        if (logger == null) {
            logger = new FileLogger();
        }
        return logger;
    }

    public synchronized void log(String msg) {
        // Write to log file...
    }
}