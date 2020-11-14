package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;
import behavioural.chainofresponsibility.event.NumberEvent;
import behavioural.chainofresponsibility.event.StarEvent;

public class StarEventHandler extends AbstractHandler {

    @Override
    protected void processRequest(IEvent<?> request) {
        if (request instanceof StarEvent) {
            StarEvent starEvent = (StarEvent) request;
            String stars = starEvent.getPayLoad();
            System.out.println("StarEventHandler.processRequest: " + stars);
        } else {
            System.out.println(this.getClass().getSimpleName() + " doesn't process " + request.getClass().getSimpleName());
        }
    }

    // checks whether an natural number is prime or not.
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
