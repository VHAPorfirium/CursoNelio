package entities;

public class PedidoVenda {

    public int numeroPedido;
    public int data;
    public double valorTotal;


    public double aplicarDesconto() {

        return this.valorTotal - (valorTotal * 0.10) ;

    }



}
