package creational.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class BoardGame {

    private @Getter Board board;
    private @Setter @Getter String figures;
    private @Setter @Getter String instructions;
    private @Setter @Getter String packaging;
    private @Setter @Getter boolean wrapping = false;

    public void createBoard(String name, int numOfFields) {
        board = new Board(name, numOfFields);
    }

    @Getter
    @AllArgsConstructor
    public class Board {

        private String name;
        private int numOfFields;
    }
}