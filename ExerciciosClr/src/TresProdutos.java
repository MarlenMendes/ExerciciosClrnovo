import java.util.Scanner;

public class TresProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();
        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();
        double menorPreco;
        if (preco1 < preco2 && preco1 < preco3) {
            menorPreco = preco1;
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            menorPreco = preco2;
            System.out.println("Você deve comprar o segundo produto.");
        } else if (preco3 < preco1 && preco3 < preco2) {
            menorPreco = preco3;
            System.out.println("Você deve comprar o terceiro produto.");
        } else {
            menorPreco = preco1; // Se houver empate, considera o primeiro produto
            System.out.println("Há empate de preços. Você pode escolher qualquer um dos produtos.");
        }

        System.out.println("O produto mais barato custa: R$ " + menorPreco);

        scanner.close();
    }
}
