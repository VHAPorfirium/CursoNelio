package EstudoVetores;

import java.util.Scanner;

public class exercicioAbaixoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double media = 0, soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();

            soma += vector[i];

        }

        media = soma / n;

        System.out.println();

        System.out.println("Media: " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++) {
            if (vector[i] < media) {

                System.out.println(vector[i]);

            }
        }

        sc.close();

    }
}
