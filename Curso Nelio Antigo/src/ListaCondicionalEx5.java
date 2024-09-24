import java.util.Scanner;

public class ListaCondicionalEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Codigo 1 - cachorro quente = 4 reais.");
        System.out.println("Codigo 2 - X-salada = 4,50 reais.");
        System.out.println("Codigo 3 - X-bacon = 5 reais.");
        System.out.println("Codigo 4 - Torrada Simples = 2 reais.");
        System.out.println("Codigo 5 - Refrigerante = 1,50 reais.");

        System.out.println("Digite qual a escolha: ");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total = %.2f%n", total);

    }
}
