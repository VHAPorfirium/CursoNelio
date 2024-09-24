package application;

import entities.Student;

import java.util.Scanner;

public class exMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();


        System.out.print("Nome do aluno: ");
        s.nome = sc.nextLine();

        System.out.println("Digite as 3 notas do aluno para saber se ele foi aprovado ou nao: ");
        s.nota1 = sc.nextDouble();
        s.nota2 = sc.nextDouble();
        s.nota3 = sc.nextDouble();

        System.out.println("Media: " + s.media());
        System.out.println(s.aprovacao());

        if (s.media() < 60) {

            System.out.println("Não aprovado!");

        }
        else {

            System.out.println("Aprovado com sucesso!");

        }


    }
}
