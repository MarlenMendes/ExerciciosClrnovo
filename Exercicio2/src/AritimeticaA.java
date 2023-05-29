import java.util.Scanner;

public class AritimeticaA {
    public static void main(String[] args) {

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        double primeiraNota = entradaDoUsuario.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double segundaNota = entradaDoUsuario.nextDouble();

        System.out.print("Digite a sua terceira nota: ");
        double terceiraNota = entradaDoUsuario.nextDouble();

        System.out.print("Digite a sua quarta nota: ");
        double quartaNota = entradaDoUsuario.nextDouble();

        double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.print(" A sua media aritmética final é: " + mediaGeral);











    }

    }
