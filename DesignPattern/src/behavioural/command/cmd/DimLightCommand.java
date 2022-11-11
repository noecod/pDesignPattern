package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DimLightCommand implements ICommand {

    private static final String COMMAND_NAME = "DIM";

    private final ReceiverLight receiverLight;
    private final int percentage;

    @Override
    public void execute() {
        receiverLight.dim(percentage);
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " [percentage=" + percentage + "]";
    }
}
