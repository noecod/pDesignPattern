package structural.decorator.logger;

public class LoggerDecorator implements ILogger {

    protected ILogger logger;

    public LoggerDecorator(ILogger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log(msg);
    }
}
