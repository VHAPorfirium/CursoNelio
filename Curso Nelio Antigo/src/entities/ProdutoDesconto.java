package entities;

public class ProdutoDesconto {

    public String nome;
    public double preco;
    public double desconto;


    public double calcularPrecoDesconto() {

        return preco - desconto;

    }

    public double novoDesconto(double porcentagem) {

        return calcularPrecoDesconto() - (calcularPrecoDesconto() * (porcentagem / 100));

    }

    public String toString() {
        return "Produto: " + nome + "\nPreço inicial: " + preco + "\nValor do desconto: " + desconto + "\nPreço com desconto inicial: " + calcularPrecoDesconto();
    }

}
