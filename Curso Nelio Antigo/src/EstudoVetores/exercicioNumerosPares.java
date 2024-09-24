package EstudoVetores;

import java.util.Scanner;

public class exercicioNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, contador = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Numeros pares: ");
        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0) {

                contador++;
                System.out.print(numero[i] + " ");

            }
        }

        System.out.println();

        System.out.println("Quantidade de pares: " + contador);


    }
}
