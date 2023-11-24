public class CalculadoraObj {
    
    private double valorUm;
    private double valorDois;
    private double ultResultado;

    //botãoDireitoMouse => Source Action;
    //Construtor;Recebe valores;
    public CalculadoraObj(double valorUm, double valorDois) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    //Métodos;Permite que outras partes do programa acessem 
    //os valores das variáveis encapsuladas.
    public double getValorUm() {
        return valorUm;
    }
    public double getValorDois() {
        return valorDois;
    }
    public double getUltResultado() {
        return ultResultado;
    }

    //Métodos;Calcula e retorna o ultResultado.
    public double somar(){
        double resultado = valorUm + valorDois;
        ultResultado = resultado;
        return resultado;
    }
    public double subtrair(){
        double resultado = valorUm - valorDois;
        ultResultado = resultado;
        return resultado;
    } 
    public double multiplicar(){
        double resultado = valorUm * valorDois;
        ultResultado = resultado;
        return resultado;
    }
    public double divisao(){
        double resultado = valorUm / valorDois;
        ultResultado = resultado;
        return resultado;
    }
}