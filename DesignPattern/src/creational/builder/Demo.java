package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<BoardGame> boardGames = new ArrayList<>();

        Director d = new Director();

        ChessBuilder chessB = new ChessBuilder();
        ScrabbleBuilder scrabbleB = new ScrabbleBuilder();
        d.constructPlain(chessB);
        boardGames.add(chessB.getGame());
        d.constructPlain(scrabbleB);
        boardGames.add(scrabbleB.getGame());

        chessB = new ChessBuilder();
        scrabbleB = new ScrabbleBuilder();
        d.constructPresent(chessB);
        boardGames.add(chessB.getGame());
        d.constructPresent(scrabbleB);
        boardGames.add(scrabbleB.getGame());

        boardGames.forEach(bg -> printG(bg));
    }

    public static void printG(BoardGame bg) {
        System.out.println("Board Game:");
        System.out.println("board: " + bg.getBoard().name() + " with " + bg.getBoard().numOfFields() + " fields");
        System.out.println("figures: " + bg.getFigures());
        System.out.println("instructions: " + bg.getInstructions());
        System.out.println("packaging: " + bg.getPackaging());
        System.out.println("wrapping: " + (bg.isWrapping() ? "yes" : "no"));
        System.out.println();
    }

}
