package aula06_trabalho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(numero1, numero2);

        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = calculadora.somar();
                break;
            case 2:
                resultado = calculadora.subtrair();
                break;
            case 3:
                resultado = calculadora.multiplicar();
                break;
            case 4:
                resultado = calculadora.dividir();
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
