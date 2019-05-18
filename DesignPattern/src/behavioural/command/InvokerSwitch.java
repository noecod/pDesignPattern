package behavioural.command;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

/**
 * Invoker of commands. Can hold a history. Could implement undo and redo functionality.
 */
@NoArgsConstructor
public class InvokerSwitch {

    private List<ICommand> history = new ArrayList<>();

    public void execute(ICommand command) {
        command.execute();
        history.add(command);
    }

    public void showHistory() {
        System.out.println("\nCommand history:");
        int index = 1;
        for (ICommand command : history) {
            System.out.printf("%2d. command: %s\n", index++, command.toString());
        }
    }
}
