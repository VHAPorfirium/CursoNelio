package application;

import entities.CadastroCliente;

import java.util.Scanner;

public class exCadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        String email;

        CadastroCliente cadastroCliente = new CadastroCliente();

        System.out.println("Ficha de cadastro");
        System.out.print("Digite o seu nome: ");
        cadastroCliente.nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        cadastroCliente.idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o seu email: ");
        cadastroCliente.email = sc.nextLine();


        System.out.println("|||||||||||||||||| Ficha de cadastro ||||||||||||||||||");
        System.out.println();
        System.out.println("nome: " + cadastroCliente.nome);
        System.out.println("idade: " + cadastroCliente.idade);
        System.out.println("email: " + cadastroCliente.email);
        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("Deseja atualizar o email? 1- Sim e 2- Não ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                sc.nextLine();
                System.out.print("Digite novamento o email: ");
                email = sc.nextLine();
                email = cadastroCliente.atualizar(email);

                System.out.println();

                System.out.println("|||||||||||||||||| Ficha de cadastro atualizada ||||||||||||||||||");
                System.out.println();
                System.out.println("nome: " + cadastroCliente.nome);
                System.out.println("idade: " + cadastroCliente.idade);
                System.out.println("email: " + email);
                System.out.println();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            break;
            case 2:
                System.out.println("|||||||||||||||||| Ficha de cadastro ||||||||||||||||||");
                System.out.println();
                System.out.println("nome: " + cadastroCliente.nome);
                System.out.println("idade: " + cadastroCliente.idade);
                System.out.println("email: " + cadastroCliente.email);
                System.out.println();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            break;

            default:
                System.out.println("Opção invalida.");

        }




    }
}
