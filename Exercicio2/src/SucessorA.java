import java.util.Scanner;

public class SucessorA {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("20:");


        int num = entrada.nextInt();
        int antes = num - 19 ;

        System.out.print(" O antecessor deste número é: " + antes);
        int depois = num + 21 ;

        System.out.println( " O sucessor deste número é: " + depois);


    }
}
