package creational.builder;

public class ChessBuilder extends AbstractBoardGameBuilder {

    @Override
    public void buildBoard() {
        product.createBoard("8x8 Board", 16);
    }

    @Override
    public void buildFigures() {
        product.setFigures("16 black & 16 white figures");
    }

    @Override
    public void buildInstructions() {
        product.setInstructions("Introduction to Chess");
    }

    @Override
    public void buildPackaging() {
        product.setPackaging("Wooden Box");
    }

    @Override
    public void wrapping() {
        product.setWrapping(true);
    }

}
