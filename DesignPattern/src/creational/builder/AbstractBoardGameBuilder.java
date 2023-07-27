package creational.builder;

public abstract class AbstractBoardGameBuilder {

    protected final BoardGame product = new BoardGame();

    public abstract void buildBoard();

    public abstract void buildFigures();

    public abstract void buildInstructions();

    public abstract void buildPackaging();

    public abstract void wrapping();

    public BoardGame getGame() {
        return product;
    }
}
