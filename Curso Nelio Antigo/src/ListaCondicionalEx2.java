import java.util.Scanner;
public class ListaCondicionalEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;


        System.out.println("Digite um numero para saber se é par ou impar: ");
        numero = sc.nextInt();

        int resto = numero % 2;

        if(resto == 0){
            System.out.println("Numero par. ");
        }
        else {
            System.out.println("Numero impar. ");
        }

    sc.close();

    }
}
