package behavioural.command;

import java.util.Random;

import behavioural.command.cmd.DimLightCommand;
import behavioural.command.cmd.TurnOffLightCommand;
import behavioural.command.cmd.TurnOnLightCommand;

public class Demo {

    private static final int ITERATIONS = 20;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ReceiverLight light = new ReceiverLight();

        InvokerSwitch lightSwitch = new InvokerSwitch();

        for (int i = 0; i < ITERATIONS; i++) {
            int randomNumber = RANDOM.nextInt(3);

            switch (randomNumber) {
                case 0 -> lightSwitch.execute(new TurnOnLightCommand(light));
                case 1 -> lightSwitch.execute(new TurnOffLightCommand(light));
                case 2 -> lightSwitch.execute(new DimLightCommand(light, RANDOM.nextInt(100)));
                default -> {} // do nothing
            }
        }

        lightSwitch.showHistory();
    }
}