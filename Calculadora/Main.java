import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Insira o primeiro valor:");
        double valor1 = input.nextDouble();

        System.out.println("Insira o segundo valor:");
        double valor2 = input.nextDouble();

        Calculadora calculadora = new Calculadora(valor1, valor2);

        System.out.println("Selecione a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4.  Divisão");

        int escolha = input.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = calculadora.somar();
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calculadora.subtrair();
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar();
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = calculadora.dividir();
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        input.close();
    }
}