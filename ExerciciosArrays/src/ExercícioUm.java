import java.util.ArrayList;
import java.util.List;

public class ExercícioUm {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int elementoRemover = 3;
        if (lista.contains(elementoRemover)) {
            lista.remove(Integer.valueOf(elementoRemover));
            System.out.println("O elemento " + elementoRemover + " foi removido da lista.");
        } else {
            System.out.println("O elemento " + elementoRemover + " não foi encontrado na lista.");
        }

        System.out.println(lista);
    }
}
