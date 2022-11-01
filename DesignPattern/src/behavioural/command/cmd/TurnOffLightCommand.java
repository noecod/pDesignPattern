package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class TurnOffLightCommand implements ICommand {

    private static final String COMMAND_NAME = "TURN OFF";

    private final ReceiverLight receiverLight;

    public TurnOffLightCommand(ReceiverLight receiverLight) {
        this.receiverLight = receiverLight;
    }

    @Override
    public void execute() {
        receiverLight.turnOff();
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " []";
    }
}