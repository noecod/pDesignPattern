package behavioural.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete mediator.
 */
public class ChatRoom implements IChatRoom {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User user = usersMap.get(userId);
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        usersMap.put(user.getId(), user);
    }
}
