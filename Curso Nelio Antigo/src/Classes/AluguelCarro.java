package Classes;

public class AluguelCarro {

    private String marca;
    private String modelo;
    private String placa;
    private double valorAluguel;

    public AluguelCarro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorAluguel = 0; // Inicializa valorAluguel com 0
    }

    public AluguelCarro(String marca, String modelo, String placa, double valorAluguel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorAluguel = valorAluguel;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void calculaValorAluguel(int diasAlugados) {
        this.valorAluguel *= diasAlugados;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa;
    }

    public String toString(boolean comValorAluguel) {
        if (comValorAluguel) {
            return "Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nValor do Aluguel: " + valorAluguel;
        } else {
            return toString();
        }
    }
}
