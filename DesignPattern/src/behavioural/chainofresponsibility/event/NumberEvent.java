package behavioural.chainofresponsibility.event;

public class NumberEvent implements IEvent<Integer> {

    private final Integer number;

    public NumberEvent(Integer number) {
        this.number = number;
    }

    public Integer getPayLoad() {
        return number;
    }
}