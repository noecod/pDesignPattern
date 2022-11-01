package behavioural.chainofresponsibility;

import behavioural.chainofresponsibility.event.NumberEvent;
import behavioural.chainofresponsibility.event.StarEvent;
import behavioural.chainofresponsibility.event.TextEvent;
import behavioural.chainofresponsibility.handler.AbstractHandler;
import behavioural.chainofresponsibility.handler.NumberEventHandler;
import behavioural.chainofresponsibility.handler.StarEventHandler;
import behavioural.chainofresponsibility.handler.TextEventHandler1;
import behavioural.chainofresponsibility.handler.TextEventHandler2;

public class Demo {

    public static void main(String[] args) {
        // configure Chain of Responsibility
        AbstractHandler textHandler1 = new TextEventHandler1();
        AbstractHandler textHandler2 = new TextEventHandler2();
        AbstractHandler numberHandler = new NumberEventHandler();
        AbstractHandler starHandler = new StarEventHandler();
        AbstractHandler root = textHandler1; // start with the text handler
        textHandler1.setNext(textHandler2);
        textHandler2.setNext(numberHandler);
        numberHandler.setNext(starHandler);

        // calling chain of responsibility
        root.handle(new NumberEvent(1287));
        root.handle(new TextEvent("get up!"));
        root.handle(new StarEvent(10));
        root.handle(new NumberEvent(1289));
        root.handle(new TextEvent("Once Upon a Time"));
    }
}
