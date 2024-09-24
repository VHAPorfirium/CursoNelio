package EstudoVetores;

import java.util.Scanner;

public class exercicioMaisVelho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String pessoaMaisVelha = "";
        int n, maisVelho = 0;

        System.out.println("Quantas pessoas voce vai digitar? ");
        n = entrada.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nomes[i] = entrada.next();

            System.out.print("Idade: ");
            idades[i] = entrada.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                pessoaMaisVelha = nomes[i];

            }
        }

        System.out.println();

        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
        System.out.println("Idade da pessoa mais velha: " + maisVelho);

        entrada.close();

    }
}
