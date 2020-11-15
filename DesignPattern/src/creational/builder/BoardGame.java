package creational.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
public class BoardGame {

    private Board board;

    @Setter
    private String figures;
    @Setter
    private String instructions;
    @Setter
    private String packaging;
    @Setter
    private boolean wrapping = false;

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