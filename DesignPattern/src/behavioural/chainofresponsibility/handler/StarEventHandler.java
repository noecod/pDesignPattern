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
}
