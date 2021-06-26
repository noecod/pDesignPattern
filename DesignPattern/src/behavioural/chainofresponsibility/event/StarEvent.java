package behavioural.chainofresponsibility.event;

public record StarEvent(Integer count) implements IEvent<String> {

    @Override
    public String getPayLoad() {
        return "*".repeat(count);
    }
}
