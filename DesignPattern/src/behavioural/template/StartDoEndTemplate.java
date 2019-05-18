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
        printDivider(lengthDivider);
        System.out.println("| Start scene " + sceneNo + " ... |");
        printDivider(lengthDivider);
    }

    private void endScene(int sceneNo) {
        int lengthDivider = NUM_OF_MINUS_END_SCENE + String.valueOf(sceneNo).length();
        printDivider(lengthDivider);
        System.out.println("+ End scene " + sceneNo + " ... |");
        printDivider(lengthDivider);
    }

    private String repeatedMinus(int num) {
        return new String(new char[num]).replace('\0', '-');
    }
    
    private void printDivider(int num) {
        System.out.println("+" + this.repeatedMinus(num) + "+");
    }
}