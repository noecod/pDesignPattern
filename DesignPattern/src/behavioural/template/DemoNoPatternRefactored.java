package behavioural.template;

public class DemoNoPatternRefactored {

    private final static int NUM_OF_MINUS_START_SCENE = 18;
    private final static int NUM_OF_MINUS_END_SCENE = 16;

    private void printTitle() {
        System.out.println("+---------------------+");
        System.out.println("| THE INVISIBLE ENEMY |");
        System.out.println("+---------------------+");
        System.out.println();
    }

    private void startScene(int sceneNo) {
        int lengthDivider = NUM_OF_MINUS_START_SCENE + String.valueOf(sceneNo).length();
        System.out.println("+" + this.repeatedMinus(lengthDivider) + "+");
        System.out.println("| Start scene " + sceneNo + " ... |");
        System.out.println("+" + this.repeatedMinus(lengthDivider) + "+");
    }

    private void endScene(int sceneNo) {
        int lengthDivider = NUM_OF_MINUS_END_SCENE + String.valueOf(sceneNo).length();
        System.out.println("+" + this.repeatedMinus(lengthDivider) + "+");
        System.out.println("| End scene " + sceneNo + " ... |");
        System.out.println("+" + this.repeatedMinus(lengthDivider) + "+");
    }

    private String repeatedMinus(int num) {
        return new String(new char[num]).replace('\0', '-');
    }

    public static void main(String[] args) {
        int sceneNo = 1;

        DemoNoPatternRefactored app = new DemoNoPatternRefactored();

        app.printTitle();

        app.startScene(sceneNo);
        System.out.println("- main actor enters room");
        System.out.println("- main actor: 'Hello everybody!'");
        System.out.println("- group is grumling");
        System.out.println("- big explosion");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("- dust settles");
        System.out.println("- no one is injured");
        System.out.println("- main actor: 'What was that?'");
        System.out.println("- girl: 'I think it came from over there'");
        System.out.println("- lights go out");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("- lights go on again");
        System.out.println("- girl: 'let's move on to the other side'");
        System.out.println("- main actor: 'Ok, let's do that, follow me'");
        System.out.println("- group follows to the lake shore");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);

        sceneNo++;
        app.startScene(sceneNo);
        System.out.println("to be written");
        app.endScene(sceneNo);
    }
}