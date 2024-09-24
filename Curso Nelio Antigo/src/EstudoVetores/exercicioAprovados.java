package EstudoVetores;

import java.util.Scanner;

public class exercicioAprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aprovados = "";
        int n;

        System.out.println("Quantos alunos são? ");
        n = sc.nextInt();

        String[] alunos = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        double[] media = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            sc.nextLine();
            alunos[i] = sc.nextLine();
            System.out.print("Nota 1: ");
            notas1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            notas2[i] = sc.nextDouble();

            media[i] = (notas1[i] + notas2[i]) / 2;

        }

        System.out.println();

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                System.out.println(alunos[i]);
            }
        }



    }
}
