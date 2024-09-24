package application;

import java.util.Scanner;
import entities.*;


public class exFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aumento;

         Employee funcionario = new Employee();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();


        System.out.println("Funcionario: " + funcionario.nome + ", R$ " + funcionario.salarioLiquido());

        System.out.print("Porcentagem de aumento: ");
        aumento = sc.nextInt();
        funcionario.adicaoSalario(aumento);


        System.out.print("Salario atualizado: " + funcionario.adicaoSalario(aumento));

    }

}
