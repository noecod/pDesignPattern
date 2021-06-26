package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;
import behavioural.chainofresponsibility.event.NumberEvent;

public class NumberEventHandler extends AbstractHandler {

    @Override
    protected void processRequest(IEvent<?> request) {
        if (request instanceof NumberEvent numberEvent) {
            int n = numberEvent.getPayLoad();
            System.out
                .println("NumberEventHandler.processRequest: " + n + " is " + (isPrime(n) ? "" : "not ") + "prime");
        } else {
            System.out.println(getClass().getSimpleName() + " doesn't process " + request.getClass().getSimpleName());
        }
    }

    // checks whether a natural number is prime or not.
    private boolean isPrime(int n) {
        // check if n is a multiple of 2
        if (n % 2 == 0) {
            return false;
        }
        // if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
