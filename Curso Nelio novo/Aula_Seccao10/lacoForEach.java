package Aula_Seccao10;

public class lacoForEach {
    public static void main(String[] args) {

        String [] vect = new String [] {"Victor", "NINFA", "Maju"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i] + " ");
        }

        System.out.println("-----------------------------------");
        for (String v : vect) {

            System.out.println(v);

        }
    }
}
