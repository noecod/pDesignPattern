package behavioural.state;

import behavioural.state.states.IState;
import behavioural.state.states.Off;

public class HeadLamp {

    private IState currentState;

    public HeadLamp() {
        this.currentState = new Off();
    }

    public void setState(IState state) {
        this.currentState = state;
    }

    public void pushShort() {
        System.out.println("push short");
        this.currentState.pushShort(this);
    }

    public void pushLong() {
        System.out.println("push long");
        this.currentState.pushLong(this);
    }

    public void triggerPeriodPassed() {
        System.out.println("trigger period passed");
        this.currentState.triggerPeriodPassed(this);
    }

    public void action() {
        this.currentState.action();
    }
}