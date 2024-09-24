package Classes;

public class EstoqueProdutos {

    private String nome;
    private int quantidadeEstoque;
    private double precoCompra;
    private double precoVenda;

    public EstoqueProdutos(String nome, int quantidade, double precoCompra, double precoVenda) {
        this.nome = nome;
        this.quantidadeEstoque = quantidade;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void atualizarPrecoVenda(double novoPrecoVenda) {

        this.precoVenda = novoPrecoVenda;

    }

    public double calcularLucro (){

        return precoVenda - precoCompra;

    }

    public String toString(){
        return "Porduto: " + nome + "\nQuantidade no estoque: " + quantidadeEstoque + "\nPreço de compra do produto: " + precoCompra + "\nPreço de venda do produto: " + precoVenda + "\nLucro potencial: " + calcularLucro();
    }

}
