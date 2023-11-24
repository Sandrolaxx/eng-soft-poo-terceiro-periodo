package Gustavo_Sganderla.Aulas.Trabalhos.calculadora;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = calculadora.adicionar(numero1, numero2);
                break;
            case 2:
                resultado = calculadora.subtrair(numero1, numero2);
                break;
            case 3:
                resultado = calculadora.multiplicar(numero1, numero2);
                break;
            case 4:
                try {
                    resultado = calculadora.dividir(numero1, numero2);
                } catch (ArithmeticException e) {
                    System.err.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.err.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
