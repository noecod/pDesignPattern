package structural.decorator.logger;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        msg = makeHTML(msg);
        logger.log(msg);
    }

    private String makeHTML(String msg) {
        msg = "<html><body>" + "<b>" + msg + "</b>" + "</body></html>";
        return msg;
    }
}
