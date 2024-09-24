package exercicios;

import Classes.PedidoVenda;

import java.util.Scanner;

public class exPedidoVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PedidoVenda pedidoVenda;

        String data, pagamento;
        int numeroPedido;
        double valorTotal;

        System.out.print("Numero do pedido: ");
        numeroPedido = sc.nextInt();
        sc.nextLine();
        System.out.print("Data do pedido: ");
        data = sc.nextLine();

        System.out.print("Valor do pedido: ");
        valorTotal = sc.nextDouble();

        pedidoVenda = new PedidoVenda(numeroPedido, data, valorTotal);

        System.out.println();
        System.out.println("Detalhes do pedido");

        System.out.println(pedidoVenda);

        System.out.println();

        System.out.println("Pagamento no credito ou debito? ");
        sc.nextLine();
        pagamento = sc.nextLine();

        if (pagamento.equalsIgnoreCase("debito")) {
            System.out.println();
            System.out.println("Detalhes do pedido");
            System.out.println(pedidoVenda.toString(true));
        }
        else if (pagamento.equalsIgnoreCase("credito")) {
            System.out.println();
            System.out.println("Detalhes do pedido");
            System.out.println(pedidoVenda.toString(false));
        }



    }
}
