import java.util.Scanner;
public class ListaCondicionalEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroA, numeroB, calculo, resto;

        System.out.println("Digite dois numeros para saber se eles sao primos: ");
        numeroA = sc.nextInt();
        numeroB = sc.nextInt();

        calculo = numeroA / numeroB;

        if (calculo == 0) {
            System.out.println("Sao primos!!");
        }
        else {
            System.out.println("Nao sao primos");
        }
    sc.close();
    }
}
