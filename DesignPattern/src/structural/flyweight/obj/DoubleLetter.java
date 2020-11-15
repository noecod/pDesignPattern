package structural.flyweight.obj;

import lombok.Getter;

public class DoubleLetter {

    private static final char DEFAULT_LETTER = 'A';

    @Getter
    private static int countNumObjects = 0;

    @Getter
    private char letter = DEFAULT_LETTER;

    public DoubleLetter(char letter) {
        int asciiCode = letter;
        if (asciiCode >= 65 && asciiCode <= 91) {
            this.letter = letter;
        }
        countNumObjects++;
    }

    public void report() {
        System.out.print(" " + String.valueOf(letter).repeat(2));
    }
}
