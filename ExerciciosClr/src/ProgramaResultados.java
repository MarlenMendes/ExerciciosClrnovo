import java.util.Scanner;

public class ProgramaResultados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cinco números:");

        int soma = 0;
        for (int i = 0; i < 5; i++) {

        }
            int numero = scanner.nextInt();
            soma += numero;
        System.out.println("A soma dos números é: " + soma);

        scanner.close();

    }
}



