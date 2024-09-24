package exercicios;

import Classes.AluguelCarro;
import java.util.Scanner;

public class exAluguelCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AluguelCarro aluguelCarro;

        String modelo, marca, placa;
        double valorAluguel;
        int diasAlugados;

        System.out.print("Marca: ");
        marca = sc.nextLine();

        System.out.print("Modelo: ");
        modelo = sc.nextLine();

        System.out.print("Placa: ");
        placa = sc.nextLine();

        aluguelCarro = new AluguelCarro(marca, modelo, placa);

        System.out.println();

        System.out.println(aluguelCarro.toString(false));

        System.out.println();

        System.out.print("Dias a alugar: ");
        diasAlugados = sc.nextInt();

        System.out.print("Valor diário do Aluguel: ");
        valorAluguel = sc.nextDouble();

        aluguelCarro.setValorAluguel(valorAluguel);
        aluguelCarro.calculaValorAluguel(diasAlugados);

        System.out.println();

        System.out.println(aluguelCarro.toString(true));

        sc.close();
    }
}
