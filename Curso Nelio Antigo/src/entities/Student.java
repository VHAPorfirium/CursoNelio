package entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;


    public double media() {

        return nota1 + nota2 + nota3;


    }

    public double aprovacao() {


        if (media() < 60) {
            return 60 - media();
            
        }
        else {
            return 0.0;
        }

    }

}

