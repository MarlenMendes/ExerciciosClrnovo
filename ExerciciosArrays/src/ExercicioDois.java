import java.util.ArrayList;
import java.util.List;

public class ExercicioDois {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        int elementoInserir = 10;
        int posicaoInserir = 2;

        if (posicaoInserir >= 0 && posicaoInserir >= lista.size()) {
            lista.add(posicaoInserir, elementoInserir);
            System.out.println("O elemento " + elementoInserir + " foi inserido na posição " + posicaoInserir + ".");
        } else {
            System.out.println("Posição inválida. A posição deve estar entre 0 e " + lista.size() + ".");
            System.out.println(lista);

        }
    }
}
