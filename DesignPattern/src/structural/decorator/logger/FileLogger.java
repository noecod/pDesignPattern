package structural.decorator.logger;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FileLogger implements ILogger {

    private String fileName;

    @Override
    public void log(String msg) {
        System.out.println("Message written to file: " + fileName + " -> " + msg);
    }
}
