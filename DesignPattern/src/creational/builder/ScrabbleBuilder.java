package creational.builder;

import lombok.NoArgsConstructor;

public class ScrabbleBuilder extends AbstractBoardGameBuilder {

    @Override
    public void buildBoard() {
        product.createBoard("15x15 Board", 225);
    }

    @Override
    public void buildFigures() {
        product.setFigures("many letters");
    }

    @Override
    public void buildInstructions() {
        product.setInstructions("Introduction to Scrabble");
    }

    @Override
    public void buildPackaging() {
        product.setPackaging("Cardboard Box");
    }

    @Override
    public void wrapping() {
        product.setWrapping(true);
    }

}
