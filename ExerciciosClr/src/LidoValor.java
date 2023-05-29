import java.util.Scanner;

public class LidoValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {

        }
            int numero = scanner.nextInt();

        if (numero < menorValor) {

        }
            menorValor = numero;

        if (numero > maiorValor) {

        }
            maiorValor = numero;
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }
}
