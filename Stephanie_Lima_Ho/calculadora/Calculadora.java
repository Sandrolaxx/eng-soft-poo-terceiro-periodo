
public class Calculadora {
     private double numberA;
     private double numberB;

     public double getNumberA() {
          return numberA;
     }

     public void setNumberA(double numberA) {
          this.numberA = numberA;
     }

     public double getNumberB() {
          return numberB;
     }

     public void setNumberB(double numberB) {
          this.numberB = numberB;
     }

     public Calculadora(double numberA, double numberB) {
          this.numberA = numberA;
          this.numberB = numberB;
     }

     public double somar(double numberA, double numberB) {
          return numberA + numberB;
     }

     public double subtrair(double numberA, double numberB) {
          return numberA - numberB;
     }

     public double dividir(double numberA, double numberB) {
          return numberA / numberB;
     }

     public double multiplicar(double numberA, double numberB) {
          return numberA * numberB;
     }
}
