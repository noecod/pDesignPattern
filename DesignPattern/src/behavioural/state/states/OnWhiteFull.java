package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OnWhiteFull implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OnWhiteLow());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new OnRed());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new OnWhiteFullTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Strong white beam!");
    }
}