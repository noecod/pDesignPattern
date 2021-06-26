package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class TurnOnLightCommand implements ICommand {

    private static final String COMMAND_NAME = "TURN ON";

    private final ReceiverLight theLight;

    public TurnOnLightCommand(ReceiverLight light) {
        theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " []";
    }
}