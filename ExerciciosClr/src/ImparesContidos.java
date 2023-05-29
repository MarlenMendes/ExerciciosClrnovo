import java.util.Scanner;

public class ImparesContidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();
        if (inicio > fim) {
            System.out.println("Intervalo de valores inválido.");
        } else {
            int soma = 0;
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) {
                    soma += i;
                    System.out.println("A soma dos números ímpares no intervalo é: " + soma);
                    scanner.close();

                }
            }
        }
    }
}
