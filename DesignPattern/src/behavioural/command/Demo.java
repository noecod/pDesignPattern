package behavioural.command;

import java.util.Random;

import behavioural.command.cmd.DimLightCommand;
import behavioural.command.cmd.TurnOffLightCommand;
import behavioural.command.cmd.TurnOnLightCommand;

public class Demo {

    private static final int ITERATIONS = 20;

    private static Random random = new Random();

    public static void main(String[] args) {
        ReceiverLight light = new ReceiverLight();

        InvokerSwitch lightSwitch = new InvokerSwitch();

        for (int i = 0; i < ITERATIONS; i++) {
            int randomNumber = random.nextInt(3);

            switch (randomNumber) {
            case 0:
                lightSwitch.execute(new TurnOnLightCommand(light));
                break;
            case 1:
                lightSwitch.execute(new TurnOffLightCommand(light));
                break;
            case 2:
                lightSwitch.execute(new DimLightCommand(light, random.nextInt(100)));
                break;
            default: // do nothing
            }
        }

        lightSwitch.showHistory();
    }
}