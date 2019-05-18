package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnWhiteBlinking implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OffWhite());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new OnRed());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
    }

    @Override
    public void action() {
        System.out.println("--Blinking white beam!");
    }
}