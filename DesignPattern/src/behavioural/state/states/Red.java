package behavioural.state.states;

import behavioural.state.HeadLamp;

public class Red implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new RedBlinking());
    }

    @Override
    public void pushLong(HeadLamp hl) {
        hl.setState(new WhiteFull());
    }

    @Override
    public void triggerPeriodPassed(HeadLamp hl) {
        hl.setState(new RedTriggerPeriodPassed());
    }

    @Override
    public void action() {
        System.out.println("--Full red beam!");
    }
}