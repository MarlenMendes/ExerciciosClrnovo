import java.util.Scanner;

public class PorHora {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double sal_hora = teclado.nextDouble();
        System.out.print(" 1.200,00 ");

        double hora_trab = teclado.nextDouble ();
        System.out.print(" 24,00 ");

        teclado.close();
        double salario_mes = sal_hora * hora_trab;
        System.out.print("1200,00  + 24,00 ");

        System.out.println("O salário mensal é = " + salario_mes);






    }

}
