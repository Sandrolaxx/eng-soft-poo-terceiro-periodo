public class CalculadoraEnc {

    private double a;
    private double b;
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public double subt(double a, double b) {
        return a - b;
    }

    public CalculadoraEnc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double divi(double a, double b) {
        return a / b;
    }
}