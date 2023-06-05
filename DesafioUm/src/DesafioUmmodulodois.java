import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DesafioUmmodulodois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numerosAcertados = new ArrayList<>();
        List<Integer> numerosErrados = new ArrayList<>();
        int pontuacaoTotal = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1 - Fácil (números entre 1 e 10)");
        System.out.println("2 - Médio (números entre 1 e 50)");
        System.out.println("3 - Difícil (números entre 1 e 100)");
        System.out.print("Digite o número correspondente ao nível de dificuldade: ");
        int nivelDificuldade = scanner.nextInt();

        int minNumero, maxNumero;
        switch (nivelDificuldade) {
            case 1:
                minNumero = 1;
                maxNumero = 10;
                break;
            case 2:
                minNumero = 1;
                maxNumero = 50;
                break;
            case 3:
                minNumero = 1;
                maxNumero = 100;
                break;
            default:
                System.out.println("Opção inválida. Reinicie o jogo.");
                return;
        }
        boolean jogarNovamente = true;
        while (jogarNovamente) {
            int numeroSorteado = random.nextInt(maxNumero - minNumero + 1) + minNumero;
            int pontuacaoRodada = 0;

            System.out.println("Digite um número entre " + minNumero + " e " + maxNumero + ": ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSorteado) {
                pontuacaoRodada = 10;
                numerosAcertados.add(numeroUsuario);
                System.out.println("Parabéns! Você acertou o número.");
            } else if (numeroUsuario == numeroSorteado - 1 || numeroUsuario == numeroSorteado + 1) {
                pontuacaoRodada = 5;
                numerosAcertados.add(numeroUsuario);
                System.out.println("Quase lá! O número correto era " + numeroSorteado + ".");
            } else {
                numerosErrados.add(numeroUsuario);
                System.out.println("Você errou. O número correto era " + numeroSorteado + ".");

            }
            pontuacaoTotal += pontuacaoRodada;
            System.out.println("Pontuação da rodada: " + pontuacaoRodada);
            System.out.println("Pontuação total: " + pontuacaoTotal);


            System.out.print("Deseja jogar novamente? (S/N): ");
            String jogarNovamenteInput = scanner.next();
            jogarNovamente = jogarNovamenteInput.equalsIgnoreCase("S");

        }
        System.out.println("Fim do jogo. Pontuação total: " + pontuacaoTotal);
        System.out.println("Números acertados: " + numerosAcertados);
        System.out.println("Números errados: " + numerosErrados);
    }
}

