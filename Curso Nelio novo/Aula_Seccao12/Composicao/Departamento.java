package Aula_Seccao12.Composicao;

public class Departamento {

    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Departamento: " + getNome();
    }
}
