package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;
import behavioural.chainofresponsibility.event.TextEvent;

public class TextEventHandler1 extends AbstractHandler {

    @Override
    protected void processRequest(IEvent<?> request) {
        if (request instanceof TextEvent textEvent) {
            System.out.println("TextEventHandler1.processRequest: " + textEvent.getPayLoad().toUpperCase());
        } else {
            System.out.println(getClass().getSimpleName() + " doesn't process " + request.getClass().getSimpleName());
        }
    }
}
