package application;

import entities.ProdutoDesconto;

import java.util.Scanner;

public class exProdutoDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double porcentagem, valorFinal;

        ProdutoDesconto produto = new ProdutoDesconto();

        System.out.print("Produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Desconto do produto: ");
        produto.desconto = sc.nextDouble();

        System.out.println("\n" + produto);

        System.out.print("\nPorcentagem do novo desconto: ");
        porcentagem = sc.nextDouble();

        valorFinal = produto.novoDesconto(porcentagem);

        System.out.println("\nProduto: " + produto.nome);
        System.out.println("Valor do desconto: " + produto.desconto);
        System.out.println("Valor final do produto com o novo desconto: " + valorFinal);

        sc.close();
    }
}
