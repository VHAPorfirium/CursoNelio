import java.util.Scanner;

public class CondicionalEXEMPLO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double minutos, total, minutosAmais;

        System.out.println("Digite a quantidade de minutos conusumidos: ");
        minutos = sc.nextDouble();

        minutosAmais = (minutos - 100) * 2;

        if (minutos > 100){
            total = 50 + minutosAmais;
            System.out.println("Valor a pagar = " + total);
        }
        else {
            System.out.println("Valor a pagar = 50 reais"  );
        }


    }
}
