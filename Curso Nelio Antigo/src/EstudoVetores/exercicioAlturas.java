package EstudoVetores;

import java.util.Scanner;

public class exercicioAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, idadeContador = 0;
        double somaAlturas = 0, mediaAlturas = 0, porcentagemIdade = 0;

        System.out.print("Quantas pessoas serão digitada? ");
        n = sc.nextInt();

        String [] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

            somaAlturas += altura[i];

            if (idade[i] < 16) {
                idadeContador++;
            }
        }

        mediaAlturas = somaAlturas / n;

        porcentagemIdade = ((double) idadeContador / n) * 100;

        System.out.println("Altura media: " + mediaAlturas);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemIdade + "%. ");
        System.out.println("Nomes: ");

        for(int i=0; i<n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }
    }
}
