package pattern.gof.structural.decorator.logger;

public class ConsoleLogger implements ILogger {

    @Override
    public void log(String msg) {
        System.out.println("Message only written to console! " + msg);
    }
}
