import java.util.LinkedList;
import java.util.Queue;

public class ZerarFilaBanco

{public static void main(String[] args) {

    Queue<String> filaBanco = new LinkedList<>();
    // adicionando clientes à fila do banco
    filaBanco.offer("Cliente 1");
    filaBanco.offer("Cliente 2");
    filaBanco.offer("Cliente 3");
    filaBanco.offer("Cliente 4");
    filaBanco.offer("Cliente 5");

    System.out.println("Fila inicial do banco: " + filaBanco);

    // Zerando a fila do banco

    while (!filaBanco.isEmpty()) {
        String cliente = filaBanco.poll();
        System.out.println("Atendendo o cliente: " + cliente);
        System.out.println("Fila do banco zerada.");

    }







}
}

