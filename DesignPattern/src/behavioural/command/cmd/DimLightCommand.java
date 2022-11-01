package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class DimLightCommand implements ICommand {

    private static final String COMMAND_NAME = "DIM";

    private final ReceiverLight receiverLight;
    private final int percentage;

    public DimLightCommand(ReceiverLight receiverLight, int percentage) {
        this.receiverLight = receiverLight;
        this.percentage = percentage;
    }

    @Override
    public void execute() {
        receiverLight.dim(percentage);
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " [percentage=" + percentage + "]";
    }
}
