package behavioural.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 4. Clients couple strictly to the interface
public class Demo {

    // client code here
    private static <T> void execute(IStrategy<T> strategy, List<T> list, T element) {
        List<T> solution = strategy.solve(list, element);
        String text = (solution == null ? "no solution found" : "solution found");
        System.out.println(text + " => result: " + solution);
    }

    public static void main(String[] args) {
        // test run 1
        List<Integer> list1 = Arrays.asList(4, 5, 6, 1, 2, 3, 7, 8, 9);
        List<IStrategy<Integer>> strategies1 = new ArrayList<>();
        strategies1.add(new MinimumInIntegerListStrategy());
        strategies1.add(new TwoMinimumInIntegerListStrategy());
        strategies1.add(new SumUpIntegerListStrategy());

        for (IStrategy<Integer> strategy : strategies1) {
            execute(strategy, list1, 7);
            execute(strategy, list1, 1);
        }

        // test run 2
        List<String> list2 = Arrays.asList("Anna", "Toni", "Eugen", "Lili", "Thomas", "Hans", "Ashley", "Heidi");
        List<IStrategy<String>> strategies2 = new ArrayList<>();
        strategies2.add(new FindInList());

        for (IStrategy<String> strategy : strategies2) {
            execute(strategy, list2, "Eugen");
            execute(strategy, list2, "Kurt");
        }
    }
}
