package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOffLightCommand implements ICommand {

    private static final String COMMAND_NAME = "TURN OFF";

    private final ReceiverLight receiverLight;

    @Override
    public void execute() {
        receiverLight.turnOff();
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " []";
    }
}