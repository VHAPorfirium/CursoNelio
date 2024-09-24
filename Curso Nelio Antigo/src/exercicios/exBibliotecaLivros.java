package exercicios;

import Classes.BibliotecaLivros;

import java.util.Scanner;

public class exBibliotecaLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BibliotecaLivros bibliotecaLivros;

        String titulo, autor, editora;
        int anoPublicacao, numeroExemplaresNaBiblioteca, opcao, adicionarLivro, removerLivro;

        System.out.print("Titulo: ");
        titulo = sc.nextLine();

        System.out.print("Autor: ");
        autor = sc.nextLine();

        System.out.print("Editora: ");
        editora = sc.nextLine();

        System.out.print("Ano de publicação: ");
        anoPublicacao = sc.nextInt();

        System.out.print("Numero de exemplares disponiveis: ");
        numeroExemplaresNaBiblioteca = sc.nextInt();

        System.out.println();

        bibliotecaLivros = new BibliotecaLivros(titulo, autor, editora, anoPublicacao, numeroExemplaresNaBiblioteca);

        System.out.println(bibliotecaLivros);

        System.out.print("Deseja adicionar ou remover livros? 1- adicionar livros ou 2- remover livros: ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println();
            System.out.print("Quantidade de livros adicionado: ");
            adicionarLivro = sc.nextInt();
            bibliotecaLivros.adicionarExemplares(adicionarLivro);

        }
        else if (opcao == 2) {
            System.out.println();
            System.out.print("Quantidade de livros removido: ");
            removerLivro = sc.nextInt();
            bibliotecaLivros.removerExemplares(removerLivro);

        }

        System.out.println();

        System.out.println(bibliotecaLivros);

    }
}
