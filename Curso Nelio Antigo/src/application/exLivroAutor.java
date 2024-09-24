package application;

import java.util.Scanner;
import entities.LivroAutor;

public class exLivroAutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LivroAutor livroAutor = new LivroAutor();

        System.out.print("Titulo: ");
        livroAutor.titulo = sc.nextLine();

        System.out.print("Autor: ");
        livroAutor.autor = sc.nextLine();

        System.out.print("Preço: ");
        livroAutor.preco = sc.nextDouble();

        System.out.println("/////////////////// Dados do livro /////////////////// ");
        System.out.println("Titulo: " + livroAutor.titulo);
        System.out.println("Autor: " + livroAutor.autor);
        System.out.println("Preço: " + livroAutor.preco);
    }
}
