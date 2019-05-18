package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;

public abstract class AbstractHandler {

    private AbstractHandler nextHandlerInChain = null;

    public void setNext(AbstractHandler nextHandler) {
        nextHandlerInChain = nextHandler;
    }

    public void handle(IEvent<?> request) {
        processRequest(request);
        // Pass along the chain, if possible. In this case pass always along the chain, if there is a successor. Another
        // possibility is only to pass on, if this handler can't process the event.
        if (nextHandlerInChain != null) {
            nextHandlerInChain.handle(request);
        }
    }

    protected abstract void processRequest(IEvent<?> request);
}