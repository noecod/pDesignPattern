package behavioural.command.cmd;

import behavioural.command.ICommand;
import behavioural.command.ReceiverLight;

public class TurnOnLightCommand implements ICommand {

    private static final String COMMAND_NAME = "TURN ON";

    private final ReceiverLight receiverLight;

    public TurnOnLightCommand(ReceiverLight receiverLight) {
        this.receiverLight = receiverLight;
    }

    @Override
    public void execute() {
        receiverLight.turnOn();
    }

    @Override
    public String toString() {
        return COMMAND_NAME + " []";
    }
}