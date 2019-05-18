package behavioural.mediator;

/**
 * Mediator interface for communication between users.
 */
public interface IChatRoom {

    void sendMessage(String msg, String userId);

    void addUser(User user);
}