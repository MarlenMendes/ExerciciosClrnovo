import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");

            int numero = scanner.nextInt();

            numeros.add(numero);

        }System.out.println("Números digitados na ordem inversa:");
        Collections.reverse(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
        
    }
    }


