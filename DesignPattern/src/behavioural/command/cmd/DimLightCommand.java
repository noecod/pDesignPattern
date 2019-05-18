package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class DimLightCommand implements ICommand {

    private static final String COMMAND_NAME = "DIM";

    private ReceiverLight theLight;
    private int percentage;

    public DimLightCommand(ReceiverLight light, int percentage) {
        theLight = light;
        this.percentage = percentage;
    }

    @Override
    public void execute() {
        theLight.dim(percentage);
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " [percentage=" + percentage + "]";
    }
}
