import java.util.Scanner;

public class MediaNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int N = scanner.nextInt();
        int soma = 0;

        System.out.println("Digite os " + N + " números:");

        for (int i = 0; i < N; i++) {
            int numero = scanner.nextInt();
            double media = (double) soma / N;

            System.out.println("A média dos números é: " + media);

            scanner.close();

        }
    }
}
