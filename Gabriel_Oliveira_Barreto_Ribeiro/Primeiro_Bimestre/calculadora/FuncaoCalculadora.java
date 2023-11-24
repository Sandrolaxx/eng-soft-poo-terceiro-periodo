package Gabriel_Oliveira_Barreto_Ribeiro.calculadora;

public class FuncaoCalculadora {
     private double a;
     private double b;

     public double getA() {
          return a;
     }

     public void setA(double a) {
          this.a = a;
     }

     public double getB() {
          return b;
     }

     public void setB(double b) {
          this.b = b;
     }

     public FuncaoCalculadora(double a, double b) {
          this.a = a;
          this.b = b;
     }

     public double somar(double a, double b) {
          return a + b;
     }

     public double subtrair(double a, double b) {
          return a - b;
     }

     public double dividir(double a, double b) {
          return a / b;
     }

     public double multiplicar(double a, double b) {
          return a * b;
     }
}
