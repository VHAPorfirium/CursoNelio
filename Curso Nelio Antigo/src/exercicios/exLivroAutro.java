package exercicios;

import Classes.LivroAutor;

import java.util.Scanner;

public class exLivroAutro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LivroAutor livroAutor;


        String titulo, autor;
        double preco;
        int desconto, opcao;

        System.out.print("Titulo do livro: ");
        titulo = sc.nextLine();

        System.out.print("Autor: ");
        autor = sc.nextLine();

        System.out.print("Preço: ");
        preco = sc.nextDouble();

        livroAutor = new LivroAutor(titulo, autor, preco);

        System.out.println(livroAutor);

        System.out.print("1- Avista ou 2- parcelado: ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Informe o valor do desconto: ");
            desconto = sc.nextInt();
            livroAutor.alteraPreco(desconto);

            System.out.println(livroAutor.toString(true));

        }
        else if (opcao == 2) {
            System.out.println("Sem desconto.");
            System.out.println();
            System.out.println(livroAutor.toString(false));
        }
        else {
            System.out.println("Opção invalida");
        }


    }
}
