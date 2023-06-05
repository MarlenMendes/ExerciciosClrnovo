import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int tamanhoMatriz = 20;
        int[] numeros = new int[tamanhoMatriz];

        System.out.println("Digite os " + tamanhoMatriz + " números:");

        for (int i = 0; i < tamanhoMatriz; i++) {
            numeros[i] = scanner.nextInt();

            int soma = 0;

            for (int i1 = 0; i < tamanhoMatriz; i++) {
                soma += numeros[i];
                System.out.println("A soma dos números é: " + soma);





            }
        }



    }

}
