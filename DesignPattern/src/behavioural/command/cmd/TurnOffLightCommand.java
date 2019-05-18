package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class TurnOffLightCommand implements ICommand {

    private static final String COMMAND_NAME = "TURN OFF";

    private ReceiverLight theLight;

    public TurnOffLightCommand(ReceiverLight light) {
        theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " []";
    }
}