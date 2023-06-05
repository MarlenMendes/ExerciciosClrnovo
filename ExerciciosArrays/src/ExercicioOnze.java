import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetorA = new int[tamanhoVetor];

        System.out.println("Digite as " + tamanhoVetor + " idades:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scanner.nextInt();
            System.out.println("Digite as " + tamanhoVetor + " idades:");

            for (int i1 = 0; i < tamanhoVetor; i++) {
                vetorA[i] = scanner.nextInt();

                int menorIdade = vetorA[0];
                int posicaoMenor = 0;
                int maiorIdade = vetorA[0];
                int posicaoMaior = 0;

                for (int it = 0; i < tamanhoVetor; i++) {

                    if (vetorA[i] < menorIdade) {
                        menorIdade = vetorA[i];
                        posicaoMenor = i;

                        if (vetorA[i] > maiorIdade) {
                            maiorIdade = vetorA[i];
                            posicaoMaior = i;
                            System.out.println("Menor idade: " + menorIdade + ", posição: " + posicaoMenor);
                            System.out.println("Maior idade: " + maiorIdade + ", posição: " + posicaoMaior);

                        }
                    }

                }





            }

            }



    }

    }



