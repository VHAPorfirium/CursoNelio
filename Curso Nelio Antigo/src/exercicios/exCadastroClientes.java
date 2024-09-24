package exercicios;

import Classes.CadastroClientes;

import java.util.Scanner;

public class exCadastroClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastroClientes cadastroClientes;

        String nome, email, novoEmail;
        int idade;
        char escolha;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();

        System.out.print("Idade: ");
        idade = sc.nextInt();

        System.out.println();

        cadastroClientes = new CadastroClientes(nome, idade, email);

        System.out.println(cadastroClientes);

        System.out.println();

        System.out.print("Deseja alterar o email: ");
        escolha = sc.next().charAt(0);

        System.out.println();

        if (escolha == 's') {
            System.out.print("Digite o novo email: ");
            sc.nextLine();
            novoEmail = sc.nextLine();
            cadastroClientes.atualizarEmail(novoEmail);
            System.out.println();

            System.out.println(cadastroClientes);

        }
        else if (escolha == 'n') {
            System.out.println(cadastroClientes);
        }

    }
}
