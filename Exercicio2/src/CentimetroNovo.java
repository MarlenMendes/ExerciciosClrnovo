import java.util.Scanner;

public class CentimetroNovo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print(" 2,36 ");

        float metros = entrada.nextFloat();
        float centimetros = metros * 100;

        System.out.printf("%.1f cm",centimetros);




    }
}
