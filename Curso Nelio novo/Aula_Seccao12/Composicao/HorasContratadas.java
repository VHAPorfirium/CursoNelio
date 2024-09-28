package Aula_Seccao12.Composicao;

import java.util.Date;

public class HorasContratadas {

    private Date date;
    private double valorPorHoras;
    private Integer horas;

    public HorasContratadas(){

    }

    public HorasContratadas(Date date, double valorPorHoras, Integer horas) {
        this.date = date;
        this.valorPorHoras = valorPorHoras;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }
    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return valorPorHoras * horas;
    }



}
