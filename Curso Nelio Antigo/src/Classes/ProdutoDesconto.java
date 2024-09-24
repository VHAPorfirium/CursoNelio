package Classes;

public class ProdutoDesconto {

    private String nomeProduto;
    private double preco;
    private int desconto;


    public ProdutoDesconto(String nomeProduto, double preco, int desconto) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }


    public double calcularPrecoComDesconto() {

        return preco * (1 - (double) desconto / 100);

    }

    public void aplicarDesconto(int novoDesconto) {
        this.preco = calcularPrecoComDesconto();
        this.desconto = novoDesconto;
    }

    public String toString() {
        return "Produto: " + nomeProduto + " Preco: " + preco + " desconto: " + desconto + "%" + " Preço com desconto: " + calcularPrecoComDesconto() ;
    }


}
