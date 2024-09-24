package Classes;

public class ContatoTelefonico {

    private String nome;
    private String telefone;
    private String email;

    public ContatoTelefonico(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void atualizarNome(String nome){
        this.nome = nome;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void atualizarEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados do contato " + "\nNome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email;
    }


}
