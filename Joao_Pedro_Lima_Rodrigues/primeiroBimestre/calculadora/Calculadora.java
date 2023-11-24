public class Calculadora {
    
    private double valorUm;

    private double valorDois;
    
    public Calculadora(double valorUm, double valorDois) {
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

    void soma() {
        System.out.println(valorUm + valorDois);
    }

    void subtracao(){
        System.out.println(valorUm - valorDois);
    }

    void multiplicacao(){
        System.out.println(valorUm * valorDois);
    }

    void divisao(){
        System.out.println(valorUm / valorDois);
    }
}
