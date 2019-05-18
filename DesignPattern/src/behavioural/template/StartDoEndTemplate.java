package behavioural.template;

public abstract class StartDoEndTemplate {

    private final static int NUM_OF_MINUS_START_SCENE = 18;
    private final static int NUM_OF_MINUS_END_SCENE = 16;

    public abstract void doIt();

    public void run(int sceneNo) {
        this.startScene(sceneNo);
        this.doIt();
        this.endScene(sceneNo);
    }

    private void startScene(int sceneNo) {
        int lengthDivider = NUM_OF_MINUS_START_SCENE + String.valueOf(sceneNo).length();
        printBetweenDivider("| Start scene " + sceneNo + " ... |", lengthDivider);
    }

    private void endScene(int sceneNo) {
        int lengthDivider = NUM_OF_MINUS_END_SCENE + String.valueOf(sceneNo).length();
        printBetweenDivider("| End scene " + sceneNo + " ... |", lengthDivider);
    }

    private void printBetweenDivider(String text, int num) {
        System.out.println("+" + "-".repeat(num) + "+");
        System.out.println(text);
        System.out.println("+" + "-".repeat(num) + "+");
    }
}