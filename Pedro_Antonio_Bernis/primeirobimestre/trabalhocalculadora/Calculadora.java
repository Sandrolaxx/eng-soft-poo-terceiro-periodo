package trabalhocalculadora;

    public class Calculadora {

    private double valorUm;
    private double valorDois;
    private double ultimoResultado;
    
    public Calculadora(double valorUm, double valorDois){
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    public double getValorUm() {
        return valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public double getUltimoResultado() {
        return ultimoResultado;
    }

    public double somar() {
        ultimoResultado = valorUm + valorDois;
        return ultimoResultado;
    }

    public double subtrair() {
        ultimoResultado = valorUm - valorDois;
        return ultimoResultado;
    }

    public double multiplicar() {
        ultimoResultado = valorUm * valorDois;
        return ultimoResultado;
    }

    public double dividir() {
        ultimoResultado = valorUm / valorDois;
        return ultimoResultado;
    }

}