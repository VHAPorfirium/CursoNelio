package application;

import java.util.Scanner;
import entities.Product;

public class exEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeAdicionada;


        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.nome = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantidadeAdicionada = sc.nextInt();
        product.addProduct(quantidadeAdicionada);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantidadeAdicionada = sc.nextInt();
        product.removeProduct(quantidadeAdicionada);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
