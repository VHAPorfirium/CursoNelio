package Aula_Seccao12.Composicao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class testePoste {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem!");

        Comentario c2 = new Comentario("OOH ISSO É MUITO LEGAL!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando a nova zelandia.", "Eu estou indo visitar um belo pais.", 12);

        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);

        sc.close();
    }
}
