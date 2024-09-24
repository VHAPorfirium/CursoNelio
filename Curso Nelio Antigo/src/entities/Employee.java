package entities;

public class Employee {

    public String nome;
    public double salarioBruto;
    public double imposto;


public double salarioLiquido() {

    return salarioBruto - imposto;

}

public double adicaoSalario(double porcentagem) {

    return (salarioBruto * (porcentagem / 100)) + salarioLiquido();

}



}
