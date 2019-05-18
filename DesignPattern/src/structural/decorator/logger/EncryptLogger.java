package structural.decorator.logger;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        msg = encrypt(msg);
        logger.log(msg);
    }

    private String encrypt(String msg) {
        msg = msg.substring(msg.length() - 1) + msg.substring(0, msg.length() - 1);
        return msg;
    }
}
