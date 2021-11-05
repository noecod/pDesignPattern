package behavioural.lazyevaluation;

public class Demo {

    public static void main(String[] args) {
        IsCold isCold = new IsCold();
        isCold.setTemperature(1);
        Lazy<Boolean> checkTemperature = new Lazy<>(isCold);
        checkTemperature.get();
        checkTemperature.get();
    }
}
