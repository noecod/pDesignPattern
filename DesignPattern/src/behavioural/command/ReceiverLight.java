package behavioural.command;

import lombok.NoArgsConstructor;

/**
 * Receiver class.
 */
@NoArgsConstructor
public class ReceiverLight {

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }

    public void dim(int percentage) {
        System.out.println("Dim light " + percentage + "%");
    }
}
