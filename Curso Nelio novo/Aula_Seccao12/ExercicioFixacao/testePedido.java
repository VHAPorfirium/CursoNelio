package Aula_Seccao12.ExercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class testePedido {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com a data cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        String dataNascimento = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, sdf.parse(dataNascimento));

        System.out.println("Entre com a data do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.nextLine());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos itens vai ter o pedido? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Entre com o pedido " + i + ": ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();

            System.out.print("Preço do produto: ");
            double preco;
            preco = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, preco);

            System.out.print("Quantidade: ");
            int quantidadeProdutos = sc.nextInt();

            ItemPedido itemPedido = new ItemPedido(quantidadeProdutos, preco, produto);

            pedido.adicionarItem(itemPedido);
        }

        System.out.println();
        System.out.println("Resumo do pedido: ");
        System.out.println(pedido);
        sc.close();
    }
}
