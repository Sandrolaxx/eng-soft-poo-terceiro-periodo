package Sandro_Matheus_Ramos.trabalhocalculadora;

public class Calculadora {

    private Double ultimoResultado;

    public Double getUltimoResultado() {
        return ultimoResultado;
    }

    public Double soma(Double valorUm, Double valorDois) {
        Double resultado = valorUm + valorDois;

        ultimoResultado = resultado;

        return resultado;
    }

    public Double subtracao(Double valorUm, Double valorDois) {
        Double resultado = valorUm - valorDois;

        ultimoResultado = resultado;

        return resultado;
    }

}
