package behavioural.chainofresponsibility.event;

public record NumberEvent(Integer number) implements IEvent<Integer> {

    @Override
    public Integer getPayLoad() {
        return number;
    }
}