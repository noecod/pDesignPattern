package behavioural.chainofresponsibility.event;

public class StarEvent implements IEvent<String> {

    private Integer count;

    public StarEvent(Integer input) {
        this.count= input;
    }

    public String getPayLoad() {
        return "*".repeat(count);
    }
}
