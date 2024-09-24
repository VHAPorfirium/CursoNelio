import java.util.Scanner;

public class ListaRepeticaoEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha;

        System.out.println("Digite a sua senha: ");
        senha = sc.nextInt();

        while (senha != senhaCorreta) {
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta!!");

        sc.close();
    }
}
