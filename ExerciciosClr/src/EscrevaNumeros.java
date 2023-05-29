import java.util.Scanner;

public class EscrevaNumeros
{public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println(" Olá, esse programa irá calcular média de números digitados pelo usuário");
    System.out.println("--------------------------------------------------");
    System.out.println("Quantos números você deseja calcular a média: ");
    int qtnumeros = entrada.nextInt();
    int soma = 0;
    int i = 1;

    while (i <= qtnumeros){

    }
        System.out.println("Digite o numero " + i + ":");

    double numero = entrada.nextDouble();

    soma += numero;
    i++;
    double media = (double) soma / qtnumeros;

    System.out.println("A média dos número(s) digitado(s) é: " + media);

}
}
