package Aula_Seccao10.Exercicio;

public class ClasseExercicioLista {

    private String nome;
    private int Id;
    private double salario;

    public ClasseExercicioLista( int Id, String nome, double salario) {
        this.Id = Id;
        this.nome = nome;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumento(int porcentagem) {

        this.salario += this.salario * ((double) porcentagem / 100.00);

    }




}
