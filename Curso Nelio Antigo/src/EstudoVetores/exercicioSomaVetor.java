package EstudoVetores;

import java.util.Scanner;

public class exercicioSomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] valor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            valor[i] = sc.nextDouble();

            soma += valor[i];

        }

        System.out.print("Valores: ");

        for (int i = 0; i < n; i++) {
            System.out.print(valor[i] + " ");
        }

        System.out.println();

        media = soma / n;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

    }
}
