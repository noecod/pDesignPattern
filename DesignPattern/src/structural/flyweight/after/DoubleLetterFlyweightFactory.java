package structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.obj.DoubleLetter;

public class DoubleLetterFlyweightFactory {

    private Map<String, DoubleLetter> pool;

    public DoubleLetterFlyweightFactory() {
        pool = new HashMap<>();
    }

    public DoubleLetter getFlyweight(char letter) {
        String key = String.valueOf(letter);
        return pool.computeIfAbsent(key, k -> new DoubleLetter(letter));
    }
}
