package behavioural.strategy;

import java.util.List;

import behavioural.strategy.base.AbstractStrategySolution;

public class FindInList extends AbstractStrategySolution<String> {

    private String searchElement;

    @Override
    public boolean findSolution(List<String> list, String element) {
        searchElement = element;
        if (element == null) {
            return false;
        }
        for (String listElement : list) {
            if (element.equals(listElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> getSolution() {
        return List.of(searchElement);
    }
}
