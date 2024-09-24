package EstudoVetores;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double media, soma = 0;

        System.out.print("N: ");
        n = sc.nextInt();

        double[] vect = new double [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura: ");
            vect[i] = sc.nextDouble();

            soma += vect[i];

        }

        media = soma / n;

        System.out.println();

        System.out.println("Media das alturas" + media);

    }
}
