package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySolution;

public class FindInList extends AbstractStrategySolution<String> {

    private String searchElement;

    @Override
    public boolean findSolutions(List<String> list, String element) {
        searchElement = element;
        if (element == null) {
            return false;
        }

        return list.stream().anyMatch(e -> e.equals(element));
    }

    @Override
    public List<String> getSolutions() {
        return List.of(searchElement);
    }
}
