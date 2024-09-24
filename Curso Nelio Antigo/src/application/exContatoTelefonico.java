package application;

import entities.ContatoTelefonico;

import java.util.Scanner;

public class exContatoTelefonico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContatoTelefonico contatoTelefonico = new ContatoTelefonico();

        System.out.print("Nome: ");
        contatoTelefonico.nome = sc.nextLine();

        System.out.println("Telefone: ");
        contatoTelefonico.telefone = sc.nextInt();

        System.out.println("Email: ");
        contatoTelefonico.email = sc.nextLine();

        System.out.println();


        System.out.println("Dados: ");
        System.out.println("Nome: " + contatoTelefonico.nome);
        System.out.println("Telefone: " + contatoTelefonico.telefone);
        System.out.println("Email: " + contatoTelefonico.email);
        System.out.println();
        System.out.println("Salvo na agenda");

    }
}
