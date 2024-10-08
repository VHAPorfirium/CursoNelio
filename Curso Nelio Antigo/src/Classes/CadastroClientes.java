package Classes;

public class CadastroClientes {

    private String nome;
    private int idade;
    private String email;

    public CadastroClientes(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void atualizarEmail(String novoEmail) {

        this.email = novoEmail;

    }

    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nEmail: " + email;
    }

}
