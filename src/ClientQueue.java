import java.util.Queue;
import java.util.LinkedList;

public class ClientQueue {
    public static void processClients(Queue<String> clients) {
        while (!clients.isEmpty()) {
            String currentClient = clients.poll();
            System.out.println(currentClient + " сделал новый маникюр.");

            if (Math.random() < 0.5) {
                String friendName = "a friend of " + currentClient;
                System.out.println(friendName + " записался.");
                clients.offer(friendName);
            } else {
                System.out.println("У " + currentClient + " не было друзей на этот раз.");
            }
        }
    }
}