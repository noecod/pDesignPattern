package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<BoardGame> boardGames = new ArrayList<>();

        Director director = new Director();

        ChessBuilder chessBuilder = new ChessBuilder();
        ScrabbleBuilder scrabbleBuilder = new ScrabbleBuilder();
        director.constructPlain(chessBuilder);
        boardGames.add(chessBuilder.getGame());
        director.constructPlain(scrabbleBuilder);
        boardGames.add(scrabbleBuilder.getGame());

        chessBuilder = new ChessBuilder();
        scrabbleBuilder = new ScrabbleBuilder();
        director.constructPresent(chessBuilder);
        boardGames.add(chessBuilder.getGame());
        director.constructPresent(scrabbleBuilder);
        boardGames.add(scrabbleBuilder.getGame());

        boardGames.forEach(Demo::printGame);
    }

    public static void printGame(BoardGame bg) {
        System.out.println("Board Game:");
        System.out.println("board: " + bg.getBoard().name() + " with " + bg.getBoard().numOfFields() + " fields");
        System.out.println("figures: " + bg.getFigures());
        System.out.println("instructions: " + bg.getInstructions());
        System.out.println("packaging: " + bg.getPackaging());
        System.out.println("wrapping: " + (bg.isWrapping() ? "yes" : "no"));
        System.out.println();
    }

}
