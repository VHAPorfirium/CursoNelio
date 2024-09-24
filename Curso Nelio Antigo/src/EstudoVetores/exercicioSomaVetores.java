package EstudoVetores;

import java.util.Scanner;

public class exercicioSomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros vai ter o vetor: ");
        n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorResultante = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Valores do vetor A: ");
            vetorA[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Valores do vetor B: ");
            vetorB[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {

            vetorResultante[i] = vetorA[i] + vetorB[i];

        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorResultante[i] + " ");
        }

    }
}
