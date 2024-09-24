package Classes;

public class PedidoVenda {

    private int numeroPedido;
    private String data;
    private double valorTotal;

    public PedidoVenda(int numeroPedido, String data, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double aplicarDesconto() {

        return valorTotal *= 0.9 ;

    }

    @Override
    public String toString() {
        return "Numero pedido: " + numeroPedido + "\nData: " + data + "\nValor: " + valorTotal;
    }

    public String toString(boolean comDesconto) {
        if (comDesconto) {

            return "Numero pedido: " + numeroPedido + "\nData: " + data + "\nValor: " + aplicarDesconto() + "\nDesconto: 10%" ;

        }
        else {
            return toString();
        }
    }


}
