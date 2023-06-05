import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 != numero2) {
            int maior = Math.max(numero1, numero2);
            int menor = Math.min(numero1, numero2);
            System.out.println("Em ordem decrescente: " + maior + ", " + menor);
        } else {
            System.out.println("Os números são iguais. Não é possível ordená-los.");


        }

    }
}
