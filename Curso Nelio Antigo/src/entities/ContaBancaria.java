package entities;

public class ContaBancaria {

    public String nomeTitular;
    public long numeroConta;
    public double saldo;
    public double valorMovimenta;


    public double depositar() {

        return this.saldo + valorMovimenta;

    }

    public double sacar() {

        return this.saldo + valorMovimenta;

    }


}
