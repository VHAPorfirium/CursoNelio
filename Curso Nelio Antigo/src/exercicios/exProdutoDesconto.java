package exercicios;

import Classes.ProdutoDesconto;

import java.util.Scanner;

public class exProdutoDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProdutoDesconto produtoDesconto;

        String nome;
        double preco;
        int desconto, novoDesconto;
        char escolha;

        System.out.print("Produto: ");
        nome = sc.nextLine();

        System.out.print("Valor: ");
        preco = sc.nextDouble();

        System.out.print("Porcentagem do Desconto: ");
        desconto = sc.nextInt();

        produtoDesconto = new ProdutoDesconto(nome, preco, desconto);

        System.out.println(produtoDesconto);

        System.out.print("Aplicar novo Desconto? ");
        escolha = sc.next().charAt(0);

        if (escolha == 's') {
            System.out.print("Porcentagem do novo desconto: ");
            novoDesconto = sc.nextInt();
            produtoDesconto.aplicarDesconto(novoDesconto);

        }

        System.out.println(produtoDesconto);

        sc.close();
    }
}
