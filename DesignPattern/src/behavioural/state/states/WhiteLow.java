package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class WhiteLow implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new WhiteBlinking());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new Red());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new WhiteLowTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Low white beam!");
    }
}