package structural.flyweight.before;

import java.util.Random;

import structural.flyweight.obj.DoubleLetter;

public class Demo {

    public static final int ROWS = 15, COLS = 35;
    private static final Random RANDOM = new Random();

    private static DoubleLetter[][] matrix;

    public static void main(String[] args) {
        matrix = new DoubleLetter[ROWS][COLS];
        fillMatrix();
        reportMatrix();
    }

    private static void fillMatrix() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = new DoubleLetter((char) getRandomNumber());
            }
        }
    }

    private static void reportMatrix() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j].report();
            }
            System.out.println();
        }
        System.out.println("\n# of objects: " + DoubleLetter.getCountNumObjects());

    }

    private static int getRandomNumber() {
        // generate a random integer ascii code from A to Z
        return RANDOM.nextInt(26) + 65;
    }
}
