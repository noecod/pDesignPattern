package behavioural.chainofresponsibility.handler;

import behavioural.chainofresponsibility.event.IEvent;
import behavioural.chainofresponsibility.event.TextEvent;

public class TextEventHandler2 extends AbstractHandler {

    private static final int SHIFT = 3;

    @Override
    protected void processRequest(IEvent<?> request) {
        if (request instanceof TextEvent textEvent) {
            System.out.println("TextEventHandler.processRequest: " + encrypt(textEvent.getPayLoad(), SHIFT));
        } else {
            System.out.println(getClass().getSimpleName() + " doesn't process " + request.getClass().getSimpleName());
        }
    }

    private static String encrypt(String msg, int shift) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        msg = msg.toLowerCase();
        String encrypted = "";
        for (int i = 0; i < msg.length(); i++) {
            int pos = alphabet.indexOf(msg.charAt(i));
            int encryptPos = (shift + pos) % 26;
            char encryptChar = alphabet.charAt(encryptPos);
            encrypted += encryptChar;
        }
        return encrypted;
    }

}
