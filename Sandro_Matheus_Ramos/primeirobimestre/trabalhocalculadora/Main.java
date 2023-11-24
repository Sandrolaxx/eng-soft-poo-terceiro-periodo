package Sandro_Matheus_Ramos.trabalhocalculadora;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.soma(20d, 10d);
        
        System.out.println(calculadora.getUltimoResultado());
        
        calculadora.soma(28d, 32d);
        
        System.out.println(calculadora.getUltimoResultado());
    }
}
