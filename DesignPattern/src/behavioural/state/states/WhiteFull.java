package behavioural.state.states;

import behavioural.state.HeadLamp;

public class WhiteFull implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new WhiteLow());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new Red());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new WhiteFullTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Strong white beam!");
    }
}