package Classes;

public class BibliotecaLivros {

    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numeroExemplaresNaBiblioteca;

    public BibliotecaLivros(String titulo, String autor, String editora, int anoPublicacao, int numeroExemplaresNaBiblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numeroExemplaresNaBiblioteca = numeroExemplaresNaBiblioteca;
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

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroExemplaresNaBiblioteca() {
        return numeroExemplaresNaBiblioteca;
    }
    public void setNumeroExemplaresNaBiblioteca(int numeroExemplaresNaBiblioteca) {
        this.numeroExemplaresNaBiblioteca = numeroExemplaresNaBiblioteca;
    }

    public void adicionarExemplares(int adicionarExemplares) {

        numeroExemplaresNaBiblioteca += adicionarExemplares;

    }

    public void removerExemplares(int removerExemplares) {

        numeroExemplaresNaBiblioteca -= removerExemplares;

    }

    public String toString(){

        return "Titulo: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nAno de publicação: " + anoPublicacao + "\nNumero de exemplares na biblioteca: " + numeroExemplaresNaBiblioteca + "\n";

    }


}
