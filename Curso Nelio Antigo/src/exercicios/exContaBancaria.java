package exercicios;

import java.util.Scanner;

import Classes.ContaBancaria;

public class exContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;

        int numeroConta;
        double depositoInicial, deposito, sacar;
        String nome;
        char resposta;

        System.out.print("Conta: ");
        numeroConta = sc.nextInt();

        System.out.print("Nome: ");
        sc.nextLine();
        nome = sc.nextLine();

        System.out.print("Deposito inicial? (y/n) ");
        resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Valor: ");
            depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(nome, numeroConta, depositoInicial);
        }
        else {
            contaBancaria = new ContaBancaria(numeroConta, nome);
        }

        System.out.println();

        System.out.println("Conta: ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Entre com o deposito: ");
        deposito = sc.nextDouble();
        contaBancaria.depositar(deposito);
        System.out.println("Conta atualizada: ");
        System.out.println(contaBancaria);
        System.out.println();

        System.out.println("Entre com o saque: ");
        sacar = sc.nextDouble();
        contaBancaria.sacar(sacar);
        System.out.println("Conta atualizada: ");
        System.out.println(contaBancaria);

        sc.close();

    }
}
