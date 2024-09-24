package EstudoVetores;

import java.util.Scanner;

public class exercicioMediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, media = 0, soma = 0, contador = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contador++;
            }

        }

        if (contador == 0) {

            System.out.println("Nenhum numero par ");

        }
        else {

            media = soma / contador;

            if (media != 0) {
                System.out.println("Media dos numeros pares: " + media);
            }

        }

        sc.close();

    }
}
