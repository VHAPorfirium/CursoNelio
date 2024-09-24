import java.util.Scanner;

public class ListaRepeticaoEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores;
        int  alcool = 0, gasolina = 0, diesel = 0;


        System.out.println("Digite sua preferencia dentro do posto: ");
        System.out.println("1- Álcool");
        System.out.println("2- Gasolina");
        System.out.println("3- Disel");
        System.out.println("4- Fim");
        valores = sc.nextInt();

        while (valores != 4) {
            if (valores == 1) {
                alcool = alcool + 1;
            }
            else if (valores == 2) {
                gasolina = gasolina + 1;
            }
            else if (valores == 3) {
                diesel = diesel  + 1;
            }
            valores = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("1- Álcool = " + alcool);
        System.out.println("2- Gasolina = " + gasolina);
        System.out.println("3- Disel = " + diesel);

    sc.close();
    }
}
