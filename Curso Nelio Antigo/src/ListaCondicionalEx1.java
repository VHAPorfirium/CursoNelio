import java.util.Scanner;
public class ListaCondicionalEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero para saber se ele é negativo ou não: ");
        numero = sc.nextInt();


        if(numero < 0 ){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não negativo.");
        }

    sc.close();

    }
}
