package behavioural.state;

public class Demo {

    public static void main(String[] args) {
        HeadLamp hl = new HeadLamp();

        hl.pushShort();
        hl.action();
        hl.triggerPeriodPassed();
        hl.action();
        hl.pushShort();
        hl.action();
        hl.pushShort();
        hl.action();
        hl.pushShort();
        hl.action();
        hl.pushLong();
        hl.action();
        hl.pushShort();
        hl.action();
        hl.triggerPeriodPassed();
        hl.action();
        hl.pushLong();
        hl.action();
        hl.triggerPeriodPassed();
        hl.action();
        hl.pushShort();
        hl.action();
    }
}