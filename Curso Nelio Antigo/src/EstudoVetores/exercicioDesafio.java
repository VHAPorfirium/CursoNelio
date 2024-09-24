package EstudoVetores;

import java.util.Scanner;

public class exercicioDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos quartos serão alugados?");
        n = sc.nextInt();

        String[] nomes = new String[n];
        String[] emails = new String[n];
        int[] quartos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° aluguel: ");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("E-mail: ");
            emails[i] = sc.next();

            System.out.print("Quarto: ");
            quartos[i] = sc.nextInt();

            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (quartos[j] > quartos[j + 1]) {
                    int tempQuarto = quartos[j];
                    quartos[j] = quartos[j + 1];
                    quartos[j + 1] = tempQuarto;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;

                    String tempEmail = emails[j];
                    emails[j] = emails[j + 1];
                    emails[j + 1] = tempEmail;
                }
            }
        }

        System.out.println("Resumo");
        for (int i = 0; i < n; i++) {
            System.out.println("nome: " + nomes[i]);
            System.out.println("email: " + emails[i]);
            System.out.println("quarto: " + quartos[i]);
        }

        sc.close();
    }
}

