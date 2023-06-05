public class ExercicioOito {
    public static void main(String[] args) {
        int limiteInferior = 100;
        int limiteSuperior = 150;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            int numero = i;
            int somaDigitos = 0;
            while (numero != 0) {
                int digito = numero % 10;
                somaDigitos += digito;
                numero /= 10;
                if (somaDigitos % 2 == 0) {
                    System.out.println(i);

                }
            }
        }
    }
}
