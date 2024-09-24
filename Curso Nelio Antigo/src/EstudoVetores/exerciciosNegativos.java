package EstudoVetores;

import java.util.Scanner;

public class exerciciosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Digite um numero entre 0 e 10: ");
        n = sc.nextInt();

        while (n < 0 || n > 10) {
            System.out.print("Numero invalido, digite novamente: ");
            n = sc.nextInt();
        }

        int[] numero = new int[n];

        for (i = 0; i < n; i++) {

            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();

        }

        System.out.println("Numeros Negativos: ");
        for (i = 0; i < n; i++) {

           if (numero[i] < 0) {
               System.out.println(numero[i]);
           }

       }
        sc.close();
    }
}
