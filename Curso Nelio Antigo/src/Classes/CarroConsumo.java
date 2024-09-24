package Classes;

public class CarroConsumo {

    private String modelo;
    private double capacidadeTanque;
    private double consumoPorLitro;

    public CarroConsumo(String modelo, double capacidadeTanque, double consumoPorLitro) {
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoPorLitro = consumoPorLitro;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getConsumoPorLitro() {
        return consumoPorLitro;
    }
    public void setConsumoPorLitro(double consumoPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
    }

    public double calculaAutonomia() {

        return this.capacidadeTanque * this.consumoPorLitro;

    }

    public void atualizaAutonomia(double novoCosumo) {

        this.consumoPorLitro = novoCosumo;

    }

    public String toString(){
        return "Modelo: " + modelo + "\nCapacidade total do tanque: " + capacidadeTanque + "\nConsumo do por litro: " + consumoPorLitro + "\nAutonomia: " + calculaAutonomia();
    }

}
