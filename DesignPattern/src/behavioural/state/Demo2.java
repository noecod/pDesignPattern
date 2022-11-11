package behavioural.state;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        HeadLamp hl = new HeadLamp();

        // Fire some events and print FSM state
        hl.printState("head lamp initial state : ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("1. Push Short [s]");
        System.out.println("2. Push Long [l]");
        System.out.println("3. Trigger Period Passed [p]");
        System.out.println("Press [q] to quit head lamp.");

        while (true) {
            String input = scanner.nextLine();

            System.out.println("input = " + input.trim());
            switch (input.trim().toUpperCase()) {
                case "S" -> hl.pushShort();
                case "L" -> hl.pushLong();
                case "P" -> hl.triggerPeriodPassed();
                case "Q" -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
            hl.printState("head lamp state: ");
        }
    }

}