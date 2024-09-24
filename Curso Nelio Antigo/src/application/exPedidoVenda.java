package application;

import entities.PedidoVenda;

import java.util.Scanner;

public class exPedidoVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        PedidoVenda pedidoVenda = new PedidoVenda();

        System.out.println("Digite o numero do pedido: ");
        pedidoVenda.numeroPedido = sc.nextInt();

        System.out.println("Digite o dia do pedido: ");
        pedidoVenda.data = sc.nextInt();

        System.out.println("Digite o valor total do pedido: ");
        pedidoVenda.valorTotal = sc.nextDouble();

        System.out.println("1- DEBITO, 2- CREDITO: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Valor com desconto: " + pedidoVenda.aplicarDesconto());
            break;
            case 2:
                System.out.println("Valor do pedido: " + pedidoVenda);
            break;
            default:
                System.out.println("Opção invalida");
        }


    }
}
