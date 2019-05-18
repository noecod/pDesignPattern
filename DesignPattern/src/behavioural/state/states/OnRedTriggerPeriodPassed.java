package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnRedTriggerPeriodPassed implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OffRed());
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
        System.out.println("--Full red beam!");
    }
}