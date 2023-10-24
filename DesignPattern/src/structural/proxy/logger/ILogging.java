package structural.proxy.logger;

public interface ILogging {

    void logRequest(String logString);

    void flush();
}
