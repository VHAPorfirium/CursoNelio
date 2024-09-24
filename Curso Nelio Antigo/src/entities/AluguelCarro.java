package entities;

public class AluguelCarro {

    public String nome;
    public int idade;
    public String marca;
    public String modelo;
    public String letrasPlacas;
    public int numeroPlacas;
    public String cor;
    public double valorDiaria = 500;
    public int diasAlugados;


    public double valorAluguel() {

        return valorDiaria * diasAlugados;

    }

}
