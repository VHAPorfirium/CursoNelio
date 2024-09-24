package application;

import java.util.Scanner;
import entities.AluguelCarro;

public class exAlugueCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AluguelCarro aluguel = new AluguelCarro();

        System.out.println("Preencha as informações para alugar o carro:");
        System.out.print("Nome: ");
        aluguel.nome = sc.nextLine();

        System.out.print("Idade: ");
        aluguel.idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Marca: ");
        aluguel.marca = sc.nextLine();

        System.out.print("Modelo: ");
        aluguel.modelo = sc.nextLine();

        System.out.print("Cor: ");
        aluguel.cor = sc.nextLine();

        System.out.print("Letras da placa: ");
        aluguel.letrasPlacas = sc.nextLine();

        System.out.print("Numeros da placa: ");
        aluguel.numeroPlacas = sc.nextInt();

        System.out.println("Digite quantos dias vai alugar o carro: ");
        aluguel.diasAlugados = sc.nextInt();

        System.out.println();

        System.out.println("||||||||||||||||||| Recibo |||||||||||||||||||");

        System.out.println();

        System.out.println("Nome do cliente: " + aluguel.nome);
        System.out.println("Idade do cliente: " + aluguel.idade);
        System.out.println("Valor total do aluguel: R$ " + aluguel.valorAluguel());

        System.out.println();

        System.out.println("||||||||||||||||||| Informações do veiculo alugado |||||||||||||||||||");

        System.out.println();

        System.out.println("Marca: " + aluguel.marca);
        System.out.println("Modelo: " + aluguel.modelo);
        System.out.println("Cor: " + aluguel.cor);
        System.out.println("Placa: " + aluguel.letrasPlacas + "-" + aluguel.numeroPlacas);

    }
}
