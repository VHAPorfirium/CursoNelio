package Classes;

public class ContaBancaria {

    private String nome;
    private int numeroConta;
    private double saldo;

    //Construtores:

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }


    public ContaBancaria(String nome, int numeroConta, double depositoInicial) {

        this.nome = nome;
        this.numeroConta = numeroConta;
        depositar(depositoInicial);

    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor + 5) {
            this.saldo -= valor + 5;
        }
        else {

            System.out.println("Saldo insuficiente");

        }

    }

    public String toString() {
        return "Conta: " + numeroConta + ", Nome: " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
    }



}
