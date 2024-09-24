package EstudoVetores;

import java.util.Scanner;

public class exercicioDadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, contadorHomem = 0;
        double maiorAltura = 0, menorAltura = 1000000000, mediaAlturaMulher = 0, contadorMulher = 0, totalAlturaMulher = 0;

        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        char[] genero = new char[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Genero (M / F) " + (i + 1) + ": ");
            genero[i] = sc.next().charAt(0);

            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();

            if (genero[i] == 'M' || genero[i] == 'm') {
                contadorHomem++;
            }
            if (genero[i] == 'F' || genero[i] == 'f') {
                totalAlturaMulher += alturas[i];
                contadorMulher++;
            }

        }

        mediaAlturaMulher = totalAlturaMulher / contadorMulher;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.println();

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Media altura mulheres: " + mediaAlturaMulher);
        System.out.println("Numero de homes: " + contadorHomem);

        sc.close();

    }
}
