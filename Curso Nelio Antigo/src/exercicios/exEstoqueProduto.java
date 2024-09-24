package exercicios;

import Classes.EstoqueProdutos;

import java.util.Scanner;

public class exEstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EstoqueProdutos estoqueProdutos;

        String nome;
        int quantidadeEstoque;
        double precoCompra, precoVenda, novoPrecoVenda;
        char escolha;

        System.out.print("Produto: ");
        nome = sc.nextLine();

        System.out.print("Quantidade no estoque: ");
        quantidadeEstoque = sc.nextInt();

        System.out.print("Preço de compra do produto: ");
        precoCompra = sc.nextDouble();

        System.out.print("Preço de venda: ");
        precoVenda = sc.nextDouble();

        estoqueProdutos = new EstoqueProdutos(nome, quantidadeEstoque, precoCompra, precoVenda);

        System.out.println();

        System.out.println(estoqueProdutos);

        System.out.println("Deseja alterar o valor do preço de venda? ");
        escolha = sc.next().charAt(0);

        if (escolha == 's') {
            System.out.print("Novo preço de venda: ");
            novoPrecoVenda = sc.nextDouble();
            estoqueProdutos.atualizarPrecoVenda(novoPrecoVenda);
            System.out.println(estoqueProdutos);
        }
        else if (escolha == 'n') {
            System.out.println(estoqueProdutos);
        }
        else {
            System.out.println("Opção invalida. ");
        }

    }
}
