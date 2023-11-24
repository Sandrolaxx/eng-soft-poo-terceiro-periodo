public class Calculadora {
    
    private double numero1;

    private double numero2;

    public Calculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    void somar() {
        System.out.println(numero1 + numero2);
    }

    void subtrair() {
        System.out.println(numero1 - numero2);
    }

    void dividir() {
        System.out.println(numero1 / numero2);
    }

    void multiplicar() {
        System.out.println(numero1 * numero2);
    }

}
