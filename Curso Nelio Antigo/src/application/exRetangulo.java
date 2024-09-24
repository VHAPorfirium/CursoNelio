package application;

import java.util.Scanner;
import entities.Rectangle;


public class exRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Digite o valor da altura e largura do retangulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());

    }
}
