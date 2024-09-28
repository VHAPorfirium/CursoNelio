package Aula_Seccao12.Composicao2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comments = new ArrayList<>();

    public Post(){

    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComments() {
        return comments;
    }

    public void adicionarComentario(Comentario comentario){
        comments.add(comentario);
    }

    public void removerComentario(Comentario comentario){
        comments.remove(comentario);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento)).append("\n");
        sb.append(conteudo).append("\n");
        sb.append("Comentarios: \n");

        for (Comentario comentario : comments){
            sb.append(comentario.getTexto()).append("\n");
        }

        return sb.toString();
    }

}
