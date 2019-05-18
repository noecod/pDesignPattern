package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;
import behavioural.chainofresponsibility.event.TextEvent;

public class TextEventHandler extends AbstractHandler {

    @Override
    protected void processRequest(IEvent<?> request) {
        if (request instanceof TextEvent) {
            TextEvent textEvent = (TextEvent) request;
            System.out.println("TextEventHandler.processRequest: " + textEvent.getPayLoad().toUpperCase());
        }
    }
}
