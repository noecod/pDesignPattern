package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnRed implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OnRedBlinking());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new OnWhiteFull());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new OnRedTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Full red beam!");
    }
}