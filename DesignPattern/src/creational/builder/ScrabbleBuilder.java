package creational.builder;

public class ScrabbleBuilder extends AbstractBoardGameBuilder {

    private final BoardGame product = new BoardGame();

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

    @Override
    public BoardGame getGame() {
        return product;
    }
}
