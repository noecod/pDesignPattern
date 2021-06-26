package creational.builder;

public class Demo {

    public static void main(String[] args) {
        BoardGame[] bg = new BoardGame[4];

        Demo gbt = new Demo();
        Director d = gbt.new Director();

        ChessBuilder chessB = gbt.new ChessBuilder();
        ScrabbleBuilder scrabbleB = gbt.new ScrabbleBuilder();
        d.constructPlain(chessB);
        bg[0] = chessB.getGame();
        d.constructPlain(scrabbleB);
        bg[1] = scrabbleB.getGame();

        chessB = gbt.new ChessBuilder();
        scrabbleB = gbt.new ScrabbleBuilder();
        d.constructPresent(chessB);
        bg[2] = chessB.getGame();
        d.constructPresent(scrabbleB);
        bg[3] = scrabbleB.getGame();

        for (int i = 0; i < bg.length; i++) {
            printG(bg[i]);
        }
    }

    public static void printG(BoardGame bg) {
        System.out.println("Board Game:");
        System.out.println("board: " + bg.board.name + " with " + bg.board.numOfFields + " fields");
        System.out.println("figures: " + bg.figures);
        System.out.println("instructions: " + bg.instructions);
        System.out.println("packaging: " + bg.packaging);
        System.out.println("wrapping: " + (bg.wrapping ? "yes" : "no"));
        System.out.println();
    }

    // ----- pattern

    private class Director {

        public void constructPlain(BoardGameBuilder builder) {
            builder.buildBoard();
            builder.buildFigures();
            builder.buildInstructions();
            builder.buildPackaging();
        }

        public void constructPresent(BoardGameBuilder builder) {
            constructPlain(builder);
            builder.wrapping();
        }
    }

    private abstract class BoardGameBuilder {

        public abstract void buildBoard();

        public abstract void buildFigures();

        public abstract void buildInstructions();

        public abstract void buildPackaging();

        public abstract void wrapping();

        public abstract BoardGame getGame();
    }

    // ----- concrete builders

    private class ChessBuilder extends BoardGameBuilder {

        private BoardGame product = new BoardGame();

        @Override
        public void buildBoard() {
            product.board = new Board("8x8 Board", 16);
        }

        @Override
        public void buildFigures() {
            product.figures = "16 black & 16 white figures";
        }

        @Override
        public void buildInstructions() {
            product.instructions = "Introduction to Chess";
        }

        @Override
        public void buildPackaging() {
            product.packaging = "Wooden Box";
        }

        @Override
        public void wrapping() {
            product.wrapping = true;
        }

        @Override
        public BoardGame getGame() {
            return product;
        }
    }

    private class ScrabbleBuilder extends BoardGameBuilder {

        private BoardGame product = new BoardGame();

        @Override
        public void buildBoard() {
            product.board = new Board("15x15 Board", 225);
        }

        @Override
        public void buildFigures() {
            product.figures = "many letters";
        }

        @Override
        public void buildInstructions() {
            product.instructions = "Introduction to Scrabble";
        }

        @Override
        public void buildPackaging() {
            product.packaging = "Cardboard Box";
        }

        @Override
        public void wrapping() {
            product.wrapping = true;
        }

        @Override
        public BoardGame getGame() {
            return product;
        }
    }

    // ---- the product

    private class BoardGame {

        public Board board;
        public String figures;
        public String instructions;
        public String packaging;
        public boolean wrapping = false;
    }

    private class Board {

        public String name;
        public int numOfFields;

        public Board(String name, int nof) {
            this.name = name;
            this.numOfFields = nof;
        }
    }
}