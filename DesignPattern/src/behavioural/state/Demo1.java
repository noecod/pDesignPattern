package behavioural.state;

public class Demo1 {

    public static void main(String[] args) {
        HeadLamp hl = new HeadLamp();

        hl.pushShort();
        hl.triggerPeriodPassed();
        hl.pushShort();
        hl.pushShort();
        hl.pushShort();
        hl.pushLong();
        hl.pushShort();
        hl.triggerPeriodPassed();
        hl.pushLong();
        hl.triggerPeriodPassed();
        hl.pushShort();
    }
}