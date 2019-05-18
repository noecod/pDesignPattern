package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnWhiteLow implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OnWhiteBlinking());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new OnRed());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new OnWhiteLowTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Low white beam!");
    }
}