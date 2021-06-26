package behavioural.state;

import behavioural.state.states.IState;
import behavioural.state.states.Off;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeadLamp {

    private IState state;

    public HeadLamp() {
        state = new Off();
    }

    public void pushShort() {
        System.out.println("push short");
        state.pushShort(this);
        state.action();
    }

    public void pushLong() {
        System.out.println("push long");
        state.pushLong(this);
        state.action();
    }

    public void triggerPeriodPassed() {
        System.out.println("trigger period passed");
        state.triggerPeriodPassed(this);
        state.action();
    }

    public void printState(String prefixText) {
        System.out.println(prefixText + getState().getClass().getSimpleName());
    }
}