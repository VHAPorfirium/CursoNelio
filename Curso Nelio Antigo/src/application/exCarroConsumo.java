package application;

import entities.CarroConsumo;

import java.util.Scanner;

public class exCarroConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarroConsumo carro = new CarroConsumo();
        double consumoAtualizado;

        System.out.print("Modelo: ");
        carro.modelo = sc.nextLine();

        System.out.print("Marca: ");
        carro.marca = sc.nextLine();

        System.out.print("Capacidade do tanque (Litros): ");
        carro.capacidadeTanque = sc.nextDouble();

        System.out.print("Consumo por litro (Km/L): ");
        carro.consumoPorLitro = sc.nextDouble();


        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Autonomia do automovel: " + carro.calcularAutonomia());
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        System.out.println("Novo consumo: ");
        consumoAtualizado = sc.nextDouble();

        consumoAtualizado = carro.atualizarConsumo(consumoAtualizado);

        System.out.println("Nova capacidade: " + consumoAtualizado);







    }
}
