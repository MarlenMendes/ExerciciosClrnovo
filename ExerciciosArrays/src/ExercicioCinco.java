import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        double somaSalarios = 0;
        for (int i = 1; i <= quantidadeFuncionarios; i++) {
            System.out.print("Informe o salário do funcionário " + i + ": R$ ");
            double salario = scanner.nextDouble();
            somaSalarios += salario;
            double mediaSalarios = somaSalarios / quantidadeFuncionarios;
            System.out.println("A média salarial da empresa é: R$ " + mediaSalarios);

        }

    }


    }
