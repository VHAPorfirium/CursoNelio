package application;

import java.util.Scanner;
import entities.Biblioteca;

public class exBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int adicionarLivro = 0, escolha, removerLivro = 0;

        System.out.print("Título: ");
        biblioteca.titulo  = sc.nextLine();

        System.out.print("Autor: ");
        biblioteca.autor  = sc.nextLine();

        System.out.print("Editora: ");
        biblioteca.editora  = sc.nextLine();

        System.out.print("Ano de publicação: ");
        biblioteca.anoPublicacao = sc.nextInt();

        System.out.print("Numero de exemplares presente: ");
        biblioteca.numeroExemplares = sc.nextInt();

        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("Titulo: " + biblioteca.titulo);
        System.out.println("Autor: " + biblioteca.autor);
        System.out.println("Editora: " + biblioteca.editora);
        System.out.println("Ano: " + biblioteca.anoPublicacao);
        System.out.println("Exemplares presente: " + biblioteca.numeroExemplares);
        System.out.println("/////////////////////////////////////////////////////////////////////////////");

        System.out.println();

        System.out.println("1- adicionar livro");
        System.out.println("2- remover livro");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Quantos exemplares você quer adicionar? ");
                    adicionarLivro = sc.nextInt();
                    adicionarLivro = biblioteca.adicionarExemplares(adicionarLivro);

                System.out.println("Exemplares totais do livro " + biblioteca.titulo + ": " + adicionarLivro);

            break;

            case 2:
                System.out.println("Quantos exemplares você quer remover? ");
                removerLivro = sc.nextInt();
                removerLivro = biblioteca.removerExemplares(removerLivro);

                System.out.println("Exemplares totais do livro " + biblioteca.titulo + ": " + removerLivro);

            break;

            default:
                System.out.println("Opção invalida.");

        }




    }
}
