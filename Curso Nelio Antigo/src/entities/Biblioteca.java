package entities;

public class Biblioteca {


    public String titulo;
    public String autor;
    public String editora;
    public int anoPublicacao;
    public int numeroExemplares;



public int adicionarExemplares(int adicionarLivro) {

    return numeroExemplares + adicionarLivro;


}

public int removerExemplares(int removerLivro) {

    return numeroExemplares - removerLivro;

}

}
