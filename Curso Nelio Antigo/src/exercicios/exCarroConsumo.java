package exercicios;

import Classes.CarroConsumo;

import java.util.Scanner;

public class exCarroConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarroConsumo carroConsumo;

        String modelo;
        double capacidadeTanque, consumoPorKm, novoConsumo;
        int opcao;

        System.out.print("Modelo do carro: ");
        modelo = sc.nextLine();

        System.out.print("Capacidade de tanque: ");
        capacidadeTanque = sc.nextDouble();

        System.out.print("Consumo do carro por litro: ");
        consumoPorKm = sc.nextDouble();

        System.out.println();

        carroConsumo = new CarroConsumo(modelo, capacidadeTanque, consumoPorKm);

        System.out.println(carroConsumo);

        System.out.println();

        System.out.println("Deseja atualizar o consumo? 1- sim ou 2- não ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println();

            System.out.print("Novo consumo: ");
            novoConsumo = sc.nextDouble();

            System.out.println();

            carroConsumo.atualizaAutonomia(novoConsumo);

        }
        else {
            System.out.println(carroConsumo);
        }

        System.out.println(carroConsumo);


    }
}
