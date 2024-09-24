package Classes;

public class LivroAutor {

    private String titulo;
    private String autor;
    private double preco;
    private int desconto;

    public LivroAutor(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.desconto = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
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

    public void alteraPreco(int desconto) {

        this.preco = preco - (preco * ((double) desconto / 100));

    }

    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPreço: " + preco;
    }

    public String toString(boolean comDesconto) {
        if (comDesconto == true) {
            return "Título: " + titulo + "\nAutor: " + autor + "\nPreço: " + preco + "\nDesconto: " + desconto + "%";
        } else {
            return toString();
        }
    }

}
