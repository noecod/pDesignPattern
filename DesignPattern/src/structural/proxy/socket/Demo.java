package structural.proxy.socket;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Run the demo as following:
 * - java -cp DesignPattern-0.0.1-SNAPSHOT.jar structural.proxy.socket.Demo first
 * - java -cp DesignPattern-0.0.1-SNAPSHOT.jar structural.proxy.socket.Demo second
 * and follow the instructions
 */
@AllArgsConstructor
@Getter
public class Demo {

    private final String clientName;

    public void run() {
        // 3. The client deals with the wrapper
        ISocket socket = new SocketProxy("127.0.0.1", 8080, getClientName().equals("first"));
        String str;
        boolean skip = true;
        while (true) {
            if (getClientName().equals("second") && skip) {
                skip = !skip;
            } else {
                str = socket.readLine();
                System.out.println(getClientName() + ": receive message - " + str);
                if (str.equals(null)) {
                    break;
                }
            }
            System.out.print(getClientName() + ": send message ---- ");
            str = new Scanner(System.in).nextLine();
            socket.writeLine(str);
            if (str.equals("quit")) {
                break;
            }
        }
        socket.dispose();
    }

    public static void main(String[] args) {
        Demo client = new Demo(args[0]);
        client.run();
    }
}
