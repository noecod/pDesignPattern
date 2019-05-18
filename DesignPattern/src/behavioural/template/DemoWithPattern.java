package behavioural.template;

public class DemoWithPattern {

    private void printTitle() {
        System.out.println("+---------------------+");
        System.out.println("| THE INVISIBLE ENEMY |");
        System.out.println("+---------------------+");
        System.out.println();
    }

    public static void main(String[] args) {
        int sceneNo = 1;

        DemoWithPattern app = new DemoWithPattern();

        app.printTitle();

        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("- main actor enters room");
                System.out.println("- main actor: 'Hello everybody!'");
                System.out.println("- group is grumbling");
                System.out.println("- big explosion");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("- dust settles");
                System.out.println("- no one is injured");
                System.out.println("- main actor: 'What was that?'");
                System.out.println("- girl: 'I think it came from over there'");
                System.out.println("- lights go out");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("- lights go on again");
                System.out.println("- girl: 'let's move on to the other side'");
                System.out.println("- main actor: 'Ok, let's do that, follow me'");
                System.out.println("- group follows to the lake shore");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");
            }
        }.run(sceneNo);

        sceneNo++;
        new StartDoEndTemplate() {

            @Override
            public void doIt() {
                System.out.println("to be written");

            }
        }.run(sceneNo);
    }
}