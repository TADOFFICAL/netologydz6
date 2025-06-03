import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Список первых клиентов
        List<String> firstClients = List.of(
                "Anya", "Sveta", "Olya",
                "Alexandra", "Ruslana", "Olesya", "Vika"
        );

        // Создаем очередь клиентов
        Queue<String> clientQueue = new LinkedList<>(firstClients);

        // Обрабатываем очередь
        ClientQueue.processClients(clientQueue);
    }
}