package behavioural.chainofresponsibility.event;

public record TextEvent(String text) implements IEvent<String> {

    @Override
    public String getPayLoad() {
        return text;
    }
}
