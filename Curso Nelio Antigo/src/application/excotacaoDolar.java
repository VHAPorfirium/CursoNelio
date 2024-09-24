package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class excotacaoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cotacao = new CurrencyConverter();

        System.out.print("Digite o valor da cotação do dolar: ");
        cotacao.cotacaoDolar = sc.nextDouble();

        System.out.print("Digite o tanto de dolar você vai comprar: ");
        cotacao.dolaresComprar = sc.nextDouble();

        System.out.println("VALOR TOTAL: " + cotacao.conversao());



    }
}
