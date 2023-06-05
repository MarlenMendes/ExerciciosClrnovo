import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int numeroInverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInverso = numeroInverso * 10 + digito;
            numero /= 10;
            System.out.println("Número na ordem inversa: " + numeroInverso);

        }


    }
}
