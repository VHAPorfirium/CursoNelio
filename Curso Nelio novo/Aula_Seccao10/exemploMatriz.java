package Aula_Seccao10;

import java.util.Scanner;

public class exemploMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int numerosNegativos =0;

        System.out.println("Digite os numeros para completar a matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i]);
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    numerosNegativos++;
                }
            }
        }

        System.out.println("Numeros negativos: " + numerosNegativos);


        sc.close();
    }
}
