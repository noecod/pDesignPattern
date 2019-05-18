package creational.builder;

public class Director {

    public void constructPlain(AbstractBoardGameBuilder builder) {
        builder.buildBoard();
        builder.buildFigures();
        builder.buildInstructions();
        builder.buildPackaging();
    }

    public void constructPresent(AbstractBoardGameBuilder builder) {
        constructPlain(builder);
        builder.wrapping();
    }
}
