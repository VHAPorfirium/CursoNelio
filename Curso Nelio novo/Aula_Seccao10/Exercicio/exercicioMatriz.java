package Aula_Seccao10.Exercicio;

import java.util.Scanner;

public class exercicioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m,n;

        System.out.print("Linha: ");
        m = sc.nextInt();

        System.out.print("Coluna: ");
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Matriz: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o numero para achar a posição: ");
        int numero = sc.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }


        sc.close();



    }
}
