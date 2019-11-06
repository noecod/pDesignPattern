package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnRedBlinking implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new Off());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new OnWhiteFull());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
    }

    @Override
    public void action() {
        System.out.println("--Red blinking beam!");
    }
}