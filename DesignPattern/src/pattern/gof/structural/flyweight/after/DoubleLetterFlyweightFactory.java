package pattern.gof.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

import pattern.gof.structural.flyweight.DoubleLetter;

public class DoubleLetterFlyweightFactory {

    private Map<String, DoubleLetter> pool;

    public DoubleLetterFlyweightFactory() {
        pool = new HashMap<>();
    }

    public DoubleLetter getFlyweight(char letter) {
        String key = String.valueOf(letter);
        if (pool.containsKey(key)) {
            return pool.get(key);
        } else {
            DoubleLetter newDoubleLetter = new DoubleLetter(letter);
            pool.put(key, newDoubleLetter);
            return newDoubleLetter;
        }
    }
}
