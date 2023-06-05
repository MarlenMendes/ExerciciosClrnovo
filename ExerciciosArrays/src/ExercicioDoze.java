import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor = 20;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];
        System.out.println("Digite os " + tamanhoVetor + " elementos do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scanner.nextInt();
            int indiceB = 0;
            int indiceC = 0;
            for (int i1 = 0; i < tamanhoVetor; i++) {
                if (vetorA[i] % 2 == 0) {
                    vetorB[indiceB] = vetorA[i];
                    indiceB++;
                } else {
                    vetorC[indiceC] = vetorA[i];
                    indiceC++;
                    System.out.println("Valores pares (vetor B):");
                    for (int i2 = 0; i < indiceB; i++) {
                        System.out.print(vetorC[i] + " ");
                        System.out.println();


                    }
                }
            }
        }

    }
}
