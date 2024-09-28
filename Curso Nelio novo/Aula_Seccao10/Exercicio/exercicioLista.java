package Aula_Seccao10.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ClasseExercicioLista> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cadastro da pessoa #" + (i + 1));

            System.out.print("ID: ");
            int Id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            ClasseExercicioLista pessoa = new ClasseExercicioLista(Id, nome, salario);
            pessoas.add(pessoa);
        }

        System.out.println("Digite o codigo da pessoas para aumentar o salario: ");
        int id = sc.nextInt();

        ClasseExercicioLista emp = pessoas.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse Id não existe!");
        }
        else {
            System.out.print("Porcentagem: ");
            int porcentagem = sc.nextInt();
            emp.aumento( porcentagem);
        }

        System.out.println("\nLista de pessoas cadastradas:");
        for (ClasseExercicioLista pessoa : pessoas) {
            System.out.println("ID: " + pessoa.getId() + "\nNome: " + pessoa.getNome() + "\nSalário: " + pessoa.getSalario());
        }

    }
}
