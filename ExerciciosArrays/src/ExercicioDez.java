public class ExercicioDez {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somaImpares = 0;
        int quantidadeImpares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                somaImpares += vetorA[i];
                quantidadeImpares++;
                double mediaImpares = (double) somaImpares / quantidadeImpares;
                System.out.println("Média dos elementos ímpares: " + mediaImpares);

            }
        }
    }
}
