import java.util.Scanner;

public class ListaCondicionalEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial do jogo: ");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        horaFinal = sc.nextInt();

        duracao = horaFinal - horaInicial;


        if(duracao == 0){
            System.out.println("O jogo durou 24 horas.");
        }
        if ((duracao < 1) || (duracao > 24)) {
            System.out.println("Erro.");
        }
        else {
            System.out.printf("O jogo durou %d horas %n",duracao);
        }

    }
}
