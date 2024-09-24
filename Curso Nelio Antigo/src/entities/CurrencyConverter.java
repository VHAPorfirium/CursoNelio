package entities;

public class CurrencyConverter {

    public double cotacaoDolar, dolaresComprar;



    public double conversao() {

        return (cotacaoDolar * dolaresComprar) * 1.06;

    }

}
