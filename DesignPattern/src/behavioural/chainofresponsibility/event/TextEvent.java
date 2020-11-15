package behavioural.chainofresponsibility.event;

public class TextEvent implements IEvent<String> {

    private final String text;

    public TextEvent(String text) {
        this.text = text;
    }

    public String getPayLoad() {
        return text;
    }
}
