package Ana_Lunedo.calculadora;

public class Calculadora {
    private double valorUm;
    private double valorDois;

    public Calculadora(double valorUm, double valorDois){
        this.valorUm = valorUm;
        this.valorDois = valorDois;

    }

    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

    public double somar() {
        return valorUm + valorDois;
    }

    public double subtrair() {
        return valorUm - valorDois;
    }

    public double multiplicar() {
        return valorUm * valorDois;
    }

    public double dividir() {
        if (valorDois != 0) {
            return valorUm / valorDois;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de divisão por zero
        }
    }
}