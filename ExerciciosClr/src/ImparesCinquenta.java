public class ImparesCinquenta {
    public static void main(String[] args) {
        int quantidade = 50;
        int soma = 0;
        int contador = 0;
        int numero = 1;
        while (contador < quantidade) {
            if (numero % 2 != 0) {
                soma += numero;
                contador++;
                numero++;
                System.out.println("A soma dos 50 primeiros números ímpares é: " + soma);

            }
        }
    }
}