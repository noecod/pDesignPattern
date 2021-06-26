package behavioural.state;

import java.util.Scanner;

public class Demo2 {

    public static void printState(HeadLamp hl) {
        hl.printState("head lamp state: ");
    }

    public static void main(String[] args) {
        HeadLamp hl = new HeadLamp();

        /*
         * Fire some events and print FSM state
         */
        hl.printState("head lamp initial state : ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("1. Push Short [s]");
        System.out.println("2. Push Long [l]");
        System.out.println("3. Trigger Period Passed [p]");
        System.out.println("Press [q] to quit head lamp.");

        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("s")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing short push event..");
                hl.pushShort();
                printState(hl);
            }
            if (input.trim().equalsIgnoreCase("l")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing long push event..");
                hl.pushLong();
                printState(hl);
            }
            if (input.trim().equalsIgnoreCase("p")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing trigger period passed event..");
                hl.triggerPeriodPassed();
                printState(hl);
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("input = " + input.trim());
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}