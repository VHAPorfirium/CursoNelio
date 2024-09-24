package exercicios;

import Classes.ContatoTelefonico;

import java.util.Scanner;

public class exContatoTelefonico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContatoTelefonico contatoTelefonico;

        String nome, telefone, email, opcao, dadoAuterar;

        System.out.println("Insira os dados do contato");
        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();

        contatoTelefonico = new ContatoTelefonico(nome, telefone, email);

        System.out.println();

        System.out.println(contatoTelefonico);

        System.out.println();

        System.out.println("Deseja auterar algum dado? ");
        opcao = sc.nextLine();

        while (opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("s")) {
            System.out.println("Qual dado deseja auterar?");
            dadoAuterar = sc.nextLine();

            if (dadoAuterar.equalsIgnoreCase("Nome")) {
                System.out.print("Nome: ");
                nome = sc.nextLine();
            }
            if (dadoAuterar.equalsIgnoreCase("Telefone")) {
                System.out.print("Telefone: ");
                telefone = sc.nextLine();
            }
            if (dadoAuterar.equalsIgnoreCase("Email")) {
                System.out.print("Email: ");
            }

            contatoTelefonico = new ContatoTelefonico(nome, telefone, email);

            System.out.println("Deseja auterar algum outro dado? ");
            opcao = sc.nextLine();
        }
        System.out.println();
        System.out.println(contatoTelefonico);

        sc.close();
    }
}
