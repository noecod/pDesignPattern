package behavioural.state.states;

import behavioural.state.HeadLamp;
import behavioural.state.IState;

public class OffWhite implements IState {

    @Override
    public void pushShort(HeadLamp hl) {
        hl.setState(new OnWhiteFull());
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
        System.out.println("--Dark it is");
    }
}