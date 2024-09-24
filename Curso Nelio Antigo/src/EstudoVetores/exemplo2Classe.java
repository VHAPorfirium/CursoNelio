package EstudoVetores;

import EstudoVetoresClasse.Exemplo2;

import java.util.Scanner;

public class exemplo2Classe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double valor, soma = 0.0, media;

        System.out.print("N: ");
        n = sc.nextInt();

        Exemplo2[] vect = new Exemplo2[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("valor: ");
            valor = sc.nextDouble();

            vect[i] = new Exemplo2(nome, valor);

        }

        for (int i = 0; i < n; i++) {
            soma += vect[i].getValor();
        }

        media = soma / n;

        System.out.println("Media: " + media);


    }
}
