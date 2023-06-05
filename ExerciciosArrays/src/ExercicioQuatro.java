import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 10;
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int contadorMulheres = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;

                if (altura < menorAltura) {

                }
                    menorAltura = altura;

                if (sexo.equalsIgnoreCase("M")) {
                    somaAlturaHomens += altura;
                } else if (sexo.equalsIgnoreCase("F")) {
                    contadorMulheres++;
                    double mediaAlturaHomens = somaAlturaHomens / quantidadePessoas;

                    System.out.println("\nResultados:");
                    System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
                    System.out.println("Menor altura do grupo: " + menorAltura + " metros");
                    System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " metros");
                    System.out.println("Número de mulheres: " + contadorMulheres);

                }

                }

        }
    }


    }