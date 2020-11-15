package behavioural.state.states;

import behavioural.state.HeadLamp;

public interface IState {

    void pushShort(HeadLamp hl);

    void pushLong(HeadLamp hl);

    void triggerPeriodPassed(HeadLamp hl);

    void action();
}