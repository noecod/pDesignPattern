package behavioural.lazyevaluation;

import static behavioural.lazyevaluation.ComplexCalculation.calc;

public class Demo {

    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        System.out.println("result calc1: " + calc(34, 55));
        System.out.println("result calc2: " + calc(2, 3));
        System.out.println("result calc3: " + calc(7, 3));
        System.out.println("result calc2: " + calc(2, 3));
        System.out.println("result calc1: " + calc(34, 55));
        System.out.println("result calc3: " + calc(7, 3));
        System.out.println("result calc4: " + calc(1, 3));
        System.out.println("result calc2: " + calc(2, 3));
    }

    public static void example2() {
        Lazy<Integer, Boolean> lazyProduct = Lazy.of(i -> {
            System.out.println("simple but long lasting calculation");
            for (int j = 0; j < 1_000_000; j++) {
                // do nothing
            }
            return i % 2 == 0;
        });

        System.out.println("result for 4: " + lazyProduct.apply(4));
        System.out.println("result for 5: " + lazyProduct.apply(5));
        System.out.println("result for 19: " + lazyProduct.apply(19));
        System.out.println("result for 5: " + lazyProduct.apply(5));
        System.out.println("result for 19: " + lazyProduct.apply(19));
    }
}

