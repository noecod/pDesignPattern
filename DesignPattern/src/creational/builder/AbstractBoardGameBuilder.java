package creational.builder;

public abstract class AbstractBoardGameBuilder {

    public abstract void buildBoard();

    public abstract void buildFigures();

    public abstract void buildInstructions();

    public abstract void buildPackaging();

    public abstract void wrapping();

    public abstract BoardGame getGame();
}
