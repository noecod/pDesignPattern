package behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class User {

    private final IChatRoom mediator;

    private final String id;
    private final String name;

    public abstract void send(String msg, String userId);

    public abstract void receive(String msg);
}
