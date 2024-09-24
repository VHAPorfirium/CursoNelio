package EstudoVetores;

import java.util.Scanner;

public class exercicioMaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, maior = 0, menor = 1000000000, posicaoMaior = 0, posicaoMenor = 0;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = (i + 1);
            }
        }

        System.out.println();

        System.out.println("maior: " + maior + "\nPosição: " + posicaoMaior);
        System.out.println("menor: " + menor + "\nPosicao: " + posicaoMenor);


    }
}
