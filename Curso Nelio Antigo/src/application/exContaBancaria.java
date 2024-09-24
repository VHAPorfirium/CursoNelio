package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class exContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        int opcao;

        System.out.print("Numero da Conta: ");
        conta.numeroConta = sc.nextLong();

        System.out.print("Nome completo do titular: ");
        conta.nomeTitular = sc.nextLine();

        sc.nextLine();

        System.out.print("Saldo atual da conta: ");
        conta.saldo = sc.nextDouble();

        System.out.print("Valor a movimenta: ");
        conta.valorMovimenta = sc.nextDouble();

        System.out.println();

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1- sacar");
        System.out.println("2- depositar");
        System.out.println("||||||||||||||||||||||||||||||||||||||||");

        opcao = sc.nextInt();


        switch (opcao){
            case 1:
                System.out.println("Saldo atual, pois movimentação: " + conta.sacar());
            break;
            case 2:
                conta.depositar();
                System.out.println("Saldo atual, pois movimentação: " + conta.depositar());
            break;
            default:
                System.out.println("Opção invalida.");

        }



    }
}
