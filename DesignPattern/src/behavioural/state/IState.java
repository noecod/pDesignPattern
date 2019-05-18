package behavioural.state;

public interface IState {

    public void pushShort(HeadLamp hl);

    public void pushLong(HeadLamp hl);

    public void triggerPeriodPassed(HeadLamp hl);

    public void action();
}