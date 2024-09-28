package Aula_Seccao12.Composicao;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalho nivelTrabalho;
    private double salarioBasico;

    private Departamento departamento;
    private List<HorasContratadas> horasContratadas = new ArrayList<>();

    public Trabalhador(String nome, NivelTrabalho nivelTrabalho, double salarioBasico, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.salarioBasico = salarioBasico;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivelTrabalho() {
        return nivelTrabalho;
    }
    public void setNivelTrabalho(NivelTrabalho nivelTrabalho) {
        this.nivelTrabalho = nivelTrabalho;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }
    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContratadas> getHorasContratadas() {
        return horasContratadas;
    }

    public void adicionarContrato(HorasContratadas horasContratadas){
        this.horasContratadas.add(horasContratadas);
    }

    public void removerContrato(HorasContratadas horasContratadas){
        this.horasContratadas.remove(horasContratadas);
    }

    public double calculo(int ano, int mes) {
        double sum = salarioBasico;
        Calendar cal = Calendar.getInstance();
        for (HorasContratadas c : horasContratadas) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (ano == c_year && mes == c_month) {
                sum += c.valorTotal();
            }
        }
        return sum;
    }


}
