package EstudoVetores;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media;

        System.out.print("Total de produtos: ");
        n = sc.nextInt();

        String[] produtos = new String[n];
        double[] valores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° produto: ");
            sc.nextLine();
            produtos[i] = sc.nextLine();

            System.out.println("Valor: ");
            valores[i] = sc.nextDouble();

            soma += valores[i];

        }

        media = soma / n;

        System.out.println();
        System.out.println("Media dos valores dos produtos: R$ " + media);

        sc.close();
    }
}
