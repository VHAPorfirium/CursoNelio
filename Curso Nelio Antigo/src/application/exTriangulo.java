package application;

import java.util.Scanner;
import entities.Triangle;

public class exTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pX, pY, AREAX, AREAY;
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medida dos lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas dos lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        AREAX = x.area();

        AREAY = y.area();

        System.out.println("A area do triangulo X: " + AREAX);
        System.out.println("A area do triangulo Y: " + AREAY);

        if (AREAX > AREAY) {
            System.out.println("O triangulo com maior area é o X");
        }
        else {
            System.out.println("O triangulo com maior area é o Y");
        }

        sc.close();

    }
}
