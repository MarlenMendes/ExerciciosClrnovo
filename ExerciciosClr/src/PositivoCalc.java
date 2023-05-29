import java.util.Scanner;

public class PositivoCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números (N): ");
        int N = scanner.nextInt();
        int soma = 0;
        System.out.println("Digite os " + N + " números:");

        for (int i = 0; i < N; i++) {
            int numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero;

            } else {

                System.out.println("Número inválido. Digite um número positivo.");

                i--;   // Para compensar a leitura inválida e repetir a iteração

                System.out.println("A soma dos números positivos é: " + soma);



            }
        }scanner.close();

    }

}
