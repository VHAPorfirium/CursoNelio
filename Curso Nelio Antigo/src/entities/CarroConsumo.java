package entities;

public class CarroConsumo {

    public String modelo;
    public String marca;
    public double capacidadeTanque;
    public double consumoPorLitro;




    public double calcularAutonomia(){

        return this.capacidadeTanque * this.consumoPorLitro;

    }

    public double atualizarConsumo(double consumoAtualizado) {

        return this.capacidadeTanque * consumoAtualizado;

    }

}
