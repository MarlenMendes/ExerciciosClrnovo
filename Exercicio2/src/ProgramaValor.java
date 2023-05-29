import java.util.Scanner;

public class ProgramaValor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println(" R$50,00:  ");

        double valor = entrada.nextDouble();
        System.out.println(" 220: ");
        double hora = entrada.nextDouble();

        System.out.printf(" O seu salário bruto é R$ %.2f " , 1.500 );

        System.out.println(" ");

        double imposto = 1.500 * 0.11;
        System.out.printf(" Valor descontado referente ao imposto de renda R$: %.2f " , imposto );

        System.out.println(" ");

        double inss = 1.500 * 0.08;

        System.out.printf( " Valor descontado referente ao INSS R$: %.2f " , inss);

        System.out.println(" ");

        double sindicato = 1.500 * 0.05 ;
        System.out.printf( " Valor descontado referente ao sindicato R$: %.2f " , sindicato);

        System.out.println(" ");

        double saliq = 1.500 - imposto - inss - sindicato ;
        System.out.printf(" O salario líguido corresponde a R$: %.2f " , saliq);

    }
}
